package com.example.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtname,txtbirthdate,txtemail,txtcontact,txtadd,txtdegree,txtclg,txtpass,txtscore,txtla1,txtla2,txtla3,txthobby1,txthobby2,txthobby3,txtskill1,txtskill2,txtskill3,txtobj;

    Button  btnsumbit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtname = findViewById(R.id.txtname);
        txtbirthdate = findViewById(R.id.txtbirthdate);
        txtemail = findViewById(R.id.txtemail);
        txtcontact = findViewById(R.id.txtcontact);
        txtadd = findViewById(R.id.txtadd);
        txtdegree = findViewById(R.id.txtdegree);
        txtclg = findViewById(R.id.txtclg);
        txtpass = findViewById(R.id.txtpass);
        txtscore = findViewById(R.id.txtscore);
        txtla1 = findViewById(R.id.txtla1);
        txtla2 = findViewById(R.id.txtla2);
        txtla3 = findViewById(R.id.txtla3);
        txthobby1 = findViewById(R.id.txthobby1);
        txthobby2 = findViewById(R.id.txthobby2);
        txthobby3 = findViewById(R.id.txthobby3);
        txtskill1 = findViewById(R.id.txtskill1);
        txtskill2 = findViewById(R.id.txtskill2);
        txtskill3 = findViewById(R.id.txtskill3);
        txtobj = findViewById(R.id.txtobj);
        btnsumbit = findViewById(R.id.btnsumbit);

        btnsumbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = txtname.getText().toString();
                String birthdate = txtbirthdate.getText().toString();
                String email = txtemail.getText().toString();
                String contact = txtcontact.getText().toString();
                String add = txtadd.getText().toString();
                String degree = txtdegree.getText().toString();
                String collage = txtclg.getText().toString();
                String passing = txtpass.getText().toString();
                String score = txtscore.getText().toString();
                String language1 = txtla1.getText().toString();
                String language2 = txtla2.getText().toString();
                String language3 = txtla3.getText().toString();
                String hobby1 = txthobby1.getText().toString();
                String hobby2 = txthobby2.getText().toString();
                String hobby3 = txthobby3.getText().toString();
                String skill1 = txtskill1.getText().toString();
                String skill2 = txtskill2.getText().toString();
                String skill3 = txtskill3.getText().toString();
                String objective = txtobj.getText().toString();

                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("name", name);
                intent.putExtra("birthdate", birthdate);
                intent.putExtra("email", email);
                intent.putExtra("contact", contact);
                intent.putExtra("add", add);
                intent.putExtra("degree", degree);
                intent.putExtra("collage", collage);
                intent.putExtra("passing", passing);
                intent.putExtra("score", score);
                intent.putExtra("language1", language1);
                intent.putExtra("language2", language2);
                intent.putExtra("language3", language3);
                intent.putExtra("hobby1", hobby1);
                intent.putExtra("hobby2", hobby2);
                intent.putExtra("hobby3", hobby3);
                intent.putExtra("skill1", skill1);
                intent.putExtra("skill2", skill2);
                intent.putExtra("skill3", skill3);
                intent.putExtra("objective", objective);

                startActivity(intent);

            }
        });

    }
}