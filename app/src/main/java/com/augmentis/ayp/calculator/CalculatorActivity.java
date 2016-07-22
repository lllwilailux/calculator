package com.augmentis.ayp.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {

    private Button oneBtn, twoBtn, threeBtn, fourBtn, fiveBtn, sixBtn, sevenBtn, eightBtn, nineBtn, zeroBtn,
                    multiplyBtn, divideBtn, minusBtn, plusBtn, equalBtn, clearBtn ;

    String stringNum = "";
    String stringOpr = "" ;

    int int1 = 0;
    int result = 0;

    boolean a = false;

    private TextView textView2;
    private TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        textView1 = (TextView) findViewById(R.id.textView1);
        textView2 = (TextView) findViewById(R.id.textView2);

        oneBtn = (Button) findViewById(R.id.oneBtn);
        twoBtn = (Button) findViewById(R.id.twoBtn);
        threeBtn = (Button) findViewById(R.id.threeBtn);
        fourBtn = (Button) findViewById(R.id.fourBtn);
        fiveBtn = (Button) findViewById(R.id.fiveBtn);
        sixBtn = (Button) findViewById(R.id.sixBtn);
        sevenBtn = (Button) findViewById(R.id.sevenBtn);
        eightBtn = (Button) findViewById(R.id.eightBtn);
        nineBtn = (Button) findViewById(R.id.nineBtn);
        zeroBtn = (Button) findViewById(R.id.zeroBtn);

        plusBtn = (Button) findViewById(R.id.plusBtn);
        minusBtn = (Button) findViewById(R.id.minusBtn);
        divideBtn = (Button) findViewById(R.id.divideBtn);
        multiplyBtn= (Button) findViewById(R.id.multiplyBtn);

        equalBtn = (Button) findViewById(R.id.equalBtn);
        clearBtn = (Button) findViewById(R.id.clearBtn);


        oneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stringNum = stringNum + 1;
                textView2.setText(stringNum);
            }
        });

        twoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stringNum += 2;
                textView2.setText(stringNum);
            }
        });

        threeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stringNum += 3;
                textView2.setText(stringNum);
            }
        });

        fourBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stringNum += 4;
                textView2.setText(stringNum);
            }
        });

        fiveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stringNum += 5;
                textView2.setText(stringNum);
            }
        });

        sixBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stringNum += 6;
                textView2.setText(stringNum);
            }
        });

        sevenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stringNum += 7;
                textView2.setText(stringNum);
            }
        });

        eightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stringNum += 8;
                textView2.setText(stringNum);
            }
        });

        nineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stringNum += 9;
                textView2.setText(stringNum);
            }
        });

        zeroBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stringNum += "0";
                textView2.setText(stringNum);
            }
        });


        plusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stringOpr += " "+ stringNum + "+" + " ";
                textView1.setText(stringOpr);
                int1 = Integer.parseInt(stringNum);
                result += int1;
                stringNum = "";
            }
        });


        minusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stringOpr += stringNum + " " + "-";
                textView1.setText(stringOpr);
                int1 = Integer.parseInt(stringNum);
                result -= int1;
                stringNum = "";
            }
        });


        divideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stringOpr += stringNum + " " + "/";
                textView1.setText(stringOpr);
                int1 = Integer.parseInt(stringNum);

                if (a) {
                result = result / int1;
                } else {
                    result = int1;
                    a = true;
                }
                stringNum = "";
            }
        });


        multiplyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stringOpr += stringNum + " " + "*";
                textView1.setText(stringOpr);
                int1 = Integer.parseInt(stringNum);

                if (a){
                result = result * int1;
                } else {
                    result = int1;
                    a = true;}
                stringNum = "";
            }
        });


        equalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView2.setText(Integer.toString(result));
            }
        });


        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stringNum = "";
                result = 0;
                int1 = 0;
                stringOpr = "";
                textView1.setText("");
                textView2.setText("");
                a = false;
            }
        });


    }

}