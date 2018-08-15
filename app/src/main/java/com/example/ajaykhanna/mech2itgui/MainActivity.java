package com.example.ajaykhanna.mech2itgui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    private AutoCompleteTextView collegeName;
    private AutoCompleteTextView uniqueWord;
    private AutoCompleteTextView otherLinks;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        collegeName=findViewById(R.id.collegeName);
        uniqueWord=findViewById(R.id.uniqueWord);
        otherLinks=findViewById(R.id.otherLinks);

        collegeName.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if(b)
                {
                    if(collegeName.getText().toString().trim().length() <2)
                    {
                        collegeName.setError("minimum two characters required");
                    }
                    else
                    {
                        collegeName.setError("");
                    }
                }
            }
        });
        uniqueWord.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if(b)
                {
                    if(uniqueWord.getText().toString().trim().length() <2)
                    {
                        uniqueWord.setError("minimum two characters required");
                    }
                    else
                    {
                        uniqueWord.setError("");
                    }
                }
            }
        });
        otherLinks.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if(b)
                {
                    if(otherLinks.getText().toString().trim().length() <2)
                    {
                        otherLinks.setError("minimum two characters required");
                    }
                    else
                    {
                        otherLinks.setError("");
                    }
                }
            }
        });
    }
}
