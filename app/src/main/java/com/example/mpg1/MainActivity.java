package com.example.mpg1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button calcBtn = (Button) findViewById(R.id.calcBtn);
        calcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText lastMileageEditText = (EditText) findViewById(R.id.lastMileageEditText);
                EditText currentMileageEditText = (EditText) findViewById(R.id.currentMileageEditText);
                EditText amtPaidEditText = (EditText) findViewById(R.id.amtPaidEditText);
                EditText costGallonEditText = (EditText) findViewById(R.id.costGallonEditText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);


// works for ints but not with any decimal numbers
                double lastMileage = Double.parseDouble(lastMileageEditText.getText().toString());
                double currentMileage = Double.parseDouble(currentMileageEditText.getText().toString());
                double amtPaid = Double.parseDouble(amtPaidEditText.getText().toString());
                double costGallon = Double.parseDouble(costGallonEditText.getText().toString());
                double miles = currentMileage-lastMileage;
                double gallon = amtPaid / costGallon;
                double result = miles / gallon;
                //round to one decimal place
                result = Math.round(result*100.0)/100.0;
                //output = String.format("%.2f", result);
                resultTextView.setText(result + "");
            }
        });
    }
}
