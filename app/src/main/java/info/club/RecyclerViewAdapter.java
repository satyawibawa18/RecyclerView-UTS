package info.club;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private ArrayList<String> fotoClub = new ArrayList<>();
    private ArrayList<String> namaClub = new ArrayList<>();
    private ArrayList<String> infoClub = new ArrayList<>();
    private Context context;


    public RecyclerViewAdapter(ArrayList<String> fotoClub, ArrayList<String> namaClub, ArrayList<String> infoClub, Context context) {
        this.fotoClub = fotoClub;
        this.namaClub = namaClub;
        this.infoClub = infoClub;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.desain_layout_adapter, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Glide.with(context).asBitmap().load(fotoClub.get(position)).into(holder.imageViewFotoClub);

        holder.textViewNamaClub.setText(namaClub.get(position));

        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(context, namaClub.get(position), Toast.LENGTH_LONG).show();

                Intent intent = new Intent(context, DetailActivity.class);

                intent.putExtra("foto_club", fotoClub.get(position));
                intent.putExtra("nama_club", namaClub.get(position));
                intent.putExtra("info_club", infoClub.get(position));

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return namaClub.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        CircleImageView imageViewFotoClub;
        TextView textViewNamaClub;
        ConstraintLayout constraintLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewFotoClub = itemView.findViewById(R.id.imageViewFotoCLub);
            textViewNamaClub = itemView.findViewById(R.id.textViewNamaClub);
            constraintLayout = itemView.findViewById(R.id.constraintLayout);
        }
    }
}
