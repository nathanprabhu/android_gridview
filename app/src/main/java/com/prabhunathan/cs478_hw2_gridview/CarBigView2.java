package com.prabhunathan.cs478_hw2_gridview;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CarBigView2 extends AppCompatActivity {
    private String carUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_big_view2);
        Bundle bundle = getIntent().getExtras();
        String carName=null;
        String carIndex = bundle.getString("carIndex");
        ImageButton imgButton = (ImageButton) findViewById(R.id.carimageButton2);

        switch(carIndex){
            case "0":
                carName="Lamborghini";
                carUrl = "https://www.lamborghini.com/en-en/";
                imgButton.setImageResource(R.drawable.lamborghini);
                break;
            case "1":
                carName="Bugatti";
                carUrl = "http://www.bugatti.com/home/";
                imgButton.setImageResource(R.drawable.bugatti);
                break;
            case "2":
                carName="Rolls Royce";
                carUrl = "https://www.rolls-roycemotorcars.com/en-GB/home.html";
                imgButton.setImageResource(R.drawable.rollsroyce);
                break;
            case "3":
                carName="Bentley";
                carUrl = "https://www.bentleymotors.com/en.html";
                imgButton.setImageResource(R.drawable.bentley);
                break;
            case "4":
                carName="Aston Martin";
                carUrl = "http://www.astonmartin.com/";
                imgButton.setImageResource(R.drawable.astonmartin);
                break;
            case "5":
                carName="Pagani";
                carUrl = "http://www.pagani.com/";
                imgButton.setImageResource(R.drawable.pagani);
                break;
            case "6":
                carName="Mercedes Benz";
                carUrl = "https://www.mbusa.com/mercedes/index";
                imgButton.setImageResource(R.drawable.mercedesbenz);
                break;
            case "7":
                carName="Maserati";
                carUrl = "http://www.maserati.com/maserati/international/en";
                imgButton.setImageResource(R.drawable.maserati);
                break;
            case "8":
                carName="Jaguar";
                carUrl = "http://www.jaguarusa.com/index.html";
                imgButton.setImageResource(R.drawable.jaguar);
                break;
            case "9":
                carName="Porsche";
                carUrl = "http://www.porsche.com/usa/";
                imgButton.setImageResource(R.drawable.porsche);
                break;
            default:
                carUrl = "http://www.digitaltrends.com/cars/the-top-ten-most-expensive-cars-in-the-world/";
                break;

        }

        TextView txtView = (TextView) findViewById(R.id.cartextView2);
        txtView.setText(carName);

        imgButton.setScaleType(ImageView.ScaleType.FIT_XY);
        imgButton.setAdjustViewBounds(true);
        imgButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse(carUrl);
                Intent intent3 = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent3);
            }
        });
    }
}
