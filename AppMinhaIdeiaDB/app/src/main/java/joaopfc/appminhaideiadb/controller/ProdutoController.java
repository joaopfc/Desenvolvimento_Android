package joaopfc.appminhaideiadb.controller;

import android.content.ContentValues;
import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import joaopfc.appminhaideiadb.datamodel.ClienteDataModel;
import joaopfc.appminhaideiadb.datamodel.ProdutoDataModel;
import joaopfc.appminhaideiadb.datasource.AppDataBase;
import joaopfc.appminhaideiadb.model.Produto;

public class ProdutoController extends AppDataBase implements ICrud<Produto> {

    ContentValues dadoDoObjeto;

    public ProdutoController(Context context) {
        super(context);
    }

    @Override
    public boolean incluir(Produto obj) {

        dadoDoObjeto = new ContentValues();


        dadoDoObjeto.put("fornecedor",obj.getFornecedor());
        return insert(ProdutoDataModel.TABELA, dadoDoObjeto);
    }

    @Override
    public boolean alterar(Produto obj) {

        dadoDoObjeto = new ContentValues();

        dadoDoObjeto.put("id",obj.getId());

        dadoDoObjeto.put("fornecedor",obj.getFornecedor());
        return false;
    }

    @Override
    public boolean deletar(int id) {
        return deleteByID(ProdutoDataModel.TABELA,id);
    }

    @Override
    public List<Produto> listar() {

        List<Produto> lista = new ArrayList<>();


        return lista;
    }
}
