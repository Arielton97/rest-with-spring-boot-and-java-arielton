package br.com.arielton;

public class Greeting {
	
	private final long id;
	private final String contend;
	
	public Greeting(long id, String contend) {
		super();
		this.id = id;
		this.contend = contend;
	}

	public long getId() {
		return id;
	}

	public String getContend() {
		return contend;
	}
	

}
