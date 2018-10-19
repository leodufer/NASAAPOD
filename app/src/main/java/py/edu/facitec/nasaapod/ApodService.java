package py.edu.facitec.nasaapod;

import retrofit.Callback;
import retrofit.http.GET;

public interface ApodService {
    @GET("/apod?api_key=DEMO_KEY")
    void getApodToday(Callback<Apod> callback);
}
