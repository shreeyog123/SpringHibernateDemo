package applications;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
	
	@Autowired
	TestDao testDao;
	
	
	public void saveService(Student student){
		
		student.setUsername(student.getUsername());
		student.setPassword(student.getPassword());
		
		testDao.saveDao(student);
	}
	

}
