package com.android.iunoob.bloodbank.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.android.iunoob.bloodbank.R;

import static com.android.iunoob.bloodbank.R.*;

public class web1Activity extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web1);

        webView=(WebView)findViewById(R.id.webview);
        WebSettings webSettings = webView.getSettings();

        webView.getSettings().setJavaScriptEnabled(true);

        webView.loadUrl("http://mahasbtc.org/sbtc/blood-stock/?dt=0&&gr=0");
        webView.setWebViewClient(new WebViewClient());



    }


    }
