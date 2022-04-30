package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtvw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);
        txtvw = findViewById(R.id.input);
        txtvw.setText("");
    }

    public void zero(View view)
    {
        txtvw.setText(String.format("%s0", txtvw.getText()));
    }

    public void one(View view)
    {
        txtvw.setText(String.format("%s1", txtvw.getText()));
    }

    public void two(View view)
    {
        txtvw.setText(String.format("%s2", txtvw.getText()));
    }

    public void three(View view)
    {
        txtvw.setText(String.format("%s3", txtvw.getText()));
    }

    public void four(View view)
    {
        txtvw.setText(String.format("%s4", txtvw.getText()));
    }

    public void five(View view)
    {
        txtvw.setText(String.format("%s5", txtvw.getText()));
    }

    public void six(View view)
    {
        txtvw.setText(String.format("%s6", txtvw.getText()));
    }

    public void seven(View view)
    {
        txtvw.setText(String.format("%s7", txtvw.getText()));
    }

    public void eight(View view)
    {
        txtvw.setText(String.format("%s8", txtvw.getText()));
    }

    public void nine(View view)
    {
        txtvw.setText(String.format("%s9", txtvw.getText()));
    }

    public void mul(View view)
    {
        txtvw.setText(String.format("%s×", txtvw.getText()));
    }

    public void add(View view)
    {
        txtvw.setText(String.format("%s+", txtvw.getText()));
    }

    public void div(View view)
    {
        txtvw.setText(String.format("%s÷", txtvw.getText()));
    }

    public void sub(View view)
    {
        txtvw.setText(String.format("%s-", txtvw.getText()));
    }

    public void point(View view)
    {
        txtvw.setText(String.format("%s.", txtvw.getText()));
    }

    public void res(View view)
    {
        String result = txtvw.getText().toString();
        double final_res;
        String [] add_arr;
        if(result.contains("×"))
        {
            add_arr = result.split("[×]");
            final_res = 1;
            for (String s : add_arr)
            {
                final_res = final_res * Double.parseDouble(s);
            }
            txtvw.setText(Double.valueOf(final_res).toString());
        }
        else if(result.contains("÷"))
        {
            add_arr = result.split("[÷]");
            final_res = Double.parseDouble(add_arr[0]);
            for(int i=1; i<add_arr.length; i++)
            {
                final_res = final_res / Double.parseDouble(add_arr[i]);
            }
            txtvw.setText(Double.valueOf(final_res).toString());
        }
        else if(result.contains("+"))
        {
            add_arr = result.split("[+]");
            final_res = Double.parseDouble(add_arr[0]);
            for(int i=1; i<add_arr.length; i++)
            {
                final_res = final_res + Double.parseDouble(add_arr[i]);
            }
            txtvw.setText(Double.valueOf(final_res).toString());
        }
        else if(result.contains("-"))
        {
            add_arr = result.split("[-]");
            final_res = Double.parseDouble(add_arr[0]);
            for(int i=1; i<add_arr.length; i++)
            {
                final_res = final_res - Double.parseDouble(add_arr[i]);
            }
            txtvw.setText(Double.valueOf(final_res).toString());
        }
    }

    public void back(View view)
    {
        String text = txtvw.getText().toString();
        txtvw.setText(text.substring(0,text.length()-1));
    }

    public void clear(View view)
    {
        txtvw.setText("");
    }
}