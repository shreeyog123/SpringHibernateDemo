package applications;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class TestDao  extends GenericDao{
	
	public void saveDao(Student student){
		
		getSession().save(student);
		
		
		
		
		
		
		
	}
	
	

}
