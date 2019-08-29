package shubham.sharma.ri12;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

import static shubham.sharma.ri12.Lead.db;

public class coverfox extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coverfox);
        webView = findViewById(R.id.riso_health);
        webView = new WebView(this);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        setContentView(webView);
        webView.loadUrl("https://www.coverfox.com/user/manage-policies/");
        webView.setWebViewClient(new WebViewClient());
    }

    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }

    }

    @Override
    protected void onStart() {
        super.onStart();
        AlertDialog.Builder builder = new AlertDialog.Builder(coverfox.this);
        View mview = getLayoutInflater().inflate(R.layout.alert_health, null);
        final EditText mname = mview.findViewById(R.id.alert_name);
        final EditText mphone = mview.findViewById(R.id.alert_phone);
        final EditText mproduct = mview.findViewById(R.id.alert_product);
        Button pro = mview.findViewById(R.id.alert_bike);
        builder.setView(mview);
        AlertDialog dialog = builder.create();
//        dialog.setCancelable(false);
        dialog.show();
        pro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = mname.getText().toString();
                String product = mproduct.getText().toString();
                String phone = mphone.getText().toString();
                Map<String, Object> user1 = new HashMap<>();
                user1.put("name", mname.getText().toString());
                user1.put("product", mproduct.getText().toString());
                user1.put("phone", mphone.getText().toString());
                Lead.db = FirebaseFirestore.getInstance();
                db.collection("Lead")
                        .add(user1)
                        .addOnSuccessListener(new OnSuccessListener<DocumentReference>()
                        {
                                    @Override
                                    public void onSuccess(DocumentReference documentReference) {
                                        Toast.makeText(coverfox.this, "data added", Toast.LENGTH_SHORT).show();
                                    }
                                })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(coverfox.this, "failed" + e, Toast.LENGTH_SHORT).show();

                                Intent intent = new Intent(coverfox.this,coverfox.class);
                                startActivity(intent);
                            }
                        });

            }
        });

    }
}