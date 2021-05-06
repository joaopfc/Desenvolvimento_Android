package joaopfc.appminhaideiadb.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import joaopfc.appminhaideiadb.R;
import joaopfc.appminhaideiadb.api.AppUtil;
import joaopfc.appminhaideiadb.controller.ClienteController;
import joaopfc.appminhaideiadb.model.Cliente;

public class MainActivity extends AppCompatActivity {

    ClienteController clienteController;
    Cliente obj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(AppUtil.TAG, "onCreate: App Minha DataBase");

        clienteController = new ClienteController(getApplicationContext());
        for (int i = 0; i < 49; i++) {

            obj = new Cliente();
            obj.setNome("João Paulo Faria de Carvalho"+i);
            obj.setEmail(i+"joao_Paulo@gmail.com");

            clienteController.incluir(obj);
        }

        for (Cliente obj : clienteController.listar()) {
            Log.e("Retorno", "onCreate: " + obj.getId() + " " + obj.getNome() + " " + obj.getEmail());
        }
    }
}