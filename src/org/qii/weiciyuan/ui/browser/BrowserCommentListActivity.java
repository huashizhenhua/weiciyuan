package org.qii.weiciyuan.ui.browser;

import android.app.Activity;
import android.os.Bundle;
import org.qii.weiciyuan.R;


/**
 * User: Jiang Qi
 * Date: 12-8-2
 * Time: 下午4:15
 */
public class BrowserCommentListActivity extends Activity {

    private String token = "";
    private String id = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.browsercommentlistactivity_layout);
        token = getIntent().getStringExtra("token");
        id = getIntent().getStringExtra("id");

    }


}