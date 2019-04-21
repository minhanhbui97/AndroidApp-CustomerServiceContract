package txstate.edu.amb309.customerapp;

import android.app.ListActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends ListActivity {

    int[] intIDs = {101, 102, 103, 104, 105};
    String[] strFirstNames = {"John", "Peter", "Sam", "Anna", "Jacob"};
    String[] strLastNames = {"Wilson", "Smith", "Will", "Anderson", "Billy"};
    int[] intAges = {17, 19, 30, 15, 23};
    String[] strType = {"R", "C", "C", "R", "R"};

    List<Customer> customersList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        customersList = new ArrayList<Customer>();
        for(int i = 0; i < strLastNames.length; i++){
            Customer aCustomer = new Customer(intIDs[i], strFirstNames[i], strLastNames[i], intAges[i], strType[i]);
            customersList.add(aCustomer);
        }

        setListAdapter(new ArrayAdapter<Customer>(MainActivity.this, R.layout.activity_main, R.id.txtLastNameAndID, customersList));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        //super.onListItemClick(l, v, position, id);
        Customer selectedCustomer = customersList.get(position);
        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(MainActivity.this);
        SharedPreferences.Editor editor = sharedPref.edit();

        editor.putInt("id", selectedCustomer.getId());
        editor.putString("firstName", selectedCustomer.getFirstName());
        editor.putString("lastName", selectedCustomer.getLastName());
        editor.putInt("age", selectedCustomer.getAge());
        editor.putString("type", selectedCustomer.getType());
        editor.commit();

        if(selectedCustomer.getAge()<18){
            Toast.makeText(MainActivity.this, "You cannot sign a service contract!", Toast.LENGTH_LONG).show();
        } else{
            startActivity(new Intent(MainActivity.this, CustomerInfoActivity.class));
        }
    }
}
