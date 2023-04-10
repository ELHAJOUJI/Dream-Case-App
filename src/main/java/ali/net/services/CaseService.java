package ali.net.services;

import java.util.List;
import java.util.Optional;

import ali.net.entites.Case;

public interface CaseService {
	
	Case ReadCase(Long id);
	void DeleteCase(Long id);
	Case UpdateCase(Long id,Case c);
	Case CreateCase(Case c);

}
