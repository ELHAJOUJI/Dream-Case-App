package ali.net.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ali.net.dao.CaseRepository;
import ali.net.entites.Case;
@Service
@Transactional
public class CaseServiceImp implements  CaseService {

	@Autowired
	private CaseRepository caserepository ;
	
	@Override
	public Case ReadCase(Long id) {
		// TODO Auto-generated method stub
		return caserepository.findById(id).get();
	}

	@Override
	public void DeleteCase(Long id) {
		// TODO Auto-generated method stub
		caserepository.deleteById(id);
	}



	@Override
	public Case CreateCase(Case c) {
		// TODO Auto-generated method stub
		return caserepository.save(c);
	}

	@Override
	public Case UpdateCase(Long id, Case c) {
		
		
			Case c1=caserepository.findById(id).get();
			c1.setCreationDate(c.getCreationDate());
			c1.setLastUpdateDate(c.getLastUpdateDate());
			c1.setDescription(c.getDescription());
			c1.setTitle(c.getTitle());
			return caserepository.save(c1);
	
		
		
	}



	

}
