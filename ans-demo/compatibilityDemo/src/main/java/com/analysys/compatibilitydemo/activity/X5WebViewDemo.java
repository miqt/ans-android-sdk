package com.analysys.compatibilitydemo.activity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.analysys.AnalysysAgent;
import com.analysys.compatibilitydemo.R;
import com.tencent.smtt.sdk.WebChromeClient;
import com.tencent.smtt.sdk.WebView;
import com.tencent.smtt.sdk.WebViewClient;

public class X5WebViewDemo extends AppCompatActivity {

    WebView x5WebView;
    Context mContext = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_x5_web_view_demo);
        webView();
    }

    private void webView() {
        x5WebView = (WebView) findViewById(R.id.forum_context);
        x5WebView.loadUrl("http://uc.analysys.cn/huaxiang/hybrid-4.3.0.10/");
        x5WebView.setWebViewClient(new MyWebviewClient());
        x5WebView.getSettings().setJavaScriptEnabled(true);
        x5WebView.setWebChromeClient(new WebChromeClient());
        x5WebView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        AnalysysAgent.setHybridModel(mContext, x5WebView);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    class MyWebviewClient extends WebViewClient {

        @Override
        public void onPageFinished(WebView view, String url) {
            Log.d("analysys.hybrid", "onPageFinished url:" + url);
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            AnalysysAgent.interceptUrl(mContext, url, view);
            return false;
        }
    }
}
