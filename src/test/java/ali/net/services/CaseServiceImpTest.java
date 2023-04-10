package ali.net.services;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import ali.net.entites.Case;
@RunWith(SpringRunner.class)
@SpringBootTest
public class CaseServiceImpTest {
   
	@Autowired
	private CaseService caseservice;
	
	
	@Test
	public void testCreatCase() {
		Case c1=new Case(null,new Date(),new Date(),"titleTest","descriptionTest");
		
		  Case c2=caseservice.CreateCase(c1);
		  assertNotNull(c2);
		  assertNotNull(c2.getCaseId());
		  assertEquals(c1.getCaseId(), c2.getCaseId());
		  assertEquals(c1.getCreationDate(), c2.getCreationDate());
		  assertEquals(c1.getLastUpdateDate(), c2.getLastUpdateDate());
		  assertEquals(c1.getTitle(), c2.getTitle());
		  assertEquals(c1.getDescription(), c2.getDescription());
		  
	}
	
	
	@Test
	public void testUpdateCase() {
		Case c1=new Case(null,new Date(),new Date(),"titleTestUpdate","descriptionTestUpdate");
		
		  Case c2=caseservice.UpdateCase((long)2,c1);;
		  assertNotNull(c2);
		  assertNotNull(c2.getCaseId());
		  assertEquals(c1.getCaseId(), c2.getCaseId());
		  assertEquals(c1.getCreationDate(), c2.getCreationDate());
		  assertEquals(c1.getLastUpdateDate(), c2.getLastUpdateDate());
		  assertEquals(c1.getTitle(), c2.getTitle());
		  assertEquals(c1.getDescription(), c2.getDescription());
		  
	}

}
