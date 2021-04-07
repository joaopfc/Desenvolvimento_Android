package joaopfc.aulanivelamentointerface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Cliente objCliente;
    Produto objProduto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        objCliente = new Cliente();
        objProduto = new Produto();

        objCliente.setNome("João Paulo");
        objCliente.setEmail("joao@teste.com");

        objProduto.setProduto("SSD 120Gb");
        objProduto.setFornecedor("DELL");

        objCliente.incluir();
        objCliente.alterar();

        objProduto.deletar();
        objProduto.listar();

    }
}