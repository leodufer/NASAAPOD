package py.edu.facitec.nasaapod;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class Presentador {

    MainActivity vista;
    RestAdapter restAdapter;

    public Presentador(MainActivity vista) {
        this.vista = vista;
        this.restAdapter =  new RestAdapter
                .Builder()
                .setEndpoint("https://api.nasa.gov/planetary")
                .build();
    }

    public void obtenerDatos(){

        ApodService service = restAdapter.create(ApodService.class);


        service.getApodToday(new Callback<Apod>() {
            @Override
            public void success(Apod apod, Response response) {
                vista.showApod(apod);
            }

            @Override
            public void failure(RetrofitError error) {
                vista.showError(error);
            }
        });
    }
}
