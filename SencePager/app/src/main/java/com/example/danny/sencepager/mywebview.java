package com.example.danny.sencepager;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class mywebview extends ActionBarActivity {
    private  String myUrl;
    private WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.mywebview);
        Intent intent = new Intent();
        Log.e("MyUrl",myUrl);
        myUrl= intent.getStringExtra("searchurl");
        Log.e("MyUrl",myUrl);
        init(myUrl);
//        myWebView =(WebView)findViewById(R.id.mywebview);
//        myWebView.loadUrl("www.baidu.com");
//        myWebView.setWebViewClient(new WebViewClient());
//        WebSettings webSettings =myWebView.getSettings();
//        webSettings.setJavaScriptEnabled(true);
//        myWebView.addJavascriptInterface(new );





//        Intent i =new Intent();
//        myUrl = i.getStringExtra("searchurl");
//        //test = (TextView)findViewById(R.id.test);
//        //test.setText(myUrl);

    }
//    public class WebAppInterface{
//        Context context;
//        WebAppInterface(Context c){
//            context=c;
//        }
//        @JavascriptInterface
//        public void
//    }
private void init(String myUrl){

    Log.e("MyUrl",myUrl);
    webView = (WebView) findViewById(R.id.mywebview);
    //WebView加载web资源
    webView.loadUrl("http://"+myUrl);
    //覆盖WebView默认使用第三方或系统默认浏览器打开网页的行为，使网页用WebView打开
    webView.setWebViewClient(new WebViewClient(){
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            // TODO Auto-generated method stub
            //返回值是true的时候控制去WebView打开，为false调用系统浏览器或第三方浏览器
            view.loadUrl(url);
            return true;
        }
    });
}



    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        webView.goBack();
        return true;
    }
}
