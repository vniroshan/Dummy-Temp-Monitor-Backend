package com.se.dummytempmonitorbackend.entityes;

import java.io.Serializable;
import java.util.Objects;

public class NotificationMsgId  implements Serializable {

    private String sensor_id;
    private String date;

    public NotificationMsgId(){      }


    public NotificationMsgId(String sensor_id, String date) {
        this.sensor_id = sensor_id;
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotificationMsgId that = (NotificationMsgId) o;
        return Objects.equals(sensor_id, that.sensor_id) &&
                Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sensor_id, date);
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
}
