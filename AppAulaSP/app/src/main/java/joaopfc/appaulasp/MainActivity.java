package joaopfc.appaulasp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "App_Aula_SP" ;
    private static final String PREF_NOME = "App_aulaSP_pref";
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor dados;

    String nomeProduto;
    int codigoProduto;
    float precoProduto;
    boolean estoque;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "onCreate: Running.....");

        sharedPreferences = getSharedPreferences(PREF_NOME, Context.MODE_PRIVATE);

        Log.i(TAG, "onCreate: Pasta Criada no Diretorio do Celular");

        dados = sharedPreferences.edit();
        nomeProduto = "Notebook";
        codigoProduto = 12345;
        precoProduto = 997.97f;
        estoque = true;

        Log.i(TAG, "onCreate: Dados que vão ser salvos");
        Log.i(TAG, "onCreate: Produto:"+nomeProduto);
        Log.i(TAG, "onCreate: Codigo do Produto: "+codigoProduto);
        Log.i(TAG, "onCreate: Preço do Produto: "+precoProduto);
        Log.i(TAG, "onCreate: Tem no Estoque: "+estoque);

        dados.putString("nomeProduto",nomeProduto);
        dados.putInt("codigoProduto",codigoProduto);
        dados.putFloat("precoProduto",precoProduto);
        dados.putBoolean("estoque",estoque);

        dados.apply();
    }
}