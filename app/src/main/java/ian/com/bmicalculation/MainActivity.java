package ian.com.bmicalculation;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText height,weight;
    private Button bmi;
    private TextView num;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        height = (EditText)findViewById(R.id.height);
        weight = (EditText)findViewById(R.id.weight);
        bmi = (Button)findViewById(R.id.bmi);
        num = (TextView)findViewById(R.id.num);
    }

    public void bmi(View view) {
        float total = (Float.parseFloat(weight.getEditableText().toString()))/(Float.parseFloat(height.getEditableText().toString())*Float.parseFloat(height.getEditableText().toString()));
        num.setText("BMI值為："+Float.toString(total));
    }
}