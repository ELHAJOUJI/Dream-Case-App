package ali.net.entites;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Cases")
@Data @AllArgsConstructor @NoArgsConstructor
public class Case {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long caseId;
	private Date creationDate;
	private Date lastUpdateDate;
	private String title;
	private String description;

}
