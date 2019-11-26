package com.tech.kj.dp.observer;

import java.util.Date;

public class RainCaclulator extends WeatherStation {
	private int rainPercentage;
	private Date currentTime;
	@Override
	public int getState() {
		return rainPercentage;
	}

	public void setState(int state) {
		this.rainPercentage=state;
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
		result = prime * result + rainPercentage;
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
		RainCaclulator other = (RainCaclulator) obj;
		if (currentTime == null) {
			if (other.currentTime != null)
				return false;
		} else if (!currentTime.equals(other.currentTime))
			return false;
		if (rainPercentage != other.rainPercentage)
			return false;
		return true;
	}
	
}
