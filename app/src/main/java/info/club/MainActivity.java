package info.club;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> fotoClub = new ArrayList<>();
    private ArrayList<String> namaClub = new ArrayList<>();
    private ArrayList<String> infoClub = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDataFromInternet();
    }

    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(fotoClub, namaClub, infoClub, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getDataFromInternet(){

        namaClub.add("Chelsea");
        fotoClub.add("https://ricardoandika.files.wordpress.com/2011/01/0309poza1chelsea-fc-logo.png");
        infoClub.add("Club Biru Terbaik Di London");

        namaClub.add("Manchester United");
        fotoClub.add("https://ricardoandika.files.wordpress.com/2011/01/manchester_united_logo1.jpg?w=295&h=298&zoom=2");
        infoClub.add("Club Merah Terbaik Di Manchester");

        namaClub.add("Bayern Munich");
        fotoClub.add("https://ricardoandika.files.wordpress.com/2011/01/bayern-munich-logo.png");
        infoClub.add("Club Terbaik Di Germany");

        namaClub.add("Inter Milan");
        fotoClub.add("https://ricardoandika.files.wordpress.com/2011/01/inter-milan-fc-logo.png");
        infoClub.add("Club Biru Hitam Terbaik Di Italy");

        namaClub.add("Borrussia Dortmund");
        fotoClub.add("https://profilklub.files.wordpress.com/2013/05/borussia-dortmund-profil-lengkap.png");
        infoClub.add("Club Kuning Hitam Terbaik Di Germany");

        namaClub.add("Paris Saint German");
        fotoClub.add("https://profilklub.files.wordpress.com/2013/05/profil-klub-paris-saint-germain-lengkap.jpg");
        infoClub.add("Club Biru Terbaik Di London");

        namaClub.add("Galatasaray");
        fotoClub.add("https://profilklub.files.wordpress.com/2013/05/biodata-lengkap-klub-galatasaray.png");
        infoClub.add("Club Biru Terbaik Di London");

        namaClub.add("Real Madrid");
        fotoClub.add("https://profilklub.files.wordpress.com/2013/05/profil-klub-real-madrid-lengkap.gif?w=214&zoom=2");
        infoClub.add("Club Biru Terbaik Di London");

        namaClub.add("Juventus");
        fotoClub.add("https://profilklub.files.wordpress.com/2013/05/juventus-fc-profil-lengkap.png");
        infoClub.add("Club Biru Terbaik Di London");

        namaClub.add("Liverpool");
        fotoClub.add("https://profilklub.files.wordpress.com/2013/05/profil-klub-liverpool-fc-lengkap.png");
        infoClub.add("Club Biru Terbaik Di London");

        prosesRecyclerViewAdapter();
    }
}