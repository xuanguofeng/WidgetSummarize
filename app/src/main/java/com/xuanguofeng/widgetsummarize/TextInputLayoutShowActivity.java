package com.xuanguofeng.widgetsummarize;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class TextInputLayoutShowActivity extends AppCompatActivity {

    private TextInputLayout textInputLayout;
    private EditText mobile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_input_layout_show);
        textInputLayout = (TextInputLayout) findViewById(R.id.textInputLayout);
        mobile = (EditText) findViewById(R.id.mobile);

        textInputLayout.setError("这是textInputLayout的错误提示");
        mobile.setError("这是EditText的错误提示");


    }
}
