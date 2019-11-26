package com.tech.kj.dp.observer;

import java.util.Date;

public class HumidityCalculator extends WeatherStation {
	private int humidityPercentage;
	private Date currentTime;

	@Override
	public int getState() {
		return humidityPercentage;
	}

	public void setState(int state) {
		this.humidityPercentage = state;
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
		result = prime * result + humidityPercentage;
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
		HumidityCalculator other = (HumidityCalculator) obj;
		if (currentTime == null) {
			if (other.currentTime != null)
				return false;
		} else if (!currentTime.equals(other.currentTime))
			return false;
		if (humidityPercentage != other.humidityPercentage)
			return false;
		return true;
	}

}
