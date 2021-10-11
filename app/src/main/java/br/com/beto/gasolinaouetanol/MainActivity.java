package br.com.beto.gasolinaouetanol;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText gasolina, etanol;
    Button calcular;
    TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gasolina = findViewById(R.id.edtTxt1);
        etanol = findViewById(R.id.edtTxt2);
        calcular = findViewById(R.id.btn1);
        resultado = findViewById(R.id.txv3);
        resultado.setText("");
        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (gasolina.getText().toString().isEmpty() || etanol.getText().toString().isEmpty()) {
                    resultado.setText("Preencher todos os campos");
                } else {
                    double gasolina1 = Double.parseDouble(gasolina.getText().toString());
                    double etanol1 = Double.parseDouble(etanol.getText().toString());
                    double result = etanol1 / gasolina1;

                    if (result > 0.7) {
                        resultado.setText("É melhor abastecer com gasolina");
                    } else {
                        resultado.setText("É melhor abastecer com etanol");
                    }

                }
            }
        });
    }
}
