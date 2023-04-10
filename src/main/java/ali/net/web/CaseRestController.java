package ali.net.web;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ali.net.entites.Case;
import ali.net.services.CaseService;

@CrossOrigin("*")
@RestController
public class CaseRestController {
	
	@Autowired
	private CaseService caseservice;
	
	
	
	@GetMapping(path="/cases/{id}")
	public Case ReadCase(@PathVariable Long id) {
		return caseservice.ReadCase(id);
		
	}

	@DeleteMapping(path="/cases/{id}")
	public void DeleteCase(@PathVariable Long id) {
		caseservice.DeleteCase(id);
		
	}
	@PostMapping(path ="/cases/")
	public Case CreateCase(@RequestBody Case c) {
		return caseservice.CreateCase(c);
	}
	
	@PutMapping(path ="/cases/{id}")
	public void UpdateCase(@PathVariable Long id,@RequestBody Case c) {
		 caseservice.UpdateCase(id,c);
	}
	
}
