package com.example.exno1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    public static final String DATE_FORMAT = "dd-MMM-yyyy h:mm a";
    int ch=1;
    int tf=1;
    float font=30;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView t= (TextView) findViewById(R.id.textView);
        Button b1= (Button) findViewById(R.id.button1);
        b1.setOnClickListener(v -> {
            t.setTextSize(font);
            font = font + 5;
            if (font == 50)
                font = 30;
        });
        Button b2= (Button) findViewById(R.id.button2);
        b2.setOnClickListener(v -> {
            switch (ch) {
                case 1:
                    t.setTextColor(Color.RED);
                    break;
                case 2:
                    t.setTextColor(Color.GREEN);
                    break;
                case 3:
                    t.setTextColor(Color.BLUE);
                    break;
                case 4:
                    t.setTextColor(Color.CYAN);
                    break;
                case 5:
                    t.setTextColor(Color.YELLOW);
                    break;
                case 6:
                    t.setTextColor(Color.MAGENTA);
                    break;
            }
            ch++;
            if (ch == 7)
                ch = 1;
        });

        //Changing text style
        Button b3 = (Button) findViewById(R.id.button3);
        b3.setOnClickListener(v -> {
            switch (tf) {
                case 1:
                    t.setTypeface(null, Typeface.BOLD);
                    break;
                case 2:
                    t.setTypeface(null, Typeface.BOLD_ITALIC);
                    break;
                case 3:
                    t.setTypeface(null, Typeface.ITALIC);
                    break;
                case 4:
                    t.setTypeface(null, Typeface.NORMAL);
                    break;
            }
            tf++;
            if(tf == 5){
                tf = 1;
            }

        });

        //Getting current date
        SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT, Locale.getDefault());
        Date today = Calendar.getInstance().getTime();
        String currentDateTime = dateFormat.format(today);
        //Button text
        Button b4 = (Button) findViewById(R.id.button4);
        b4.setText(currentDateTime);
    }

}