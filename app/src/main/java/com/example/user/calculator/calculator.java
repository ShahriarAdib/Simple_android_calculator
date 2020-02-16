package com.example.user.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class calculator extends AppCompatActivity {
    EditText number1,number2;
    TextView result;
    Button addi,subtract,multiply,division,answer;

    float num1,num2;
    float res;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        number1=(EditText)findViewById(R.id.editText);
        number2=(EditText)findViewById(R.id.editText2);
        result=(TextView)findViewById(R.id.resultview);
        addi=(Button)findViewById(R.id.add);
        subtract=(Button)findViewById(R.id.sub);
        multiply=(Button)findViewById(R.id.mul);
        division=(Button)findViewById(R.id.div);
        answer = (Button)findViewById(R.id.ans);

        addi.setOnClickListener(new View.OnClickListener()

        {

            @Override
            public void onClick(View v){

                num1=Integer.parseInt(number1.getText().toString());

                num2=Integer.parseInt(number2.getText().toString());


                res=num1+num2;

                result.setText(String.valueOf(res));

            }
        });
        subtract.setOnClickListener(new View.OnClickListener()

        {

            @Override
            public void onClick(View v){

                num1=Integer.parseInt(number1.getText().toString());

                num2=Integer.parseInt(number2.getText().toString());


                res=num1-num2;

                result.setText(String.valueOf(res));

            }
        });
        multiply.setOnClickListener(new View.OnClickListener()

        {

            @Override
            public void onClick(View v){

                num1=Integer.parseInt(number1.getText().toString());

                num2=Integer.parseInt(number2.getText().toString());


                res=num1*num2;

                result.setText(String.valueOf(res));

            }
        });
        division.setOnClickListener(new View.OnClickListener()

        {

            @Override
            public void onClick(View v){


                if(num2==0)
                {
                    result.setText("Error!");
                }
                else
                {
                    num1=Integer.parseInt(number1.getText().toString());

                    num2=Integer.parseInt(number2.getText().toString());


                    res=num1/num2;

                    result.setText(String.valueOf(res));
                }

            }
        });


       answer.setOnClickListener(new View.OnClickListener(){

           public void onClick(View v){

               num1=Integer.parseInt(number1.getText().toString());

               num2=Integer.parseInt(number2.getText().toString());



           }



       });



    }

}
