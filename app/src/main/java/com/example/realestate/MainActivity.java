package com.example.realestate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner sp;
    ArrayList<House> houseList = new ArrayList<House>();
    ArrayList<String> houseTitle = new ArrayList<>();

    ImageView houseImg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp = findViewById(R.id.spnhouse);
        houseImg = findViewById(R.id.imghouse);
        fillData();

        //filling the spinner
        ArrayAdapter adp = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item,houseTitle);
        sp.setAdapter(adp);

        sp.setOnItemSelectedListener(this);


    }

    public void fillData() {

        houseList.add(new House(383 ,"tumbalong","tumbalong",875000,"Situated on the 11th floor of the iconic Darling One complex within the Darling Square development. The apartment comes with high quality finishes and provides a unique opportunity to buyer to purchase a property within Sydney's most desirable and vibrant district. Indulge in city living in a well central CBD location, within a stroll to all the attractions/facilities like Chinatown, Darling Harbour, Shopping, Dining, Bars, Universities, Train station and Light rail stops."));
        houseList.add(new House(462 ,"darlingrise","darlingrise",586000,"Situated on the 11th floor of the iconic Darling One complex within the Darling Square development. The apartment comes with high quality finishes and provides a unique opportunity to buyer to purchase a property within Sydney's most desirable and vibrant district. Indulge in city living in a well central CBD location, within a stroll to all the attractions/facilities like Chinatown, Darling Harbour, Shopping, Dining, Bars, Universities, Train station and Light rail stops."));
        houseList.add(new House(232,"kentstreet","kentstreet",687000,"Situated on the 11th floor of the iconic Darling One complex within the Darling Square development. The apartment comes with high quality finishes and provides a unique opportunity to buyer to purchase a property within Sydney's most desirable and vibrant district. Indulge in city living in a well central CBD location, within a stroll to all the attractions/facilities like Chinatown, Darling Harbour, Shopping, Dining, Bars, Universities, Train station and Light rail stops."));
        houseList.add(new House(562 ,"kingstreet","kingstreet",563000,"Situated on the 11th floor of the iconic Darling One complex within the Darling Square development. The apartment comes with high quality finishes and provides a unique opportunity to buyer to purchase a property within Sydney's most desirable and vibrant district. Indulge in city living in a well central CBD location, within a stroll to all the attractions/facilities like Chinatown, Darling Harbour, Shopping, Dining, Bars, Universities, Train station and Light rail stops."));
        houseList.add(new House(771 ,"barrack","barrack",1225000,"Situated on the 11th floor of the iconic Darling One complex within the Darling Square development. The apartment comes with high quality finishes and provides a unique opportunity to buyer to purchase a property within Sydney's most desirable and vibrant district. Indulge in city living in a well central CBD location, within a stroll to all the attractions/facilities like Chinatown, Darling Harbour, Shopping, Dining, Bars, Universities, Train station and Light rail stops."));
        houseList.add(new House(873,"sturt","sturt",2775000,"Situated on the 11th floor of the iconic Darling One complex within the Darling Square development. The apartment comes with high quality finishes and provides a unique opportunity to buyer to purchase a property within Sydney's most desirable and vibrant district. Indulge in city living in a well central CBD location, within a stroll to all the attractions/facilities like Chinatown, Darling Harbour, Shopping, Dining, Bars, Universities, Train station and Light rail stops."));
        houseList.add(new House(258,"spring","spring",245000,"Situated on the 11th floor of the iconic Darling One complex within the Darling Square development. The apartment comes with high quality finishes and provides a unique opportunity to buyer to purchase a property within Sydney's most desirable and vibrant district. Indulge in city living in a well central CBD location, within a stroll to all the attractions/facilities like Chinatown, Darling Harbour, Shopping, Dining, Bars, Universities, Train station and Light rail stops."));
        houseList.add(new House(892 ,"Collins","collins",335000,"Situated on the 11th floor of the iconic Darling One complex within the Darling Square development. The apartment comes with high quality finishes and provides a unique opportunity to buyer to purchase a property within Sydney's most desirable and vibrant district. Indulge in city living in a well central CBD location, within a stroll to all the attractions/facilities like Chinatown, Darling Harbour, Shopping, Dining, Bars, Universities, Train station and Light rail stops."));
        houseList.add(new House(664 ,"margaret","margaret",395000,"Situated on the 11th floor of the iconic Darling One complex within the Darling Square development. The apartment comes with high quality finishes and provides a unique opportunity to buyer to purchase a property within Sydney's most desirable and vibrant district. Indulge in city living in a well central CBD location, within a stroll to all the attractions/facilities like Chinatown, Darling Harbour, Shopping, Dining, Bars, Universities, Train station and Light rail stops."));
        houseList.add(new House(493 ,"swan","swan",2705000,"Situated on the 11th floor of the iconic Darling One complex within the Darling Square development. The apartment comes with high quality finishes and provides a unique opportunity to buyer to purchase a property within Sydney's most desirable and vibrant district. Indulge in city living in a well central CBD location, within a stroll to all the attractions/facilities like Chinatown, Darling Harbour, Shopping, Dining, Bars, Universities, Train station and Light rail stops."));


        for(int i=0;i<houseList.size();i++)
        {
            houseTitle.add(houseList.get(i).getHouseAddress());

        }
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
            int imgId = getResources().getIdentifier(houseList.get(i).getHouseAddress(),"drawable",getPackageName());
            houseImg.setImageResource(imgId);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

}