package py.edu.facitec.nasaapod;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends AppCompatActivity {
    Presentador presentador;
    TextView titleTextView;
    TextView explanationTextView;
    ProgressBar progressBar;
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presentador = new Presentador(this);

        presentador.obtenerDatos();
        titleTextView = findViewById(R.id.titleTextView);
        explanationTextView = findViewById(R.id.explanationTextView);
        progressBar = findViewById(R.id.progressBar);
        imageView = findViewById(R.id.imageView);
    }

    public void showApod(Apod apod){
        progressBar.setVisibility(View.GONE);
        titleTextView.setText(apod.getTitle());
        titleTextView.setVisibility(View.VISIBLE);
        explanationTextView.setText(apod.getExplanation());
        explanationTextView.setVisibility(View.VISIBLE);
        Picasso.with(this)
                .load(apod.getUrl())
                .into(imageView);
        imageView.setVisibility(View.VISIBLE);
    }

    public void showError(RetrofitError error) {
    //necesario ocultar el progressbar y mostras el msj de error
        progressBar.setVisibility(View.GONE);
        explanationTextView.setText(error.getLocalizedMessage());
        imageView.setImageResource(R.mipmap.ic_launcher);
        explanationTextView.setVisibility(View.VISIBLE);
        imageView.setVisibility(View.VISIBLE);
    }
}
