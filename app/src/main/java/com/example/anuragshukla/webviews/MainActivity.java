package com.example.anuragshukla.webviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webView = (WebView) findViewById(R.id.webView); // find the webView in the xml
        webView.getSettings().setJavaScriptEnabled(true);   // this line will help load websites using javascript
        webView.setWebViewClient(new WebViewClient());  //This helps the website to load in the same app.
        String url = "http://192.168.43.235:8000/anur";
        webView.loadUrl(url);   //loading url (FULL ADDRESS)
    }
}
