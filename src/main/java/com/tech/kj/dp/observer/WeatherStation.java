package com.tech.kj.dp.observer;

import java.util.HashSet;
import java.util.Set;

public abstract class WeatherStation implements IObservable {
	private Set<IObserver> iObservers = new HashSet<>();
	
	
	public Set<IObserver> getiObservers() {
		return iObservers;
	}

	public void setiObserver(IObserver iObservers) {
		this.iObservers.add(iObservers);
	}
		

	public void add(IObserver iObserver) {
		iObservers.add(iObserver);
	}

	public void remove(IObserver iObserver) {
		iObservers.remove(iObserver);
	}

	public void notifyObservers() {
		for (IObserver iObserver : iObservers) {
				iObserver.update(this);
		}
	}

	
	
}
