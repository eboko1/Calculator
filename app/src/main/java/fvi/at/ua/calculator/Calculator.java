package fvi.at.ua.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class Calculator extends AppCompatActivity {

    private TextView screen;
    private String display = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        screen = (TextView)findViewById(R.id.textView);
        screen.setText(display);
    }


}
