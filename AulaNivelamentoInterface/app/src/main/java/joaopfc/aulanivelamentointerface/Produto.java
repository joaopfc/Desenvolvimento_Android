package joaopfc.aulanivelamentointerface;

import android.util.Log;

public class Produto implements ICrud{

    private static final String TAG = "ICrud";
    private String produto;
    private String fornecedor;

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public void incluir() {
        Log.i(TAG, "incluir: Incluir");
    }

    @Override
    public void alterar() {
        Log.i(TAG, "alterar: Alterar");
    }

    @Override
    public void deletar() {
        Log.i(TAG, "deletar: Deletar");
    }

    @Override
    public void listar() {
        Log.i(TAG, "listar: Listar");
    }
}
