package in.cdac.main.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.cdac.main.entities.registeruser;
import in.cdac.main.repository.UserRepository;

@Service
public class registeruserService {
	
//	@Autowired
//	UserRepository userRepo;
	
	public void save(registeruser details) {
		System.out.println("-----"+details);
	}
}
