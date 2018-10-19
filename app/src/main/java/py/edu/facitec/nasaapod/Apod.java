package py.edu.facitec.nasaapod;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class Apod {
    private String title;
    private String explanation;
    private String media_type;
    private String url;
    private String date;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public String getMedia_type() {
        return media_type;
    }

    public void setMedia_type(String media_type) {
        this.media_type = media_type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Apod{" +
                "title='" + title + '\'' +
                ", explanation='" + explanation + '\'' +
                ", media_type='" + media_type + '\'' +
                ", url='" + url + '\'' +
                ", date=" + date +
                '}';
    }
}
