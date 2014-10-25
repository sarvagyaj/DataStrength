package com.sjsu.cmpe226.app;

import com.sjsu.cmpe226.dao.TestDao;

public class CheckDataStrength {
	public static void main(String[] args) {
		TestDao testDao = new TestDao();
		testDao.getTest();
	}
}
