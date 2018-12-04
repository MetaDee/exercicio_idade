package com.softwares.gustavoc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ArrayAdapter adapter;
    private ImageView imgSexo;
    private String saudacao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgSexo= findViewById(R.id.imgSexoId);
        
        AdapterView.OnItemSelectedListener escolha= new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String item = spnEstadoCivil.getSelectedItem().toString();
                if(item.equals("Masculino")){
                    imgSexo.setImageResource(R.drawable.male_user);

                    if(!edtNome.getText().toString().isEmpty()){

                        edtNome.setText("Sr. "+edtNome.getText().toString());
                    }


                }else {
                    imgSexo.setImageResource(R.drawable.female_user);

                    if(!edtNome.getText().toString().isEmpty()){

                        edtNome.setText("Sra. "+edtNome.getText().toString());
                    }
                }

                //Toast.makeText(getApplicationContext(), Item, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        };
}
