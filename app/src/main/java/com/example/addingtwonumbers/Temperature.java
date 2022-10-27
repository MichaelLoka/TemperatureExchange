package com.example.addingtwonumbers;

public class Temperature {
    private float temperature;

    public float getTemperature() {
        return temperature;
    }
    public void setTemperature(float temp){
        temperature = temp;
    }
    public float convertToCelsius(){
        return (temperature - 32) * 5/9;
    }
    public float convertToFahrenheit(){
        return (temperature* 9/5) + 32;
    }
}
