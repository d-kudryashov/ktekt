package main.db.entities;

import javax.persistence.*;

@Entity(name = "meters")
public class Meter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "apiKey", nullable = false, unique = true)
    private String apiKey;

    public Meter() {
    }

    public Meter(String apiKey) {
        this.apiKey = apiKey;
    }

    public int getId() {
        return id;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }
}
