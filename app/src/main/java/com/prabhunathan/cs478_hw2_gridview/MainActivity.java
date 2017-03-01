package com.prabhunathan.cs478_hw2_gridview;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView carsGrid=null;
    Context context;
    String carUrl;
    int carIndex=0;
//Storing Car names and Images in array
    public static String [] carNames={"Lamborghini","Bugatti","Rolls Royce","Bentley","Aston Martin","Pagani","Mercedes Benz","Maserati","Jaguar","Porsche"};
    public static int [] carImages={R.drawable.lamborghini,R.drawable.bugatti,R.drawable.rollsroyce,R.drawable.bentley,R.drawable.astonmartin,R.drawable.pagani,R.drawable.mercedesbenz,R.drawable.maserati,R.drawable.jaguar,R.drawable.porsche};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        carsGrid=(GridView) findViewById(R.id.gridViewMain);
        carsGrid.setAdapter(new CustomAdapter(this, carNames,carImages));
        //Registering gridview for context menu
        this.registerForContextMenu(carsGrid);

    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        //Inflating context menu
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.gridcontextmenu, menu);

    }
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        //getting index position of selected grid item
        carIndex=info.position;
        switch (item.getItemId()) {
            case R.id.view:
                //opening new activity on selecting view image - context menu
                Intent intent2 = new Intent(MainActivity.this, CarBigView2.class);
                intent2.putExtra("carIndex", Integer.toString(carIndex));
                startActivity(intent2);
                return true;
            case R.id.carwebsite:
                //opening website of manufacturer
                switch(Integer.toString(carIndex)){
                    case "0":
                        carUrl = "https://www.lamborghini.com/en-en/";
                        break;
                    case "1":
                        carUrl = "http://www.bugatti.com/home/";
                        break;
                    case "2":
                        carUrl = "https://www.rolls-roycemotorcars.com/en-GB/home.html";
                        break;
                    case "3":
                        carUrl = "https://www.bentleymotors.com/en.html";
                        break;
                    case "4":
                        carUrl = "http://www.astonmartin.com/";
                        break;
                    case "5":
                        carUrl = "http://www.pagani.com/";
                        break;
                    case "6":
                        carUrl = "https://www.mbusa.com/mercedes/index";
                        break;
                    case "7":
                        carUrl = "http://www.maserati.com/maserati/international/en";
                        break;
                    case "8":
                        carUrl = "http://www.jaguarusa.com/index.html";
                        break;
                    case "9":
                        carUrl = "http://www.porsche.com/usa/";
                        break;
                    default:
                        carUrl = "http://www.digitaltrends.com/cars/the-top-ten-most-expensive-cars-in-the-world/";
                        break;

                }
                Uri uri = Uri.parse(carUrl);
                Intent intent3 = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent3);
                return true;
            case R.id.dealer:
                //opening new activity of dealers of manufacturers
                Intent intent4 = new Intent(MainActivity.this, CarDealer.class);
                intent4.putExtra("carDealer", Integer.toString(carIndex));
                startActivity(intent4);
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }
}
