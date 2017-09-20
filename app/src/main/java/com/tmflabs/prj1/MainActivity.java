package com.tmflabs.prj1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtText;
    private EditText editText;
    private Button btnButton;

    String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtText = (TextView) findViewById(R.id.txtText);
        editText = (EditText) findViewById(R.id.edEditText);
        btnButton = (Button) findViewById(R.id.btnButton);

        final LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linearLayout);
        final Button btnButton = (Button) findViewById(R.id.btnButton);
        btnButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                LinearLayout.LayoutParams linearParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                TextView txt = new TextView(MainActivity.this);
                txt.setText(editText.getText());
                txt.setLayoutParams(linearParams);
                linearLayout.addView(txt);
                editText.setText("");

            }
        });
    }
}

