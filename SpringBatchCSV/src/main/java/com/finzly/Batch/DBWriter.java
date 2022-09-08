package com.finzly.Batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.finzly.Model.User;
import com.finzly.Repository.UserRepository;

@Component
public class DBWriter implements ItemWriter<User>{
	
	@Autowired
	private UserRepository userRepository;
	

	@Override
	public void write(List<? extends User> users) throws Exception {
		// TODO Auto-generated method stub
//		System.out.println("Data Saved For Users: " + users);
		userRepository.saveAll(users);
		
		
	}
	

}
