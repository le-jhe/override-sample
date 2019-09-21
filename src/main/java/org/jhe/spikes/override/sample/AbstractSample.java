package org.jhe.spikes.override.sample;

public abstract class AbstractSample {
	public String complex() {
		String ret = doStuff();
		return ret;
	}
	public String complexUsingPrivate() {
		String ret = doPrivateStuff();
		return ret;
	}
	public String complexUsingStatic() {
		String ret = doStaticStuff();
		return ret;
	}
	public String doStuff() {
		return "do basic stuff";
	}
	private String doPrivateStuff() {
		return "do basic private stuff";
	}
	public static String doStaticStuff() {
		return "do basic static stuff";
	}

}
