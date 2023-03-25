package com.esraa.hp.customalertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView,textView1;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.txt1);
        textView1=findViewById(R.id.txt2);
        btn=findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                View v = getLayoutInflater().inflate(R.layout.custom_dialog, null);
                builder.setView(v);
                final EditText editText = v.findViewById(R.id.edit1);
                final EditText editText1 = v.findViewById(R.id.edit2);
                Button confirm = v.findViewById(R.id.confirm);

                final AlertDialog dialog = builder.create();
                dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
                dialog.show();

                confirm.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        textView.setText(editText.getText().toString());
                        textView1.setText(editText1.getText().toString());
                        dialog.dismiss();
                    }
                });
            }
        });



    }
}
