package com.sist.my;

import java.util.ArrayList;
import java.util.Iterator;

public class exercise07 {

	public static void main(String[] args) {

		ArrayList<ArrayList<Double>> list = new ArrayList<ArrayList<Double>>();
	
		ArrayList<Double> double1 = new ArrayList<Double>();
		double1.add(1.1);
		double1.add(2.2);
		double1.add(3.3);
		
		list.add(double1);
		
		//출력해보기
		//1.인덱스 변수를 사용하는 보통의 for루프
		for(int i=0 ; i < double1.size() ; i++) {
			System.out.print(double1.get(i)+"\t");
		}
		System.out.println();
		
		
		//2.FOR-EACH 구문
		for(ArrayList<Double> d : list) { 
			for(Double data : d) { 
				System.out.print(data+"\t");
			}
			System.out.println();		


		//3.iterator사용
			Iterator<ArrayList<Double>> iter = list.iterator();
			while(iter.hasNext()) {
				ArrayList<Double> n = iter.next();
				System.out.println(n+"\t");
			}		
	}

	}
}
