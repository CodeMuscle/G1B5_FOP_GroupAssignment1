package com.group.assignment;

public class Main {

	public static void main(String[] args) {

		AdminDepartment ad = new AdminDepartment();

		System.out.println(" Welcome to " + ad.departmentName());
		System.out.println(ad.getTodaysWork());
		System.out.println(ad.getWorkDeadline());
		System.out.println(ad.isTodayAHoliday());

		HrDepartment hr = new HrDepartment();

		System.out.println(" Welcome to " + hr.departmentName());
		System.out.println(hr.doActivity());
                System.out.println(hr.getTodaysWork());	
                System.out.println(hr.getWorkDeadline());	
                System.out.println(hr.isTodayAHoliday());

		TechDepartment td = new TechDepartment();

		System.out.println(" Welcome to " + td.departmentName());
		System.out.println(td.getTodaysWork());
		System.out.println(td.getWorkDeadline());
		System.out.println(td.getTechStackInformation());
		System.out.println(td.isTodayAHoliday());

	}

}
