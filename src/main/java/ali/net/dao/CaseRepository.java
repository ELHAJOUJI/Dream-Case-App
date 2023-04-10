package ali.net.dao;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import ali.net.entites.Case;

public interface CaseRepository extends JpaRepository<Case, Long> {
	Case findByTitle(String title);
}
