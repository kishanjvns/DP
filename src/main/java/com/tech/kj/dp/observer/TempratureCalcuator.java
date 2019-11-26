package com.tech.kj.dp.observer;

import java.util.Date;

public class TempratureCalcuator extends WeatherStation {
	private int tempratureType;
	private int tempratureValue;
	private Date currentTime;

	public int getTempratureType() {
		return tempratureType;
	}

	public void setTempratureType(int tempratureType) {
		this.tempratureType = tempratureType;
	}

	@Override
	public int getState() {
		return tempratureValue;
	}

	public void setState(int state) {
		this.tempratureValue=state;		
	}

	public Date getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(Date currentTime) {
		this.currentTime = currentTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((currentTime == null) ? 0 : currentTime.hashCode());
		result = prime * result + tempratureType;
		result = prime * result + tempratureValue;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TempratureCalcuator other = (TempratureCalcuator) obj;
		if (currentTime == null) {
			if (other.currentTime != null)
				return false;
		} else if (!currentTime.equals(other.currentTime))
			return false;
		if (tempratureType != other.tempratureType)
			return false;
		if (tempratureValue != other.tempratureValue)
			return false;
		return true;
	}

}
