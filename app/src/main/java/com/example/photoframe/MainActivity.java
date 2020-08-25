package com.example.photoframe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView titleTextView;
    Button startButton;
    ConstraintLayout newConstraintLayout;
    ImageView pic;
    ImageButton prevButton, nextButton;
    int currentImage=0;
    //0-1-2-3-4-5-6-0-1-2-3-4-5-6

    public void  start (View view){
        titleTextView.setVisibility(View.INVISIBLE);
        startButton.setVisibility(View.INVISIBLE);
        newConstraintLayout.setVisibility(View.VISIBLE);
    }
    public void prev(View view){
        String idX = "pic" + currentImage;
        int x = this.getResources().getIdentifier(idX, "id" ,getPackageName());
        pic = findViewById(x);
        pic.setAlpha(0f);

        currentImage = (currentImage - 1) % 6;
        String idY = "pic" + currentImage;
        int y = this.getResources().getIdentifier(idY, "id" ,getPackageName());
        pic = findViewById(y);
        pic.setAlpha(1f);
    }

    public void next(View view){
        String idX = "pic" + currentImage;
        int x = this.getResources().getIdentifier(idX, "id" ,getPackageName());
        pic = findViewById(x);
        pic.setAlpha(0f);

        currentImage = (currentImage + 1) % 6;
        String idY = "pic" + currentImage;
        int y = this.getResources().getIdentifier(idY, "id" ,getPackageName());
        pic = findViewById(y);
        pic.setAlpha(1f);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titleTextView = (TextView) findViewById(R.id.titleTextView);
        startButton = (Button)findViewById(R.id.startButton);
        newConstraintLayout = (ConstraintLayout)findViewById(R.id.newConstraintLayout);

        prevButton = findViewById(R.id.prevButton);
        nextButton = findViewById(R.id.nextButton);






    }
}
