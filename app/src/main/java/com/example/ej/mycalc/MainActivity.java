package com.example.ej.mycalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//need some addition imports
import android.view.View;       //whenever you need to use widgets
import android.widget.Button ;  // using buttons
import android.widget.TextView; //using textview for output (Numbers for calculator)



public class MainActivity extends AppCompatActivity {



    public String sign = "";
    public String total = "";
    public Double tempDouble, tempDouble2 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Buttons 0-9
        Button button1 = (Button)findViewById(R.id.button1);
        Button button2 = (Button)findViewById(R.id.button2);
        Button button3 = (Button)findViewById(R.id.button3);
        Button button4 = (Button)findViewById(R.id.button4);
        Button button5 = (Button)findViewById(R.id.button5);
        Button button6 = (Button)findViewById(R.id.button6);
        Button button7 = (Button)findViewById(R.id.button7);
        Button button8 = (Button)findViewById(R.id.button8);
        Button button9 = (Button)findViewById(R.id.button9);
        Button button0 = (Button)findViewById(R.id.button0);


        //Buttons Clear and Equals
        Button buttonC = (Button)findViewById(R.id.buttonC);
        Button buttonEq = (Button)findViewById(R.id.buttonEq);

        //Arithmetic Buttons
        Button buttonA = (Button)findViewById(R.id.buttonA);
        Button buttonS = (Button)findViewById(R.id.buttonS);
        Button buttonD = (Button)findViewById(R.id.buttonD);
        Button button1M = (Button)findViewById(R.id.buttonM);

        //Event handler for 0
        button0.setOnClickListener(
                //Button 0 interface
                new Button.OnClickListener()
                {
                    //Button 0 CallBack Method
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("0");
                    }
                }
        );

        button1.setOnClickListener(
                //Button 0 interface
                new Button.OnClickListener()
                {
                    //Button 0 CallBack Method
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("1");
                    }
                }
        );

        button2.setOnClickListener(
                //Button 0 interface
                new Button.OnClickListener()
                {
                    //Button 0 CallBack Method
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("2");
                    }
                }
        );

        button3.setOnClickListener(
                //Button 0 interface
                new Button.OnClickListener()
                {
                    //Button 0 CallBack Method
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("3");
                    }
                }
        );

        button4.setOnClickListener(
                //Button 0 interface
                new Button.OnClickListener()
                {
                    //Button 0 CallBack Method
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("4");
                    }
                }
        );


        button5.setOnClickListener(
                //Button 0 interface
                new Button.OnClickListener()
                {
                    //Button 0 CallBack Method
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("5");
                    }
                }
        );


        button6.setOnClickListener(
                //Button 0 interface
                new Button.OnClickListener()
                {
                    //Button 0 CallBack Method
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("6");
                    }
                }
        );


        button7.setOnClickListener(
                //Button 0 interface
                new Button.OnClickListener()
                {
                    //Button 0 CallBack Method
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("7");
                    }
                }
        );

        button8.setOnClickListener(
                //Button 0 interface
                new Button.OnClickListener()
                {
                    //Button 0 CallBack Method
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("8");
                    }
                }
        );
        button9.setOnClickListener(
                //Button 0 interface
                new Button.OnClickListener()
                {
                    //Button 0 CallBack Method
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("9");
                    }
                }
        );


//clear button
        buttonC.setOnClickListener(
                //Button 0 interface
                new Button.OnClickListener()
                {
                    //Button 0 CallBack Method
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.setText("");
                    }
                }
        );
//addition button event handler
        buttonA.setOnClickListener(
                //Button 0 interface
                new Button.OnClickListener()
                {
                    //Button 0 CallBack Method
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        tempDouble = Double.parseDouble(output.getText().toString());
                        output.setText("");
                        sign = "+";
                    }
                }
        );

        //subtraction button event handler
        buttonS.setOnClickListener(
                //Button 0 interface
                new Button.OnClickListener()
                {
                    //Button 0 CallBack Method
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        tempDouble = Double.parseDouble(output.getText().toString());
                        output.setText("");
                        sign = "-";
                    }
                }
        );


        //multiplication button event handler
        button1M.setOnClickListener(
                //Button 0 interface
                new Button.OnClickListener()
                {
                    //Button 0 CallBack Method
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        tempDouble = Double.parseDouble(output.getText().toString());
                        output.setText("");
                        sign = "*";
                    }
                }
        );


        //divide button event handler
        buttonD.setOnClickListener(
                //Button 0 interface
                new Button.OnClickListener()
                {
                    //Button 0 CallBack Method
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        tempDouble = Double.parseDouble(output.getText().toString());
                        output.setText("");
                        sign = "/";
                    }
                }
        );


        buttonEq.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        tempDouble2= Double.parseDouble(output.getText().toString());

                        if(sign == "+"){
                            output.setText(Double.toString(tempDouble + tempDouble2 ));
                        }
                        else if (sign == "-"){
                            output.setText(Double.toString(tempDouble + tempDouble2));
                        }
                        else if (sign == "*"){
                            output.setText(Double.toString(tempDouble * tempDouble2));
                        }
                        else if (sign == "/"){
                            if (tempDouble2 == 0)
                            {
                                //Cannot divide Zero. Arithmetic error
                                output.setText("Cannot divide by Zero");
                            }
                            else
                            {
                                output.setText(Double.toString(tempDouble / tempDouble2));
                            }
                        }

                        //reset the sign variable after operation
                        sign = "";

                    }
                }
        );




    }
}
