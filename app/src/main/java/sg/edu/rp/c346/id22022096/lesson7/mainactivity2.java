package sg.edu.rp.c346.id22022096.lesson7;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class mainactivity2 extends AppCompatActivity {

    TextView tv;
    ArrayList<String> fruits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("ArrayList");

        fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("durian");

        tv = findViewById(R.id.tv);

        String text = "Fruits\n";
        text += "=====\n";

        for (int i=0; i<fruits.size();i++) {
            //tv.setText(fruits.get(i));
            text += fruits.get(i) + "\n";
        }

        tv.setText(text);
        String theFruit = fruits.get(1);
        fruits.remove(0);
        fruits.set((fruits.size()-1),"dragon fruit");


    }
}


