package com.example.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Fourth extends AppCompatActivity {
    TextView txtname, txtbirthdate, txtemail, txtcontact, txtadd, txtdegree, txtclg, txtpass, txtscore, txtla1, txtla2, txtla3,
            txthobby1, txthobby2, txthobby3, txtskill1, txtskill2, txtskill3, txtobj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

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

        Intent intent = getIntent();

        String name = intent.getStringExtra("name");
        String birthdate = intent.getStringExtra("birthdate");
        String email = intent.getStringExtra("email");
        String contact = intent.getStringExtra("contact");
        String add = intent.getStringExtra("add");
        String degree = intent.getStringExtra("degree");
        String collage = intent.getStringExtra("collage");
        String passing = intent.getStringExtra("passing");
        String score = intent.getStringExtra("score");
        String language1 = intent.getStringExtra("language1");
        String language2 = intent.getStringExtra("language2");
        String language3 = intent.getStringExtra("language3");
        String hobby1 = intent.getStringExtra("hobby1");
        String hobby2 = intent.getStringExtra("hobby2");
        String hobby3 = intent.getStringExtra("hobby3");
        String skill1 = intent.getStringExtra("skill1");
        String skill2 = intent.getStringExtra("skill2");
        String skill3 = intent.getStringExtra("skill3");
        String objective = intent.getStringExtra("objective");

        txtname.setText(name);
        txtbirthdate.setText(birthdate);
        txtemail.setText(email);
        txtcontact.setText(contact);
        txtadd.setText(add);
        txtdegree.setText(degree);
        txtclg.setText(collage);
        txtpass.setText(passing);
        txtscore.setText(score);
        txtla1.setText(language1);
        txtla2.setText(language2);
        txtla3.setText(language3);
        txthobby1.setText(hobby1);
        txthobby2.setText(hobby2);
        txthobby3.setText(hobby3);
        txtskill1.setText(skill1);
        txtskill2.setText(skill2);
        txtskill3.setText(skill3);
        txtobj.setText(objective);



    }
}