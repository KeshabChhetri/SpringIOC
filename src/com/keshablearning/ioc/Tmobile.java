package com.keshablearning.ioc;

public class Tmobile implements Sim {

	public Tmobile() {
		System.out.println("This is a debug point");
	}

	@Override
	public void calling() {
		System.out.println("Tmobile sim used for calling");

	}

	@Override
	public void data() {
		System.out.println("Tmobile sim  must let you browse");

	}

}
