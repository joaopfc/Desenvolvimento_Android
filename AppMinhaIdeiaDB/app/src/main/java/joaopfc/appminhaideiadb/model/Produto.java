package joaopfc.appminhaideiadb.model;

import android.util.Log;

import joaopfc.appminhaideiadb.api.AppUtil;
import joaopfc.appminhaideiadb.controller.ICrud;

public class Produto{

    private int id;
    private String nome;
    private String fornecedor;

    public String getnome() {
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
