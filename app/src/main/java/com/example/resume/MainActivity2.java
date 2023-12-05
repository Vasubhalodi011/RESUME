package com.example.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {

    ImageView image1, image2, image3, image4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        image1 = findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);
        image3 = findViewById(R.id.image3);
        image4 = findViewById(R.id.image4);

        String name = getIntent().getStringExtra("name");
        String birthdate = getIntent().getStringExtra("birthdate");
        String email = getIntent().getStringExtra("email");
        String contact = getIntent().getStringExtra("contact");
        String add = getIntent().getStringExtra("add");
        String degree = getIntent().getStringExtra("degree");
        String collage = getIntent().getStringExtra("collage");
        String passing = getIntent().getStringExtra("passing");
        String score = getIntent().getStringExtra("score");
        String language1 = getIntent().getStringExtra("language1");
        String language2 = getIntent().getStringExtra("language2");
        String language3 = getIntent().getStringExtra("language3");
        String hobby1 = getIntent().getStringExtra("hobby1");
        String hobby2 = getIntent().getStringExtra("hobby2");
        String hobby3 = getIntent().getStringExtra("hobby3");
        String skill1 = getIntent().getStringExtra("skill1");
        String skill2 = getIntent().getStringExtra("skill2");
        String skill3 = getIntent().getStringExtra("skill3");
        String objective = getIntent().getStringExtra("objective");


        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity2.this, ThirdActivity.class);
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

        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity2.this, ThirdActivity.class);
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

        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity2.this, ThirdActivity.class);
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

        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity2.this, ThirdActivity.class);
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