package com.prabhunathan.cs478_hw2_gridview;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
public class CarDealer extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_dealer);
        Bundle bundle = getIntent().getExtras();
        String carIndex = bundle.getString("carDealer");
        String carName=null;
        String D1;
        String D2;
        String D3;
        //textviews - car manufacturer names and dealer names
        TextView txtViewCN = (TextView) findViewById(R.id.textView2);
        TextView txtViewD1 = (TextView) findViewById(R.id.textView3);
        TextView txtViewD2 = (TextView) findViewById(R.id.textView4);
        TextView txtViewD3 = (TextView) findViewById(R.id.textView5);
        switch(carIndex){
            case "0":
                carName="Lamborghini";
                D1="1. Bentley Gold Coast, 834 N Rush Street, Chicago , IL 60611";
                D2="2. Luxury Auto Selection, 4580 N Elston Avenue , Chicago , Il 60630, Ph 8665985042";
                D3="3. Motor Cars by Nuccio, 750 Racquet Club Drive, Addison IL 60101, Ph 554429318";
                break;
            case "1":
                carName="Bugatti";
                D1="1. Gold Coast, 834,N Rush Street, Chicago , IL 60611";
                D2="2. Steve Foley, 100 Skokie Blvd, NOrth Brook, IL 60062";
                D3="3. Bavarian Motors, 27 N May Street, Chicago, IL 60607";
                break;
            case "2":
                carName="Rolls Royce";
                D1="1. Perillos Rolls Royce, 834 N Rush St, Chicago, IL 60611";
                D2="2. Parkward Motors, 209 Cleveland Street, Cary, IL 60013";
                D3="3. Steve Foley Rolls Royce, 100 Skokie Blvd, NOrth Brook, IL 60062";
                break;
            case "3":
                carName="Bentley";
                D1="1. Bentley Gold Coast, 834 N Rush Street, Chicago , IL 60611";
                D2="2. Luxury Auto Selection, 4580 N Elston Avenue , Chicago , Il 60630, Ph 8665985042";
                D3="3. Motor Cars by Nuccio, 750 Racquet Club Drive, Addison IL 60101, Ph 554429318";
                break;
            case "4":
                carName="Aston Martin";
                D1="1. Napleton Aston Martin of Chicago, 1038 N Clark Street,Chicago, IL 60044 ";
                D2="2. Lake Forest SportCars, 990 West north shore drive, Lake Bluff, IL 60044";
                D3="3. Motor Cars by Nuccio, 750 Racquet Club Drive, Addison IL 60101, Ph 554429318";
                break;
            case "5":
                carName="Pagani";
                D1="1. Perillos Pagani, 1035 N Clark St, Chicago, IL 60610";
                D2="2. Bavarian Motors, 27 N May Street, Chicago, IL 60607";
                D3="3. Motor Cars by Nuccio, 750 Racquet Club Drive, Addison IL 60101, Ph 554429318";
                break;
            case "6":
                carName="Mercedes Benz";
                D1="1. Mercedes Benz of Chicago, 1520 west North Avenue,IL 60044, Ph 6739467686 ";
                D2="2. Continental auto sports, 420 East Ogden Avenue, Hindsale IL 60521, Ph 8883168655";
                D3="3. Motor Cars by Nuccio, 750 Racquet Club Drive, Addison IL 60101, Ph 554429318";
                break;
            case "7":
                carName="Maserati";
                D1="1. Gold Coast, 834 N Rush Street, Chicago , IL 60611";
                D2="2. Zeigler Maserati, 210 W Golf Road, Schaumburg, IL 60195";
                D3="3. Maserati of Naperville, 1540 W Ogden Ave, Naperville, IL 60540";
                break;
            case "8":
                carName="Jaguar";
                D1="1. Howard Orlaf Jaguar, 1924 N Paulina Street,Chicago, IL 60622, Ph 773 227 3200 ";
                D2="2. Great Chicago Motors, 1850 N Elston Avenue ,Chicago ,IL 60642, Ph 3122809262";
                D3="3. Imperial Motors, 150 Skokie Highway,Lake Bluff , IL 60044";
                break;
            case "9":
                carName="Porsche";
                D1="1. Great Chicago Motors, 1850 N Elston Avenue ,Chicago ,IL 60642, Ph 3122809262";
                D2="2. Loeber Motors, 4255 W Touhy Avenue, Lincoln Wood, IL 60712, Ph 8476510000";
                D3="3. Motor Cars by Nuccio, 750 Racquet Club Drive, Addison IL 60101, Ph 554429318";
                break;
            default:
                D1=null;
                D2=null;
                D3=null;
                break;
        }
        //Set text - dealer names and manufacturer name
        txtViewCN.setText(carName);
        txtViewD1.setText(D1);
        txtViewD2.setText(D2);
        txtViewD3.setText(D3);

    }
}
