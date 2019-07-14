package com.gmail.alcphase1;

import android.net.http.SslError;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        String andela_url = "https://andela.com/alc/";
        WebView webView;
        webView = (WebView) findViewById(R.id.webview);


        webView.setWebViewClient(new WebViewClient() {

            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {

                handler.proceed();
            }

        });

        webView.getSettings().setJavaScriptEnabled(true);

        webView.loadUrl(andela_url);


    }
}
