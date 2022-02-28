package com.neocaptainnemo.firstappoffebr28;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "COMPARER";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digit_comparer);

        EditText inputOne = findViewById(R.id.input_one);
        EditText inputTwo = findViewById(R.id.input_two);

        TextView textResult = findViewById(R.id.text_result);

        Button btnCompare = findViewById(R.id.btn_compare);

        btnCompare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String inputOneValue = inputOne.getText().toString();
                String inputTwoValue = inputTwo.getText().toString();

                try {
                    Integer intOne = Integer.valueOf(inputOneValue);
                    Integer intTwo = Integer.valueOf(inputTwoValue);

                    Log.v(TAG, "Input " + intOne + " and " + intTwo);

                    if (intOne.equals(intTwo)) {
                        textResult.setText("Equal");
                    } else {
                        textResult.setText("Not Equal");
                    }
                } catch (NumberFormatException exception) {
                    textResult.setText("Please enter a digit.");
                }
            }
        });
    }
}