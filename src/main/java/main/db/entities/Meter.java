package main.db.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "meters")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Meter implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "apiKey", nullable = false, unique = true)
    @JsonIgnore
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
