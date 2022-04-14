package lab;

import java.util.Collections;
import java.util.Comparator;

import assignment.Employee;

public class CalcPayLowestToHighestComparator implements Comparator<Employee>{
	public static void main(String[] args) {
        Object staff;
		System.out.println("All Employees and salary before sorting"+((Object) staff).getAllEmployees()+"\n");
        Collections.sort(staff.getAllEmployees(), new CalcPayLowestToHighestComparator());
        System.out.println("All Employees and salary after sort"+((Object) staff).getAllEmployees()+"\n");
	}

	    @Override
	    public int compare(Employee o1, Employee o2) {
	        if(o1.calcPay()>o2.calcPay()) { //call the calcPay method on o1 and 02 then compare them
	            return 1;
	        }else if(o1.calcPay()==o2.calcPay()) {
	            return 0;
	        }else return -1;
	    }
	}

