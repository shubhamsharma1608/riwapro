package shubham.sharma.ri12;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class cars24 extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cars24);
        AlertDialog.Builder builder=new AlertDialog.Builder(cars24.this);
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
                    Intent intent=new Intent(cars24.this,car.class);
                    startActivity(intent);
                 }
            }
        });
    }

}
