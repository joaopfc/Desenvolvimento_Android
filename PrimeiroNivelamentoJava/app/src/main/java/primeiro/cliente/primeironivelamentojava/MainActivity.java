package primeiro.cliente.primeironivelamentojava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import primeiro.cliente.primeironivelamentojava.model.Cliente;

public class MainActivity extends AppCompatActivity {

    Cliente objCliente;

    String TAG = "Classe_Cliente";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        objCliente = new Cliente("João Paulo", "teste@gmail.com","996956702",23,true);

        Log.i(TAG, "onCreate: Nome: "+ objCliente.getNome());
        Log.i(TAG, "onCreate: Nome: "+ objCliente.getEmail());
        Log.i(TAG, "onCreate: Nome: "+ objCliente.getTelefone());
        Log.i(TAG, "onCreate: Nome: "+ objCliente.getIdade());
        Log.i(TAG, "onCreate: Nome: "+ objCliente.isSexo());
    }
}