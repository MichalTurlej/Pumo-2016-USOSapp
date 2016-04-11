package pl.edu.wat.usos.usosapp.university;

/**
 * Created by Rafal on 2016-04-10.
 */
public class University {
    public int id;
    public final String name;
    public final String url;
    public final String consumerKey;
    public final String consumerSecret;

    public University(int id, String name, String url, String consumerKey, String consumerSecret) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.consumerKey = consumerKey;
        this.consumerSecret = consumerSecret;
    }

    public String getServiceUrl() {
        return url + "/services";
    }
}
