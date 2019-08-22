package shubham.sharma.ri12;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

import static shubham.sharma.ri12.Lead.db;

public class riskovery extends AppCompatActivity {
    TextView bike;
    ///TextView car;
    CardView cardView;
    CardView cv;
    CardView car;
    CardView life;
    //TextView life;
    public static HashMap user1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riskovery);
        bike=findViewById(R.id.bike);
        cardView=findViewById(R.id.health2);
        cv=findViewById(R.id.riso_car);
        car=(CardView) findViewById(R.id.riso_car);
        life=findViewById(R.id.riso_life);
        car.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder=new AlertDialog.Builder(riskovery.this);
                View mview= getLayoutInflater().inflate(R.layout.alertdialogbike, null);
                final EditText mname=mview.findViewById(R.id.alert_name);
                final EditText mphone=mview.findViewById(R.id.alert_phone);
                Button pro=mview.findViewById(R.id.alert_bike);
                builder.setView(mview);
                AlertDialog dialog=builder.create();
                dialog.show();
                pro.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String name=mname.getText().toString();
                        String phone=mphone.getText().toString();
                        Lead.db= FirebaseFirestore.getInstance();
                        Map<String, String> user1=new HashMap<>();
                        user1.put("name",mname.getText().toString());
                        user1.put("phone",mphone.getText().toString());
                        Intent intent=new Intent(riskovery.this,riso_car.class);
                        startActivity(intent);
                    }
                });

            }
        });
        life.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder=new AlertDialog.Builder(riskovery.this);
                View mview= getLayoutInflater().inflate(R.layout.alert_health, null);
                final EditText mname=mview.findViewById(R.id.alert_name);
                final EditText mphone=mview.findViewById(R.id.alert_phone);
                final EditText mproduct=mview.findViewById(R.id.alert_product);
                Button pro=mview.findViewById(R.id.alert_bike);
                builder.setView(mview);
                AlertDialog dialog=builder.create();
                dialog.show();
                pro.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String name=mname.getText().toString();
                        String product=mproduct.getText().toString();
                        String phone=mphone.getText().toString();
                        Map<String,Object> user1=new HashMap<>();
                        user1.put("name",mname.getText().toString());
                        user1.put("product",mproduct.getText().toString());
                        user1.put("phone",mphone.getText().toString());
                        Lead.db=FirebaseFirestore.getInstance();
                        db.collection("Lead")
                                .add(user1)
                                .addOnSuccessListener(


                                        new OnSuccessListener<DocumentReference>() {
                                    @Override
                                    public void onSuccess(DocumentReference documentReference) {
                                        Toast.makeText(riskovery.this, "data added", Toast.LENGTH_SHORT).show();
                                    }
                                })
                                .addOnFailureListener(new OnFailureListener() {
                                    @Override
                                    public void onFailure(@NonNull Exception e) {
                                        Toast.makeText(riskovery.this, "failed"+e, Toast.LENGTH_SHORT).show();
                                    }
                                });


                        Intent intent=new Intent(riskovery.this,riso_life.class);
                        startActivity(intent);
                    }
                });

            }
        });
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//
                AlertDialog.Builder builder=new AlertDialog.Builder(riskovery.this);
                View mview= getLayoutInflater().inflate(R.layout.alert_health, null);
                final EditText mname=mview.findViewById(R.id.alerth_name);
                final EditText mphone=mview.findViewById(R.id.alerth_phone);
                final EditText mproduct=mview.findViewById(R.id.alerth_product);
                Button pro1=mview.findViewById(R.id.alert_bike);
                builder.setView(mview);
                AlertDialog dialog=builder.create();
                dialog.show();
                pro1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String name=mname.getText().toString();
                        String product=mproduct.getText().toString();
                        String phone=mphone.getText().toString();
                        Map<String,Object> user1=new HashMap<>();
                        user1.put("name",mname.getText().toString());
                        user1.put("product",mproduct.getText().toString());
                        user1.put("phone",mphone.getText().toString());
                        Lead.db=FirebaseFirestore.getInstance();
                        db.collection("Lead")
                                .add(user1)
                                .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                                    @Override
                                    public void onSuccess(DocumentReference documentReference) {
                                        Toast.makeText(riskovery.this, "data added", Toast.LENGTH_SHORT).show();
                                    }
                                })
                                .addOnFailureListener(new OnFailureListener() {
                                    @Override
                                    public void onFailure(@NonNull Exception e) {
                                        Toast.makeText(riskovery.this, "failed"+e, Toast.LENGTH_SHORT).show();
                                    }
                                });
                        Intent intent =new Intent(riskovery.this,riso_health.class);
                        startActivity(intent);
                    }
                });

            }
        });


        bike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder=new AlertDialog.Builder(riskovery.this);
                View mview= getLayoutInflater().inflate(R.layout.alertdialogbike, null);
                final EditText mname=mview.findViewById(R.id.alert_name);
                Button pro=mview.findViewById(R.id.alert_bike);
                builder.setView(mview);
                AlertDialog dialog=builder.create();
                dialog.show();
                pro.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String name=mname.getText().toString();
                        //  Toast.makeText(riskovery.this, ""+name, Toast.LENGTH_SHORT).show();
                        Lead.db= FirebaseFirestore.getInstance();
                        //Map<String,Object> =new HashMap<>();
                        user1.put("name",mname.getText().toString());
                        // Toast.makeText(riskovery.this, ""+user, Toast.LENGTH_SHORT).show();
                        db.collection("Lead")
                                .document(String.valueOf(user1)).collection(String.valueOf(user1)).add(user1);
//                                .set(user)
//                                .addOnSuccessListener(new OnSuccessListener<Void>() {
//                                    @Override
//                                    public void onSuccess(Void aVoid) {
//                                        Toast.makeText(riskovery.this, "daa", Toast.LENGTH_SHORT).show();
//                                    }
//                                });
//                                .addOnFailureListener(new OnFailureListener() {
//                                    @Override
//                                    public void onFailure(@NonNull Exception e) {
//                                        Log.d("1","hello"+e);
//                                        //Toast.makeText(riskovery.this, "failed"+e, Toast.LENGTH_LONG).show();
//                                    }
//                                });
                        Intent intent=new Intent(riskovery.this,riso_bike.class);
                        startActivity(intent);
                    }
                });
                cv.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(riskovery.this,riso_car.class);
                        startActivity(intent);
                    }
                });


            }
        });
    }
}