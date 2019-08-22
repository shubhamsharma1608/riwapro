package shubham.sharma.ri12;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;
import com.google.firebase.firestore.core.DocumentViewChange;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.annotation.Nullable;

import static shubham.sharma.ri12.riskovery.user1;

public class Lead extends AppCompatActivity {
    static FirebaseFirestore db;
    FirebaseFirestore db1=FirebaseFirestore.getInstance();
    private CollectionReference data1= (CollectionReference) db1.collection("Lead");
   // final JSONArray arr = new JSONArray();
  //  ListView list;
   String data="";
    //TextView textView;
    TextView textView1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lead);
        db = FirebaseFirestore.getInstance();
        textView1 = findViewById(R.id.tv1);
        loaddata();
    }

    @Override
    protected void onStart() {
        super.onStart();
        //Log.d("rty",""+user1);
        data1.addSnapshotListener(this, new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots, @Nullable FirebaseFirestoreException e) {
                if(e!=null)
                {
                    return;
                }
                //String data="";
                for(QueryDocumentSnapshot documentSnapshot : queryDocumentSnapshots)
                {
                    Load load =documentSnapshot.toObject(Load.class);
                    String name=load.getName();
                    String phone=load.getPhone();
                    String product=load.getProduct();
                    data +="name :"+name +"\nphone :"+phone +"\nproduct :" +product + "\n\n";
                    Log.d("wq","data");
                    textView1.setText(data);
                }
            }
        });

    }

    public void loaddata()
    {
        data1.whereEqualTo(String.valueOf(user1),user1)
                .get()
                .addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
            @Override
            public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                //String data="";
                for(QueryDocumentSnapshot documentSnapshot : queryDocumentSnapshots)
                {
                    Load load=documentSnapshot.toObject(Load.class);
                    String name=load.getName();
                    String phone=load.getPhone();
                    String product=load.getProduct();
                    data +="Name :"+name + "\n phone :"+phone+"\n product :"+product+"\n\n";
                    Log.d("qw","data"+data);
                    textView1.setText(data);
                }
            }
        });
    }
}
