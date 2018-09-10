package guzmancom.cristina.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    Button btnSgte;
    EditText enviarNombre;
    EditText enviarApellidoPa;
    EditText enviarApellidoMa;
    EditText enviarUsuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSgte=(Button)findViewById(R.id.btnLogin);
        enviarNombre =(EditText)findViewById(R.id.txtNombre);
        enviarApellidoPa =(EditText)findViewById(R.id.txtApellidoPa);
        enviarApellidoMa =(EditText)findViewById(R.id.txtApellidoMa);
        enviarUsuario =(EditText)findViewById(R.id.txtUsuario);

        btnSgte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("Info",enviarNombre.getText().toString());
                intent.putExtra("Info1",enviarApellidoPa.getText().toString());
                intent.putExtra("Info2",enviarApellidoMa.getText().toString());
                intent.putExtra("Info3",enviarUsuario.getText().toString());
                startActivity(intent);
            }
        });
    }
}
