package fvi.at.ua.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Calculator extends AppCompatActivity {
    private static final String INFO_CALC = "calc";
    private TextView tv_display;
    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0,
                    btnEquals, btnClean, btnMultip, btnDiv, btnAdding, btnSubtraction;


    private String display = "";
    private  String operator = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        init();

        tv_display.setText(display);


    }

   public void init(){
       tv_display = (TextView)findViewById(R.id.tv_display);

       btnEquals = (Button)findViewById(R.id.btnEquals);
       btnDiv = (Button)findViewById(R.id.btnDiv);
       btnAdding = (Button)findViewById(R.id.btnAddition);
       btnMultip = (Button)findViewById(R.id.btnMultip);
       btnSubtraction = (Button)findViewById(R.id.btnSub);
       btnClean = (Button)findViewById(R.id.btnClean);

       btn0 = (Button)findViewById(R.id.btn0);
       btn1 = (Button)findViewById(R.id.btn1);
       btn2 = (Button)findViewById(R.id.btn2);
       btn3 = (Button)findViewById(R.id.btn3);
       btn4 = (Button)findViewById(R.id.btn4);
       btn5 = (Button)findViewById(R.id.btn5);
       btn6 = (Button)findViewById(R.id.btn6);
       btn7 = (Button)findViewById(R.id.btn7);
       btn8 = (Button)findViewById(R.id.btn8);
       btn9 = (Button)findViewById(R.id.btn9);
   }

   public void displayClean(View v){
       display = "";
       operator = "";
       displayUpdate();
       Log.i(INFO_CALC, "displayClean() display = " + display + "/n operator " + operator);
   }



    public void onClickNumber(View v) {
        Button btnNum = (Button) v;
            display = display + btnNum.getText().toString();
            displayUpdate();
            Log.i(INFO_CALC, "onClickNumber(View v " + "/////display /+/ number btn//////");
            Log.i(INFO_CALC, "onClickNumber(View v) "  + btnNum.getText().toString());
    }


    public void onClickOperator(View v) {
        Button btnOperator = (Button) v;
        display = display + btnOperator.getText().toString();
        operator = btnOperator.getText().toString();
        displayUpdate();
        Log.i(INFO_CALC, "onClickOperator(View v) " + "/////display /+/ operator btn//////");
        Log.i(INFO_CALC, "onClickOperator(View v) " + btnOperator.getText().toString());
    }

    public void displayUpdate(){
        tv_display.setText(display);
        Log.i(INFO_CALC, "displayUpdate() " + display);
    }

    public double add(String a, String b){
     double num1 = Double.valueOf(a);
     double num2 = Double.valueOf(b);
        return num1 + num2;

    }

}
