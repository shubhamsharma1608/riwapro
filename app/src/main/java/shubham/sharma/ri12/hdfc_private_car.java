package shubham.sharma.ri12;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class hdfc_private_car extends AppCompatActivity {
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hdfc_private_car);
        webView=findViewById(R.id.hdfc_private_car);
        webView=findViewById(R.id.riso_bike);
        webView=new WebView(this);
        WebSettings webSettings =webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        setContentView(webView);
        webView.loadUrl("https://www.hdfcergo.com/OnlineProducts/MotorTPLOnline/NewBusiness/CalculatePremium.aspx");
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
