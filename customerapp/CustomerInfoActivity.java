//package [your package name here];

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class CustomerInfoActivity extends AppCompatActivity {
    int intId;
    String strFirstName;
    String strLastName;
    int intAge;
    String strType;
    double dblMonthlyFee;
    DecimalFormat currency = new DecimalFormat("$###,###.##");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_info);

        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
        intId = sharedPref.getInt("id", 0);
        strFirstName = sharedPref.getString("firstName", "");
        strLastName = sharedPref.getString("lastName", "");
        intAge = sharedPref.getInt("age", 0);
        strType = sharedPref.getString("type", "");

        TextView txtFullName = findViewById(R.id.txtFullName);
        txtFullName.setText(strFirstName + " " + strLastName);


        Button btnCalculateCost = findViewById(R.id.btnCalculateCost);
        final EditText txtNoOfMonths = findViewById(R.id.txtInputNoOfMonths);
        btnCalculateCost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int intNoOfMonths = Integer.parseInt(txtNoOfMonths.getText().toString());
                if(strType.equals("C")){
                    dblMonthlyFee = 20.25;
                } else{
                    dblMonthlyFee = 11.05;
                }
                double dblTotalCost = intNoOfMonths * dblMonthlyFee;
                Toast.makeText(CustomerInfoActivity.this, "Total contract cost is " + currency.format(dblTotalCost), Toast.LENGTH_LONG).show();
            }
        });
    }
}
