package shubham.sharma.ri12;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class buy_now extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
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
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_arrow_back_white_24dp);
        actionBar.setDisplayShowHomeEnabled(true);
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
//    DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
//    NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
//    ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
//            this, drawer,  R.string.navigation_drawer_open, R.string.navigation_drawer_close);
//        drawer.addDrawerListener(toggle);
//        toggle.syncState();
//        navigationView.setNavigationItemSelectedListener(this);
//

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
    public void setFragmenent(Fragment fragmenent)
    {
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.mainframe,fragmenent);
        fragmentTransaction.commit();
    }
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.dashboard) {
            // Handle the camera action
        } else if (id == R.id.policies) {

        } else if (id == R.id.docs) {

        } else if (id == R.id.profile) {

        } else if (id == R.id.bike) {

        } else if (id == R.id.lead) {
            Intent intent=new Intent(buy_now.this,Lead.class);
            startActivity(intent);

        }
        else if (id == R.id.buy)
        {
            Intent intent =new Intent(buy_now.this,buy_now.class);
            startActivity(intent);
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
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
            Intent intent=new Intent(buy_now.this,dashboard.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.menu_lead)
        {
            Intent intent=new Intent(buy_now.this,Lead.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.menu_buynow)
        {
            Intent intent=new Intent(buy_now.this,buy_now.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
