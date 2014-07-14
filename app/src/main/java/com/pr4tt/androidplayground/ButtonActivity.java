package com.pr4tt.androidplayground;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class ButtonActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        Intent intent = getIntent();
        logLine(intent.getAction());
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.button, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        return id == R.id.action_settings || super.onOptionsItemSelected(item);
    }

    protected void logLine(String s) {
        EditText editText = (EditText) findViewById(R.id.outputText);
        editText.append(s + "\n");
    }

    protected void clearLog() {
        EditText editText = (EditText) findViewById(R.id.outputText);
        editText.setText("");
    }

    public void runClick(View view) {
        logLine(view.toString());
    }

    public void clearClick(View view) {
        clearLog();
    }
}
