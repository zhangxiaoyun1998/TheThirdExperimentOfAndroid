package com.example.jingmianshitai.application4;



import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.second_activity);

        abc();

        Button button=(Button)findViewById(R.id.button2);

        final EditText editText = (EditText) findViewById(R.id.textTwo); //1111

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String x2 = editText.getText().toString();
                Intent intent=new Intent(SecondActivity.this,MainActivity.class);

                intent.putExtra("name2",x2);
                startActivityForResult(intent,0);

                /*
                Intent intent=getIntent();
                String name=intent.getStringExtra("name");

                //Integer age=intent.getIntExtra("age", 20);
                //intent.putExtra("result","姓名:"+name+" 年龄"+age);
                intent.putExtra("result",name);

                setResult(0,intent);
                finish();
                */

            }
        });



    }

    @Override
    protected void onNewIntent(Intent intent){
        super.onNewIntent(intent);
        setIntent(intent);
        abc();
    }

    private void abc(){
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        Toast.makeText(this,name,Toast.LENGTH_LONG).show();

    }

}
