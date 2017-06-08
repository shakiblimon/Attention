package com.example.shakib.attention;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b = (Button)findViewById(R.id.btn_1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder mybuild = new AlertDialog.Builder(MainActivity.this);
                mybuild.setTitle("Attention!");
                mybuild.setMessage("Your are going to this site , if your 18 +");
                mybuild.setIcon(R.drawable.icon);

                mybuild.setPositiveButton("Yes , GO ", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext()," i am going to this site ",Toast.LENGTH_SHORT).show();


                        Intent i = new Intent(MainActivity.this,Main2Activity.class);
                        startActivity(i);

                    }
                });

                mybuild.setNegativeButton("No I won't go there", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    Toast.makeText(getApplicationContext(),"I am not going this site ",Toast.LENGTH_SHORT).show();

                    }
                });

                AlertDialog mydialog = mybuild.create();
                mydialog.show();


            }
        });


    }
}















