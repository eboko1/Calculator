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

    }



<Button
    android:id="@+id/button7"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:background="@android:color/holo_purple"
    android:onClick="onClickEquals"
    android:text="7"
    android:layout_weight="1"
    android:textColor="@android:color/background_light"
    android:textSize="30sp" />

        <Button
    android:id="@+id/button8"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:background="@android:color/holo_purple"
    android:onClick="onClickEquals"
    android:text="8"
    android:layout_weight="1"
    android:textColor="@android:color/background_light"
    android:textSize="30sp" />

        <Button
    android:id="@+id/button9"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:background="@android:color/holo_purple"
    android:onClick="onClickEquals"
    android:text="9"
    android:layout_weight="1"
    android:textColor="@android:color/background_light"
    android:textSize="30sp" />

        <Button
    android:id="@+id/buttonMyltip"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:layout_weight="1"
    android:background="@android:color/holo_purple"
    android:onClick="onClickClear"
    android:text=""
    android:textColor="@android:color/background_light"
    android:textSize="30sp" />


}
