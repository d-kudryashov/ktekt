package main.db.entities;

import main.metersInteractions.ValueType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity(name = "meterData")
public class MeterData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private long id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Meter.class)
    private Meter meter;

    @Column(name = "valueType", nullable = false)
    @Enumerated(EnumType.STRING)
    private ValueType valueType;

    @Column(name = "value")
    private double value;

    @Column(name = "time", nullable = false)
    private Date dateTime;

    public MeterData() {
    }

    public MeterData(Meter meter, ValueType valueType, double value, Date dateTime) {
        this.meter = meter;
        this.valueType = valueType;
        this.value = value;
        this.dateTime = dateTime;
    }

    public long getId() {
        return id;
    }

    public Meter getMeter() {
        return meter;
    }

    public void setMeter(Meter meter) {
        this.meter = meter;
    }

    public ValueType getValueType() {
        return valueType;
    }

    public void setValueType(ValueType valueType) {
        this.valueType = valueType;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }
}
