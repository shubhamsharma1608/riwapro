package shubham.sharma.ri12;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
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
}
