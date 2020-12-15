package com.se.dummytempmonitorbackend.entityes;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;




@Entity
@Table(name="notification_mgs")
@IdClass(NotificationMsgId.class)
public class NotificationMsg {

    @Id
    private String sensor_id;
    @Id
    private String date;
    private String description;



    public NotificationMsg(String sensor_id, String date, String description) {
        this.sensor_id = sensor_id;
        this.date = date;
        this.description = description;
    }

    public NotificationMsg() {

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



}

