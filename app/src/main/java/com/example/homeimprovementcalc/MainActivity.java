package com.example.homeimprovementcalc;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText length;
    EditText width;
    EditText height;
    TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        length = (EditText) findViewById(R.id.edit_length);
        width = (EditText) findViewById(R.id.edit_width);
        height = (EditText) findViewById(R.id.edit_height);
        answer = (TextView) findViewById(R.id.txt_answer);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void getCalculate(View v) {

        double x=0;   //double length variable
        double y=0;   //double width variable
        double z=0;   //double height variable

        if(length.getText().length()!= 0)
            x = Double.parseDouble(length.getText().toString());

        if(width.getText().length()!= 0)
            y = Double.parseDouble(width.getText().toString());

        if(height.getText().length()!= 0)
            z = Double.parseDouble(height.getText().toString());

       double k = getArea(x,y);
       String kstr = String.valueOf(k);
       answer.setText(kstr);
    }

    //area of a quadratic
    public double getArea(double x, double y)
    {
        return x*y;
    }

    //volume for a cube/rectangle
    public double getVolume(double x, double y, double z)
    {
        return x*y*z;
    }



}
