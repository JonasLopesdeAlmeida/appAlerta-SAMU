package com.samu;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.samu.Dao.Cadastro;
import com.samu.Dao.CadastroAlertas;
import com.samu.dados.Alertas;
import com.samu.dados.UsuarioApp;

public class MainActivitySegundaTela extends AppCompatActivity {
    private static final int REQUEST_IMAGE_CAPTURE = 1;

    // private ImageView imvFoto;

    ImageView mImageView;
    Button mChooseBtn;
    private EditText edtObservacao;

    private static final int IMAGE_PICK_CODE = 1000;
    private static final int PERMISSION_CODE = 1001;

    private final int GALERIA_IMAGENS = 1;

    //private ImageButton imgbFoto;

    private ImageView RecebeFotoDaGaleria;

    private static final int IMAGEM_INTERNA = 12;

    private Button BaterFoto, PegarFotoGaleria;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_segunda_tela);

        //variavel para referenciar botão do xml de pegar a foto na galeria
        PegarFotoGaleria = (Button) findViewById(R.id.btnImagem);

        //variavel para referenciar ImgaView que vai receber a foto
        RecebeFotoDaGaleria = (ImageView) findViewById(R.id.ivImagem);

        //-------------------------

        //metodo que vai pegar a foto na galeria
        PegarFotoGaleria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(intent, GALERIA_IMAGENS);
            }
        });

        //variavel para referenciar o botao que vai bater a foto
        BaterFoto = (Button) findViewById(R.id.btnFoto);


        //metodo para bater a foto
        BaterFoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dispatchTakePictureIntent();
            }

            private void dispatchTakePictureIntent() {
                Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
                    startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
                }
            }
        });

    }


    //metodo que trata as requisições de bater foto e pegar foto na galeria
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode == RESULT_OK && requestCode == GALERIA_IMAGENS){
            Uri selectedImage = data.getData();

            String [] filePath = {MediaStore.Images.Media.DATA};

            Cursor c = getContentResolver().query(selectedImage, filePath, null, null, null);

            c.moveToFirst();

            int columnIndex = c.getColumnIndex(filePath[0]);

            String picturePath = c.getString(columnIndex);

            c.close();

            Bitmap imagemGaleria = (BitmapFactory.decodeFile(picturePath));

            RecebeFotoDaGaleria.setImageBitmap(imagemGaleria);

        }
    }
    public void cadastrarAlerta(View view){

        final CadastroAlertas Dao =  new CadastroAlertas ();

        final EditText Observacao = findViewById(R.id.edtObservacao);

        final ImageView Foto = findViewById(R.id.ivImagem);


        String observacao = Observacao.getText().toString();
       // byte[] foto = Foto.getF().toString();

        Alertas alertas = new Alertas(observacao);

        Toast.makeText(MainActivitySegundaTela.this,"Observacao: "+alertas.getObservacao(),Toast.LENGTH_SHORT).show();


        Dao.salvar(alertas);

        //startActivity(new Intent(CadAtletasActivity.this,ListaAtletasActivity.class));
//                finish();
        Intent intent = new Intent(this, ListaDeAlertas.class);
        startActivity(intent);




    }

}