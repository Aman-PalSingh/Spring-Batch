package com.finzly.Batch;

import java.util.HashMap;
import java.util.Map;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.finzly.Model.User;

@Component
public class Processor implements ItemProcessor<User, User> {
	
	private static final Map<String,String> DEPT_NAMES = new HashMap<>();
//	public Processor() {
//		DEPT_NAMES.put("101", "Development");
//		DEPT_NAMES.put("107", "Security");
//		DEPT_NAMES.put("103", "Management");
//		DEPT_NAMES.put("111", "Finance");
//		
//	}

	@Override
	public User process(User user) throws Exception {
		// TODO Auto-generated method stub
//		String deptCode = user.getDept();
//		String dept = DEPT_NAMES.get(deptCode);
//		user.setDept(dept);
//		System.out.println(String.format("Converted from [%s] to [%s]",deptCode,dept));
		return user;
	}

}
