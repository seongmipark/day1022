package com.sist.exam01;

import java.util.Random;
import java.util.TreeSet;

public class AutoLotto5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�ζ� 1���� 1~45������ ���ڸ� 6�� ����
		
		TreeSet []arr = new TreeSet[5]; // �迭 5�� ����
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
