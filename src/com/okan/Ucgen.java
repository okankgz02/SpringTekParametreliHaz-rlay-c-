package com.okan;

public class Ucgen {
	private String sayis;
	private String cesit; 

	//--------------------------
	public Ucgen(String cesit) {
		this.cesit = cesit;
	}
	//--------------------------
	public String getCesit() {
		return cesit;
	}

	public void setCesit(String cesit) {
		this.cesit = cesit;
	}
	
	public String getSayi() {
		return sayis;
	}
	public void setSayi(String sayi) {
		this.sayis = sayi;
	}
	//--------------------------
	public void ciz() {
		System.out.println(getCesit() +  " Üçgen çiz"+" sAYINIZ"+sayis.toString());
	}
	
}
