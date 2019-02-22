package dev.top.controller;

public class CreerCollegue {
	 private String matricule;
	 private String pseudo;
	 private String imgUrl;
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	@Override
	public String toString() {
		return "CreerCollegue [matricule=" + matricule + ", pseudo=" + pseudo + ", imgUrl=" + imgUrl + "]";
	}
	 
	 
}
