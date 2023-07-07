package br.edu.faeterj;

import java.util.Date;
import java.sql.SQLException;

public class Cliente {
    int id;
    String nome;
    String endereco;
    int postalCode;
    String pais;
    String CPF;
    String passaporte;
    String email;
    Date dataNascimento;

// construtor
    public Cliente(int id, String nome, String endereco, int postalCode, String pais, String CPF, String passaporte, String email, Date dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.postalCode = postalCode;
        this.pais = pais;
        this.CPF = CPF;
        this.passaporte = passaporte;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }

// getters
    public int getId() {return id;}
    public String getNome() {return nome;}
    public String getEndereco() {return endereco;}
    public int getPostalCode() {return postalCode;}
    public String getPais() {return pais;}
    public String getCPF() {return CPF;}
    public String getPassaporte() {return passaporte;}
    public String getEmail() {return email;}
    public Date getDataNascimento() {return dataNascimento;}

 // setters
    public void setId(int id) {this.id = id;}
    public void setNome(String nome) {this.nome = nome;}
    public void setEndereco(String endereco) {this.endereco = endereco;}
    public void setPostalCode(int postalCode) {this.postalCode = postalCode;}
    public void setPais(String pais) {this.pais = pais;}
    public void setCPF(String CPF) {this.CPF = CPF;}
    public void setPassaporte(String passaporte) {this.passaporte = passaporte;}
    public void setEmail(String email) {this.email = email;}
    public void setDataNascimento(Date dataNascimento) {this.dataNascimento = dataNascimento;}


// enviando para DB
public void inserir() throws SQLException {
    // Lógica para inserção no bannco de dados usando um ClienteDAO
    ClienteDB clienteDB = new ClienteDB();
    clienteDB.inserirCliente(this);
}
}