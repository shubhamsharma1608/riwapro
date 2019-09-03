package shubham.sharma.ri12;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

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
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_arrow_back_white_24dp);
        actionBar.setDisplayShowHomeEnabled(true);
        cv=findViewById(R.id.privatecar);
        cv1=findViewById(R.id.twowheeler);
        cv2=findViewById(R.id.goods);
        cv3=findViewById(R.id.passenger);
        cv4=findViewById(R.id.miscellaneous);
        cv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder=new AlertDialog.Builder(HDFC_S.this);
                View mview= getLayoutInflater().inflate(R.layout.alertdialogbike, null);
                final EditText mname=mview.findViewById(R.id.alert_name);
                final EditText mphone=mview.findViewById(R.id.alert_phone);
                final EditText mproduct=mview.findViewById(R.id.alert_product);
                final EditText mvechileno=mview.findViewById(R.id.vechileno);
                Button pro=mview.findViewById(R.id.alert_bike);
                builder.setView(mview);
                AlertDialog dialog=builder.create();
                dialog.show();
                pro.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String name=mname.getText().toString();
                        String phone=mphone.getText().toString();
                        String product=mproduct.getText().toString();
                        String vechileno=mvechileno.getText().toString();
                        if(mname.getText().toString().isEmpty()|| mphone.getText().toString().length()>10
                                || mproduct.getText().toString().isEmpty() || mvechileno.getText().toString().isEmpty())
                        {
                            mname.setError("This field cannot be empty");
                            mphone.setError("Phone no should be of 10 digit");
                            mproduct.setError("This field cannot be empty");
                            mvechileno.setError("This field cannot be empty");
                        }
                        else {
                            Lead.db = FirebaseFirestore.getInstance();
                            Map<String, String> user1 = new HashMap<>();
                            user1.put("name", mname.getText().toString());
                            user1.put("phone", mphone.getText().toString());
                            user1.put("product", mproduct.getText().toString());
                            user1.put("vechile no", mvechileno.getText().toString());
                            Intent intent = new Intent(HDFC_S.this, hdfc_miscellaneous.class);
                            startActivity(intent);
                        }
                    }
                });

            }
        });
        cv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder=new AlertDialog.Builder(HDFC_S.this);
                View mview= getLayoutInflater().inflate(R.layout.alertdialogbike, null);
                final EditText mname=mview.findViewById(R.id.alert_name);
                final EditText mphone=mview.findViewById(R.id.alert_phone);
                final EditText mproduct=mview.findViewById(R.id.alert_product);
                final EditText mvechileno=mview.findViewById(R.id.vechileno);
                Button pro=mview.findViewById(R.id.alert_bike);
                builder.setView(mview);
                AlertDialog dialog=builder.create();
                dialog.show();
                pro.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String name=mname.getText().toString();
                        String phone=mphone.getText().toString();
                        String product=mproduct.getText().toString();
                        String vechileno=mvechileno.getText().toString();
                        if(mname.getText().toString().isEmpty()|| mphone.getText().toString().length()>10
                                || mproduct.getText().toString().isEmpty() || mvechileno.getText().toString().isEmpty())
                        {
                            mname.setError("This field cannot be empty");
                            mphone.setError("Phone no should be of 10 digit");
                            mproduct.setError("This field cannot be empty");
                            mvechileno.setError("This field cannot be empty");
                        }
                        else {
                            Lead.db = FirebaseFirestore.getInstance();
                            Map<String, String> user1 = new HashMap<>();
                            user1.put("name", mname.getText().toString());
                            user1.put("phone", mphone.getText().toString());
                            user1.put("product", mproduct.getText().toString());
                            user1.put("vechile no", mvechileno.getText().toString());
                            Intent intent = new Intent(HDFC_S.this, hdfc_passenger.class);
                            startActivity(intent);
                        }
                    }
                });

            }
        });
        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder=new AlertDialog.Builder(HDFC_S.this);
                View mview= getLayoutInflater().inflate(R.layout.alertdialogbike, null);
                final EditText mname=mview.findViewById(R.id.alert_name);
                final EditText mphone=mview.findViewById(R.id.alert_phone);
                final EditText mproduct=mview.findViewById(R.id.alert_product);
                final EditText mvechileno=mview.findViewById(R.id.vechileno);
                Button pro=mview.findViewById(R.id.alert_bike);
                builder.setView(mview);
                AlertDialog dialog=builder.create();
                dialog.show();
                pro.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String name=mname.getText().toString();
                        String phone=mphone.getText().toString();
                        String product=mproduct.getText().toString();
                        String vechileno=mvechileno.getText().toString();
                        if(mname.getText().toString().isEmpty()|| mphone.getText().toString().length()>10
                                || mproduct.getText().toString().isEmpty() || mvechileno.getText().toString().isEmpty())
                        {
                            mname.setError("This field cannot be empty");
                            mphone.setError("Phone no should be of 10 digit");
                            mproduct.setError("This field cannot be empty");
                            mvechileno.setError("This field cannot be empty");
                        }
                        else {
                            Lead.db = FirebaseFirestore.getInstance();
                            Map<String, String> user1 = new HashMap<>();
                            user1.put("name", mname.getText().toString());
                            user1.put("phone", mphone.getText().toString());
                            user1.put("product", mproduct.getText().toString());
                            user1.put("vechile no", mvechileno.getText().toString());
                            Intent intent = new Intent(HDFC_S.this, hdfc_goods.class);
                            startActivity(intent);
                        }
                    }
                });

            }
        });
        cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder=new AlertDialog.Builder(HDFC_S.this);
                View mview= getLayoutInflater().inflate(R.layout.alertdialogbike, null);
                final EditText mname=mview.findViewById(R.id.alert_name);
                final EditText mphone=mview.findViewById(R.id.alert_phone);
                final EditText mproduct=mview.findViewById(R.id.alert_product);
                final EditText mvechileno=mview.findViewById(R.id.vechileno);
                Button pro=mview.findViewById(R.id.alert_bike);
                builder.setView(mview);
                AlertDialog dialog=builder.create();
                dialog.show();
                pro.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String name=mname.getText().toString();
                        String phone=mphone.getText().toString();
                        String product=mproduct.getText().toString();
                        String vechileno=mvechileno.getText().toString();
                        if(mname.getText().toString().isEmpty()|| mphone.getText().toString().length()>10
                                || mproduct.getText().toString().isEmpty() || mvechileno.getText().toString().isEmpty())
                        {
                            mname.setError("This field cannot be empty");
                            mphone.setError("Phone no should be of 10 digit");
                            mproduct.setError("This field cannot be empty");
                            mvechileno.setError("This field cannot be empty");
                        }
                        else {
                            Lead.db = FirebaseFirestore.getInstance();
                            Map<String, String> user1 = new HashMap<>();
                            user1.put("name", mname.getText().toString());
                            user1.put("phone", mphone.getText().toString());
                            user1.put("product", mproduct.getText().toString());
                            user1.put("vechile no", mvechileno.getText().toString());
                            Intent intent = new Intent(HDFC_S.this, hdfc_private_car.class);
                            startActivity(intent);
                        }
                    }
                });

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
