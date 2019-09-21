package org.jhe.spikes.override.sample;

public class ConcreteSample extends AbstractSample {
	@Override
	public String doStuff() {
		return "do complex stuff";
	}

	private String doPrivateStuff() {
		return "do complex stuff";
	}

	public static String doStaticStuff() {
		return "do complex static stuff";
	}
}
