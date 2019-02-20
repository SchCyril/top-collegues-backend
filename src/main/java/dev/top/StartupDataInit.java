package dev.top;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import dev.top.entities.Collegue;
import dev.top.repos.CollegueRepo;

@Component
public class StartupDataInit {

	@Autowired
	CollegueRepo collegueRepo;

	@EventListener(ContextRefreshedEvent.class)
    public void init() {

//        this.collegueRepo.save(new Collegue("v1"));
//        this.collegueRepo.save(new Collegue("v2"));
//        this.collegueRepo.save(new Collegue("v3"));
//        this.collegueRepo.save(new Collegue("v4"));
    	
    	this.collegueRepo.save(new Collegue("Neige", "https://i.pinimg.com/originals/39/78/c8/3978c88ee6fe2933568e37e8a8f72061.jpg",0));
    	this.collegueRepo.save(new Collegue("Plage", "https://www.travelercar.com/wp-content/uploads/2016/04/4a36e314016aa914f203ea6b7d579dc6_large.jpeg",0));
    	this.collegueRepo.save(new Collegue("Soleil", "http://duobjectif.ca/wp-content/uploads/2016/11/Paysages039.jpg",0));
    	this.collegueRepo.save(new Collegue("Palmier", "https://fr.cdn.v5.futura-sciences.com/buildsv6/images/mediumoriginal/3/6/7/36703a61ed_nodam_2789-1024x768-82a2e.jpg",0));
    	this.collegueRepo.save(new Collegue("Moureze", "https://e-metropolitain.fr/wp-content/uploads/2017/04/IMGP1469-1024x686.jpg",0));
    	this.collegueRepo.save(new Collegue("Pré", "https://www.am-paysage.com/wp-content/uploads/2014/11/paysage1.jpg",0));
    	this.collegueRepo.save(new Collegue("Chute", "https://sf1.viepratique.fr/wp-content/uploads/sites/5/2017/06/ile-skye-750x410.jpg",0));
    	
    }
}
