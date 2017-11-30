package apps.nieke.org.papas60er;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.Spinner;

class Lock extends AppCompatActivity implements View.OnClickListener {

    private NumberPicker firstDigitPicker;
    private NumberPicker secondDigitPicker;
    private NumberPicker thirdDigitPicker;

    private Spinner unit;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lock);

        firstDigitPicker = findViewById(R.id.numberPicker_first_digit);
        firstDigitPicker.setMinValue(0);
        firstDigitPicker.setMaxValue(9);
        secondDigitPicker = findViewById(R.id.numberPicker_second_digit);
        secondDigitPicker.setMinValue(0);
        secondDigitPicker.setMaxValue(9);
        thirdDigitPicker = findViewById(R.id.numberPicker_third_digit);
        thirdDigitPicker.setMinValue(0);
        thirdDigitPicker.setMaxValue(9);

        unit = findViewById(R.id.spinner_unit);

        Button button = findViewById(R.id.button_solve);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int firstDigit = firstDigitPicker.getValue();
        int secondDigit = secondDigitPicker.getValue();
        int thirdDigit = thirdDigitPicker.getValue();

        Object selectedUnit = unit.getSelectedItem();
        String unitString = "";
        if(selectedUnit instanceof String) {
            unitString = (String) selectedUnit;
        }

        if(firstDigit == 0 && secondDigit == 0 && thirdDigit == 9 && unitString.equals("Monat")) {
            // TODO create solution screen
        }
    }
}
