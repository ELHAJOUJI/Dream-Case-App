package ali.net;

import java.util.Date;



import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import ali.net.entites.Case;
import ali.net.services.CaseService;

@SpringBootApplication
public class DreamCaseAppApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(DreamCaseAppApplication.class, args);
		
		
	
	}
	
	
	  @Bean
			CommandLineRunner start(CaseService caseservice) {
			return args->{
				Case c1=new Case(null,new Date(),new Date(),"title","description");
				Case c2=new Case(null,new Date(),new Date(),"title2","description2");
				Case c3=new Case(null,new Date(),new Date(),"title3","description3");
				Case c4=new Case(null,new Date(),new Date(),"title4","description4");
				
				Case cmod=new Case(null,new Date(),new Date(),"titlemod","descriptionmod");
				System.out.println(c1.toString());
				caseservice.CreateCase(c1);
				caseservice.CreateCase(c2);
				caseservice.CreateCase(c3);
				caseservice.CreateCase(c4);
				
				//caseservice.DeleteCase( (long)1);
			 //  System.out.println(caseservice.ReadCase((long)4).getTitle());
				caseservice.UpdateCase((long)4,cmod);	
			
	  };
	  }
	
}

