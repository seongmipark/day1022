package com.sist.exam01;

import java.util.HashMap;
import java.util.Scanner;

public class DictionaryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("tiger", "ȣ����");
		map.put("lion", "����");
		map.put("apple", "���");
		
		while(true) {
		Scanner sc = new Scanner(System.in);
		String eng,kor;
		System.out.print("ã���� �ϴ� �ܾ �Է��ϼ���==>");
		eng = sc.next();
			kor = map.get(eng);		
			if(kor != null) {
				System.out.println(kor);
			}else {
				System.out.println("��ϵ� �ܾ �ƴմϴ�.");
			}
		}		
	}

}
