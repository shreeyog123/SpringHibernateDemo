package applications;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class TestDao  extends GenericDao{
	
	public void saveDao(Student student){
		
		getSession().save(student);	
		
	}
	
	public List<String> getDate(){
		
		List<String> list= getSession().createQuery("select username from Student").list();
		
		return list;
		
	}
	
	

}
