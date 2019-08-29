package shubham.sharma.ri12;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class riso_car extends AppCompatActivity {
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riso_car);
        webView=findViewById(R.id.car_riso);
        webView=new WebView(this);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_arrow_back_white_24dp);
        actionBar.setDisplayShowHomeEnabled(true);
        WebSettings webSettings =webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        setContentView(webView);
        webView.loadUrl("https://www.riskoveryinsurance.com/Home/Car-Insurance");
        webView.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if(webView.canGoBack())
        {
            webView.goBack();
        }
        else{
            super.onBackPressed();
        }

    }
    }

