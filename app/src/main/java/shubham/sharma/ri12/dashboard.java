package shubham.sharma.ri12;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class dashboard extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
TextView textView;
TextView cars24;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("DASHBOARD");

        setSupportActionBar(toolbar);
textView=findViewById(R.id.insure);
cars24=findViewById(R.id.cars);
cars24.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent=new Intent(dashboard.this, cars24.class);
        startActivity(intent);
    }
});
textView.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent=new Intent(dashboard.this,buy_now.class);
        startActivity(intent);
    }
});
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
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
            Intent intent=new Intent(dashboard.this,dashboard.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.menu_lead)
        {
            Intent intent=new Intent(dashboard.this,Lead.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.menu_buynow)
        {
            Intent intent=new Intent(dashboard.this,buy_now.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.dashboard) {
            // Handle the camera action
        } else if (id == R.id.policies) {

        } else if (id == R.id.docs) {

        } else if (id == R.id.profile) {

        } else if (id == R.id.logout)
        {
        Intent intent=new Intent(dashboard.this,Sign_in.class);
        startActivity(intent);
        } else if (id == R.id.lead) {
            Intent intent=new Intent(dashboard.this,Lead.class);
            startActivity(intent);

        }
        else if (id == R.id.buy)
        {
            Intent intent =new Intent(dashboard.this,buy_now.class);
            startActivity(intent);
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
