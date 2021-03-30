package info.club;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    ImageView imageViewFotoClub;
    TextView textViewNamaClub, textViewInfoClub;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imageViewFotoClub = findViewById(R.id.imageViewFotoCLub);
        textViewNamaClub = findViewById(R.id.textViewNamaClub);
        textViewInfoClub = findViewById(R.id.textViewInfoClub);

        getIncomingExtra();


    }

    private void getIncomingExtra(){

        if(getIntent().hasExtra( "foto_club") && getIntent().hasExtra("nama_club") && getIntent().hasExtra("info_club")){

            String fotoClub = getIntent().getStringExtra("foto_club");
            String namaClub = getIntent().getStringExtra("nama_club");
            String infoClub = getIntent().getStringExtra("info_club");

            setDataActivity(fotoClub, namaClub, infoClub);
        }
    }

    private void setDataActivity(String fotoClub, String namaClub, String infoClub){

        Glide.with( this).asBitmap().load(fotoClub).into(imageViewFotoClub);

        textViewNamaClub.setText(namaClub);
        textViewInfoClub.setText(infoClub);
    }
}