package org.testing;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Sample {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.setEmpId(123);
		e1.setName("Greens");
		e1.setMobNum(7666099973l);
		
		Employee e2 = new Employee();
		e2.setEmpId(456);
		e2.setName("Greens Technologies");
		e2.setMobNum(1234567890l);
		
		Employee e3 = new Employee();
		e3.setEmpId(789);
		e3.setName("Infosys");
		e3.setMobNum(987654321l);
		
		
		// UserDefined List
		List<Employee> li = new ArrayList<Employee>();
		
		li.add(e1); //0
		li.add(e2); //1
		li.add(e3); //2
		
		
		for (int i = 0; i <li.size(); i++) {
			Employee e = li.get(i);
			System.out.println("Employee No: "+(i+1));
			System.out.println("My Employee Id: "+e.getEmpId());
			System.out.println("My Name is: "+e.getName());
			System.out.println("My Mob Number: "+e.getMobNum());
		}
		
//     Task
//		Set
//		
//		Map<Integer, Employee> mp = new LinkedHashMap<Integer, Employee>();
//		mp.put(1, e1);
		
		
		
		
		
		
	}
	
	
	

}
