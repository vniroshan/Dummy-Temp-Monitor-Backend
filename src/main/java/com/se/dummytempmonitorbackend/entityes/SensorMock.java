package com.se.dummytempmonitorbackend.entityes;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="sensors_mock")
@IdClass(SensorMockId.class)
public class SensorMock {

    @Id
    private String sensor_id;
    @Id
    private String date;
    private String data_value;



    public SensorMock(String sensor_id, String date, String data_value) {
        this.sensor_id = sensor_id;
        this.date = date;
        this.data_value = data_value;
    }

    public SensorMock() {

    }

    public String getSensor_id() {
        return sensor_id;
    }

    public void setSensor_id(String sensor_id) {
        this.sensor_id = sensor_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getData_value() {
        return data_value;
    }

    public void setData_value(String data_value) {
        this.data_value = data_value;
    }



}
