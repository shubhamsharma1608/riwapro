package shubham.sharma.ri12;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class buy_now extends AppCompatActivity {
String[]selectbuy={"Shop by", "Web Aggregator","ZIP Drive" ,"Standalone Third Party(SATP)"};
webaggregator webaggregator;
zip zip;
sat stand1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_now);
        Spinner spinner= (Spinner) findViewById(R.id.buyp);
        webaggregator =new webaggregator();
        zip =new zip();
        stand1=new sat();
        ArrayAdapter select = new ArrayAdapter(this,android.R.layout.simple_spinner_item,selectbuy);
        select.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(select);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(parent.getItemAtPosition(position).equals("Shop by"))
                {
                }
                if(position==1)
                {
                    setFragmenent(webaggregator);
                 //   Toast.makeText(buy_now.this, ""+position, Toast.LENGTH_SHORT).show();
                }
                if(position==2)
                {
                    setFragmenent(zip);
                }
                if(position==3)
                    setFragmenent(stand1);
            }

            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

    }
    public void setFragmenent(Fragment fragmenent)
    {
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.mainframe,fragmenent);
        fragmentTransaction.commit();
    }
}
