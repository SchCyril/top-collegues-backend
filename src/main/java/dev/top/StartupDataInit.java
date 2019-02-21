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
    	
    	this.collegueRepo.save(new Collegue("Arthas", "https://3.bp.blogspot.com/-MKv02ZOzjdw/W3PgqKxnoCI/AAAAAAAAIH4/k67ptOAsZGIs53QGOQUBgUJY_ktdZn_ygCLcBGAs/s1600/World%2Bof%2BWarcraft%2BArthas.jpg",0));
    	this.collegueRepo.save(new Collegue("Sylvanas", "https://vignette.wikia.nocookie.net/characterprofile/images/8/84/Sylvanas.jpg/revision/latest?cb=20160306203044",0));
    	this.collegueRepo.save(new Collegue("Thrall", "https://vignette.wikia.nocookie.net/feldanrp/images/b/b1/Thrall.png/revision/latest?cb=20170920100607&path-prefix=fr",0));
    	this.collegueRepo.save(new Collegue("Illidan", "https://3.bp.blogspot.com/-6JBNzZlwhUI/WPcYxte08RI/AAAAAAAAAQA/FLxqNTXSKtgUWosDmXaFlK7jxT_sGPdWgCLcB/s1600/Illidan%2BStormrage.jpg",0));
    	this.collegueRepo.save(new Collegue("Garrosh", "https://images.wallpaperscraft.com/image/garrosh_hellscream_garrosh_world_of_warcraft_95396_800x1200.jpg",0));
    	this.collegueRepo.save(new Collegue("Guldan", "https://www.mamytwink.com/upload/news/2017/mai/02/correctif-1er-mai-nerfs-elisande-gul-dan-equilibrage-jcj.jpg",0));
    	this.collegueRepo.save(new Collegue("Anduin", "https://cdnb.artstation.com/p/assets/images/images/012/847/931/large/eric-braddock-wowx8-eb-anduin-final-artstation.jpg?1536811658",0));
    	this.collegueRepo.save(new Collegue("Varian", "https://i.ytimg.com/vi/HvBcd0pntlg/maxresdefault.jpg",0));
    	this.collegueRepo.save(new Collegue("Varian", "https://vignette.wikia.nocookie.net/p__/images/c/c8/Vol%27jin.jpg/revision/latest?cb=20150307104025&path-prefix=protagonist",0));
    	
    	
    }
}
