package com.samu.dados;



public class UsuarioApp {


    private String nome;
    private String email;
    private String sexo;
    private String telefone;
    private String  cpf;
    private String senha;

  public UsuarioApp(String nome, String email, String sexo, String telefone, String cpf, String senha) {
    this.nome = nome;
    this.email = email;
    this.sexo = sexo;
    this.telefone = telefone;
    this.cpf = cpf;
    this.senha = senha;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

  @Override
  public String toString() {
    return "UsuarioApp{" +
            "nome='" + nome + '\'' +
            ", email='" + email + '\'' +
            ", sexo='" + sexo + '\'' +
            ", telefone='" + telefone + '\'' +
            ", cpf='" + cpf + '\'' +
            ", senha='" + senha + '\'' +
            '}';
  }
}
