package com.tech.kj.dp.observer;

public class Subscriber implements IObserver {

	@Override
	public void update(IObservable iObservable) {
		System.out.println(iObservable.getState() + " " + iObservable.getClass().getName());
	}
}