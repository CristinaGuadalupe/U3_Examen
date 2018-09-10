package guzmancom.cristina.myapplication;

import android.os.Bundle;
import android.app.Activity;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends Activity {
    TextView info;
    TextView info1;
    TextView info2;
    TextView info3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        info=(TextView)findViewById(R.id.textView11);
        info1=(TextView)findViewById(R.id.textView12);
        info2=(TextView)findViewById(R.id.textView13);
        info3=(TextView)findViewById(R.id.textView14);

        Bundle bundle=getIntent().getExtras();
        String dato=bundle.getString("Info").toString();
        String dato1=bundle.getString("Info1").toString();
        String dato2=bundle.getString("Info2").toString();
        String dato3=bundle.getString("Info3").toString();
        info.setText(dato);
        info1.setText(dato1);
        info2.setText(dato2);
        info3.setText(dato3);

    }

}
