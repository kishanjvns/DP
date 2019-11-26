package com.tech.kj.dp.observer;

public class TestFinal {
	public static void main(String[] args) {
		
		WeatherStation iRainObservable=new RainCaclulator();
		iRainObservable.setState(2);
		WeatherStation iHumidityObservable=new HumidityCalculator();
		iHumidityObservable.setState(3);
		WeatherStation itempratureObservable=new TempratureCalcuator();
		itempratureObservable.setState(4);
		
		Subscriber subscriber1=new Subscriber();
		Subscriber subscriber2=new Subscriber();
		
		iRainObservable.add(subscriber1);
		iRainObservable.add(subscriber2);
		iRainObservable.notifyObservers();
		
		iHumidityObservable.add(subscriber2);
		iHumidityObservable.notifyObservers();
	}
}
