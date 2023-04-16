package com.example.challenge06;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {
    ProgressBar progressBar;
    EditText editText;
    SeekBar seekBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar=findViewById(R.id.progressBar);
        editText=findViewById(R.id.editText);
        seekBar=findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                //값을 변경시킬때 쓰임, 값을 변경시킬경우 그 값을 progressbar와 text로 나타냄.
                progressBar.setProgress(progress);
                editText.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                //값을 사용자가 터치할때 쓰임

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //터치가 끝났을때 쓰임

            }
        });




    }
}