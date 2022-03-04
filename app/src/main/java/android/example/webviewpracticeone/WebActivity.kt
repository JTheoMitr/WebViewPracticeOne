package android.example.webviewpracticeone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Base64
import android.webkit.WebView

class WebActivity : AppCompatActivity() {
    lateinit var webview:WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)
        webview = findViewById(R.id.webView)
        //webview.loadUrl("http://www.google.com")
  val unencodedHtml =
    "<html><body>'%23' is the percent code for '#' </body><html>";
     val encodedHtml = Base64.encodeToString(unencodedHtml.toByteArray(), Base64.NO_PADDING)
    webview.loadData(encodedHtml, "text/html", "base64")
    }
}