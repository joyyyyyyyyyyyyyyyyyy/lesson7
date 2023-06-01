package sg.edu.rp.c346.id22022096.lesson7;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    String[] fruits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("ArrayList");

        fruits = new String[3];
        fruits[0] = "apple";
        fruits[1] = "banana";
        fruits[2] = "cherry";

        tv = findViewById(R.id.tv);

        String text = "Fruits\n";
        text += "=====\n";

        for (int i=0; i<fruits.length;i++) {
            //tv.setText(fruits.get(i));
            text += fruits[i] + "\n";
        }

        tv.setText(text);

    }
}