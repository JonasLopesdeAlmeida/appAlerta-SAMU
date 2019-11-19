package com.samu;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivitySegundaTela extends AppCompatActivity {
    private static final int REQUEST_IMAGE_CAPTURE = 1;

    // private ImageView imvFoto;

    ImageView mImageView;
    Button mChooseBtn;

    private static final int IMAGE_PICK_CODE = 1000;
    private static final int PERMISSION_CODE = 1001;

    private final int GALERIA_IMAGENS = 1;

    private ImageButton imgbFoto;

    private static final int IMAGEM_INTERNA = 12;

    private Button BaterFoto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_segunda_tela);


    }
}