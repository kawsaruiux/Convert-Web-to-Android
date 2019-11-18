package com.myproject.kawsarit.convertwebsitetoandroid;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private WebView mywebView;
    private ImageView backArrow, refreshIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mywebView = (WebView) findViewById(R.id.webView);
        backArrow = (ImageView) findViewById(R.id.back_arrow);
        refreshIcon = (ImageView) findViewById(R.id.refresh_icon);

        mywebView.setWebViewClient(new WebViewClient());
        mywebView.getSettings().setJavaScriptEnabled(true);
        mywebView.getSettings().setDomStorageEnabled(true);
        mywebView.setOverScrollMode(WebView.OVER_SCROLL_NEVER);
        mywebView.loadUrl("https://stackoverflow.com/");
    }

    @Override
    public void onBackPressed() {
        if (mywebView.canGoBack()) {
            mywebView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
