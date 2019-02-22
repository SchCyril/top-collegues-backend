package dev.top.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import dev.top.entities.Collegue;
import dev.top.entities.CollegueApi;
import dev.top.repos.CollegueRepo;
import dev.top.utils.Action;
import dev.top.utils.Avis;

@RestController()
@CrossOrigin
@RequestMapping("/collegues")
public class CollegueCtrl {

	@Autowired
	private CollegueRepo collegueRepo;
	
	
	

	@GetMapping
	public List<Collegue> findAll() {
		return this.collegueRepo.findAll();
	}

	@PatchMapping("{pseudo}")
	public Collegue scoreUpdate(@PathVariable String pseudo, @RequestBody Action action) {

		Collegue collegue = collegueRepo.findByPseudo(pseudo);

		if (action.getAction() == Avis.AIMER) {
			collegue.setScore((collegue.getScore() + 10));
		} else if (action.getAction() == Avis.DETESTER) {
			collegue.setScore((collegue.getScore() - 5));
		}

		return collegueRepo.save(collegue);
	}

	@PostMapping
	public void postCollegue(@RequestBody CreerCollegue creerCol)  {
		
		System.out.println(creerCol);
		
		final RestTemplate restTemplate = new RestTemplate();
		final CollegueApi[] response = restTemplate.getForObject("https://tommy-sjava.cleverapps.io/collegues?matricule=" + creerCol.getMatricule(), CollegueApi[].class);
		
		if(response.length == 1)  {
			System.out.println(response[0]);
		} else {
			
		}
	 
	}
}
