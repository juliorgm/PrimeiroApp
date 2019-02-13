package br.senac.pa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String MENSAGEM = "MENSAGEM";
    private Button btnEnviar;
    private EditText editMensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEnviar = findViewById(R.id.mainBtnEnviar);
        editMensagem = findViewById(R.id.mainEditMensagem);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Intent intent = new Intent(MainActivity.this,
                         DisplayMessageActivity.class);
                 String mensagem = editMensagem.getText().toString();
                 intent.putExtra(MENSAGEM,mensagem);
                 startActivity(intent);
            }
        });
    }
}
