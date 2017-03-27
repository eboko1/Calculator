package fvi.at.ua.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Calculator extends AppCompatActivity {

    private TextView screen;
    private String display = "";
    private  String currentOperator = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        screen = (TextView)findViewById(R.id.textView);
        screen.setText(display);
    }

    public void updateScreen(){
        screen.setText(display);
    }

    public void onClickNumber(View view){
        Button b = (Button) view;
        display = display + b.getText();
        updateScreen();
    }

    public void onClickOperator(View view){
        Button b = (Button) view;
        display = display + b.getText();
        updateScreen();
    }


    public void clear(){
        display = "";
        currentOperator = "";
    }

    public void onClickClear(View view){
        clear();
        updateScreen();
    }

    public  void onClickEquals(View view){

    }

}
