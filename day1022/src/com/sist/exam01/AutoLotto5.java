package com.sist.exam01;

import java.util.Random;
import java.util.TreeSet;

public class AutoLotto5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//로또 1장은 1~45까지의 숫자를 6개 선택
		
		TreeSet []arr = new TreeSet[5]; // 배열 5개 생성
		Random r = new Random();
		
		for(int i = 0 ; i<arr.length ; i++) {
			arr[i] = new TreeSet<Integer>();
			while(arr[i].size() < 6) {
				arr[i].add(r.nextInt(45)+1);
			}
		System.out.println(arr[i]);
		}
	}
}
