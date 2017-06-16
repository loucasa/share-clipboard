package org.jandy.android.shareclipboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mEditBody;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.getSystemService(CLIPBOARD_SERVICE);
        mEditBody = (EditText) findViewById(R.id.to_copy);
    }
}
