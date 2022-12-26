package com.sandipbhattacharya.listviewwithimage;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    /*
    Image Credit:
    Images in this tutorial are originally made by Konpa (under MIT License)
    Link for download: https://devicons.github.io/devicon/
    License: https://github.com/devicons/devicon/blob/master/LICENSE
     */

    // Create a ListView object reference
    ListView lvProgram;
    // Next, prepare your data set. Create two string arrays for program name and program description respectively.
    String[] programName = {"Tunis","Sfax", "Bizerte","Ariana", "Ben arous",
            "Beja", "Gabes", "Manouba", "Zaghouan", "Jandouba", "Gafsa", "Nabeul", "klebia",
            "Mednine", "Monastir", "Sidi bouzid", "Sousse", "Tozeur", "Mehdia", "kasserine", "kef","siliana",
            "kairouan","Tataouine"
    };



//    Additional code
    String[] urls = {"https://goweather.herokuapp.com/weather/tunis",
            "https://goweather.herokuapp.com/weather/sfax",
        "https://goweather.herokuapp.com/weather/bizerte",
        "https://goweather.herokuapp.com/weather/ariana",
        "https://goweather.herokuapp.com/weather/ben%20arous",
        "https://goweather.herokuapp.com/weather/Beja",
        "https://goweather.herokuapp.com/weather/gabes",
        "https://goweather.herokuapp.com/weather/manouba",
        "https://goweather.herokuapp.com/weather/zaghouan",
        "https://goweather.herokuapp.com/weather/jendouba",
        "https://goweather.herokuapp.com/weather/gafsa",
        "https://goweather.herokuapp.com/weather/nabeul",
        "https://goweather.herokuapp.com/weather/klebia",
        "https://goweather.herokuapp.com/weather/mednine",
        "https://goweather.herokuapp.com/weather/monastir",
        "https://goweather.herokuapp.com/weather/sidi%20bouzid",
        "https://goweather.herokuapp.com/weather/sousse",
        "https://goweather.herokuapp.com/weather/touzeur",
        "https://goweather.herokuapp.com/weather/mehdia",
        "https://goweather.herokuapp.com/weather/kasserine",
        "https://goweather.herokuapp.com/weather/kef",
        "https://goweather.herokuapp.com/weather/silana",
        "https://goweather.herokuapp.com/weather/kairouan",
        "https://goweather.herokuapp.com/weather/Tataouine"
            };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Get the handle for ListView
        lvProgram = findViewById(R.id.lvProgram);
        // Specify an adapter and pass context along with all the arrays in constructor
//        ProgramAdapter programAdapter = new ProgramAdapter(this, programName, programImages, programDescription);
        ProgramAdapter programAdapter = new ProgramAdapter(this, programName, urls);

        // Set the adapter with the ListView
        lvProgram.setAdapter(programAdapter);
    }
}