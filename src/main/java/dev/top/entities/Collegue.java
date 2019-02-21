package dev.top.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

@Entity
public class Collegue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String pseudo;
    
    private String photoUrl;
    
    private Integer score;
    
   

    public Collegue() { }

	public Collegue(Integer id, String pseudo, String photoUrl, Integer score) {
		super();
		this.id = id;
		this.pseudo = pseudo;
		this.photoUrl = photoUrl;
		this.score = score;
	}
	
	public Collegue(String pseudo, String photoUrl, Integer score) {
		super();
		
		this.pseudo = pseudo;
		this.photoUrl = photoUrl;
		this.score = score;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

    
	
}
