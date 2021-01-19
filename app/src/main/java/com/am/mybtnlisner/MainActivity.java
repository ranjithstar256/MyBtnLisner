package com.am.mybtnlisner;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b; //Declaration above main method
    
    Button d;
    EditText e;
    String s;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = findViewById(R.id.button);  /// initial inside main mtd
        
        d= findViewById(R.id.button4);
        e=findViewById(R.id.editTextTextPersonName);
        t=findViewById(R.id.textView2);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=e.getText().toString();
                Toast.makeText(MainActivity.this,s, Toast.LENGTH_SHORT).show();
                t.setText(s);
            }
        });
        
        
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //classnm obj_name = new classnm();
                s=e.getText().toString();
                Intent obj = new Intent(MainActivity.this,MainActivity2.class);
                obj.putExtra("first",s);
                startActivity(obj);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.sp,menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void tuesday(MenuItem item) {
        new AlertDialog.Builder(MainActivity.this)
                .setTitle("Alert!")
                .setMessage("Battery Low!")
                .setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent obj = new Intent(MainActivity.this,MainActivity2.class);
                        startActivity(obj);
                    }
                })

                .setNegativeButton("No",null)
                .setNeutralButton("ABC",null)
                .show();
    }

    public void wed(MenuItem item) {
        Dialog dia = new Dialog(MainActivity.this);
        dia.setContentView(R.layout.customdia);
        dia.show();
    }
}