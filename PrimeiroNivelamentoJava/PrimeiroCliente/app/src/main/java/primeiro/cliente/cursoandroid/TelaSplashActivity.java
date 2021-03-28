package primeiro.cliente.cursoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

public class TelaSplashActivity extends AppCompatActivity {

    String TAG = "APP_PRIMEIRO_CLIENTE";
    int tempoDeEspera = 1000 * 15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_splash);
        Log.d(TAG, "onCreate: Tela Splash Carregada");

        trocaTela();
    }

    private void trocaTela() {



        Log.d(TAG, "trocaTela: Mudando a Tela.");
        
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Log.d(TAG, "run: Esperando um Tempo....");

                Intent  trocaDeTela = new Intent(TelaSplashActivity.this, MainActivity.class);
                startActivity(trocaDeTela);
                finish();
            }
        }, tempoDeEspera);
    }
}