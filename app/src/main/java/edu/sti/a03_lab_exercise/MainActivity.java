package edu.sti.a03_lab_exercise;

import android.content.Intent;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE="edu.sti.a03_lab_exercise.MESSAGE";
    public void sendMessage(View view){
        Intent intent = new Intent (this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
