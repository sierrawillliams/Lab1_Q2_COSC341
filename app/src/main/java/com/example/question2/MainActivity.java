package com.example.question2;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Button confirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView priceCalc = (TextView) findViewById(R.id.PriceCalculator);
        confirm = (Button) findViewById(R.id.ConfirmButton);

        String[] items = new String[]{"0", "1", "2", "5", "10", "20"};
        Spinner appleMenu = (Spinner) findViewById(R.id.AppleQuantity);
        ArrayAdapter<String> appleAdapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, items);
        appleMenu.setAdapter(appleAdapter);

        Spinner bananaMenu = (Spinner) findViewById(R.id.BananaQuantity);
        ArrayAdapter<String> bananaAdapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, items);
        bananaMenu.setAdapter(bananaAdapter);

        Spinner orangeMenu = (Spinner) findViewById(R.id.OrangeQuantity);
        ArrayAdapter<String> orangeAdapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, items);
        orangeMenu.setAdapter(orangeAdapter);

        Spinner pearMenu = (Spinner) findViewById(R.id.PearQuantity);
        ArrayAdapter<String> pearAdapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, items);
        pearMenu.setAdapter(pearAdapter);


        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double apple = Double.parseDouble((String)appleMenu.getSelectedItem());
                double banana = Double.parseDouble((String)bananaMenu.getSelectedItem());
                double orange = Double.parseDouble((String)orangeMenu.getSelectedItem());
                double pear = Double.parseDouble((String)pearMenu.getSelectedItem());

                double price = (apple*2.00) + (banana*2.50) + (orange*1.80) + (pear*2.25);
                priceCalc.setText("Price $" + String.format("%.2f",price));
            }
        });
    }
}