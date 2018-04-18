package com.custom.multikey.map;

public class ExampleKey extends MultiKey {

	private Long height;

	private String hash;

	public ExampleKey() {
	}

	public ExampleKey(Long height) {
		this.height = height;
	}

	public ExampleKey(String hash) {
		this.hash = hash;
	}

	public ExampleKey(Long height, String hash) {
		this.height = height;
		this.hash = hash;
	}

	public Long getHeight() {
		return height;
	}

	public void setHeight(Long height) {
		this.height = height;
	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	@Override
	public String toString() {
		return "MapKey [height=" + height + ", hash=" + hash + "]";
	}

}
