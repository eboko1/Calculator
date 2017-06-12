package fvi.at.ua.calculator;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class Calculator extends AppCompatActivity {
    private static final String INFO_CALC = "calc";
    private  static final String DISPLAY_KEY = "display";

    private TextView tv_display;
    private String display = " ";
    private  String operator = " ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        if (savedInstanceState != null){
            display = savedInstanceState.getString(DISPLAY_KEY);
                  }
        init();

        displayUpdate();
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putString(DISPLAY_KEY, display);
       }


    public void init(){
       tv_display = (TextView)findViewById(R.id.tv_display);
   }

   public void displayClean(View v){
       display = " ";
       operator = " ";
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

    }

    private void displayUpdate(){
        tv_display.setText(display);
        Log.i(INFO_CALC, "displayUpdate() " + display);
        Log.i(INFO_CALC, "base operator = " + operator);
    }

    public double operatorsArithmetic(String a, String b, String operator){
        double x = Double.valueOf(a);
        double y = Double.valueOf(b);

     switch (operator){
         case "%":
             return y/100*x;
         case "+":
             return x + y;
         case "-":
             return x - y;
         case "*":
             return x * y;
         case "÷":
            if(y == 0){
                Toast.makeText(this, "divisions by zero", Toast.LENGTH_SHORT).show();
            }  else {
                 return x / y;
            }

         default: return -1;
     }
    }

    public double operatorsMath(String a, String operator){
        double x = Double.valueOf(a);

        switch (operator){

            case "√":
                return Math.sqrt(x);
            case "^²":
                return x*x ;

            default: return -1;
        }
    }


    public void onClickEquals(View v){

         String[]  operation = display.split("\\" + operator);

        double result;

        if(operation.length == 1){
            Toast.makeText(this, " operation.length == 1", Toast.LENGTH_SHORT).show();
            // enter first sqrt  next   number ----error
            try {
                result = operatorsMath(operation[0], operator);
                tv_display.setText(String.valueOf(result));
            } catch (Exception e){
                Toast.makeText(this, "Exception " + e, Toast.LENGTH_LONG).show();
            }





        } else if (operation.length < 2){
            Toast.makeText(this, "operation.length < 2", Toast.LENGTH_SHORT).show();


        } else {
            result = operatorsArithmetic(operation[0], operation[1], operator);
            String resl = String.valueOf(result);
            tv_display.setText(resl);
        }
    }

}
