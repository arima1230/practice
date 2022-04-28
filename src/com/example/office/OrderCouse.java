package com.example.office;

import com.example.user.Account;

public class OrderCouse {
	//Couse aa  = new Order();
	
	
	Account[] accountList;
	Course[] courseList;
	int counter;
	
	private OrderCouse() {
		accountList = new Account[10];
		courseList = new Course[10];
		this.counter = -1;
	}
	
	public void courseRequest(Account account, Course course) {
		this.counter++;
		accountList[counter] = account;
		courseList[counter] = course;
	}
	
	public int CourseCount() {
		return counter;
	}
	
	public String[] getcourseList() {
		String [] coursename;
		coursename = new String[10];
		Course cou = courseList[0];//初期値
		for(int i =  0; i <= 9; i++) {
		cou = courseList[i];
		}
			String str1 = cou.getName();
			coursename[0] = str1;
		return coursename;
	}
	
	public String[] getAccountList() {
		String[] accountname;
		accountname = new String[10];
		Account acc = accountList[0];//初期値
		for(int j =  0; j <= 9; j++) {
			acc = accountList[j];
		}
				String str2 = acc.getName();
				accountname[0] = str2;
		return accountname;
	}

}
