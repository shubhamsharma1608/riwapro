package shubham.sharma.ri12;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class HDFC_S extends AppCompatActivity {
CardView cv;
CardView cv1;
CardView cv2;
CardView cv3;
CardView cv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hdfc__s);
        cv=findViewById(R.id.privatecar);
        cv1=findViewById(R.id.twowheeler);
        cv2=findViewById(R.id.goods);
        cv3=findViewById(R.id.passenger);
        cv4=findViewById(R.id.miscellaneous);
        cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HDFC_S.this,hdfc_private_car.class);
                startActivity(intent);
            }
        });

    }
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.dashboard, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.menu_home)
        {
            Intent intent = new Intent(HDFC_S.this,dashboard.class);
            startActivity(intent);
        }
        if (id == R.id.menu_buynow)
        {
            Intent intent = new Intent(HDFC_S.this,buy_now.class);
            startActivity(intent);
        }
        if (id == R.id.menu_lead)
        {
            Intent intent = new Intent(HDFC_S.this,Lead.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}
