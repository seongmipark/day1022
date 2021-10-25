package com.sist.exam01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class DictionaryTestMenu {
	
	public static Scanner sc = new Scanner(System.in);
	public static String eng,kor;
	
	//�޴������ ���� �޼ҵ�
	public static void printMenu() {
		System.out.println("1.�ܾ���   2.�ܾ�˻�   3.������   4.�ܾ����   0.����");
		System.out.print("�޴��� �����ϼ���===>");
	}
	
	//�ܾ����� ���� �޼ҵ�
	public static void insertWord(HashMap<String,String>map) {
		System.out.println("���ο� �ܾ ����մϴ�.");
		System.out.print("����ܾ �Է��ϼ���===>");		
		eng = sc.next();
		System.out.print("�ѱ��� �渦 �Է��ϼ���===>");	
		sc.nextLine();//eng�� ��ϵɶ� ���Ͱ��� �������ֱ����� nextLine
		kor =  sc.nextLine();
		map.put(eng,kor);
		System.out.println("���ο� �ܾ ����߽��ϴ�.");
	}
	
	//�ܾ�˻��� ���� �޼ҵ�
	public static void searchWord(HashMap<String,String>map) {
		System.out.println("���� �ܾ �˻��մϴ�.");
		System.out.print("����ܾ �Է��ϼ���===>");		
		eng = sc.next();	
		kor = map.get(eng);
		if(kor!=null) {
		System.out.printf("�˻��� �ܾ� %s�� ���� %s �Դϴ�.\n",eng,kor);
	
		}else {
			System.out.printf("�˻��� �ܾ� %s�� ��ϵǾ� ���� �ʽ��ϴ�.\n",eng);				
		}
		
	}	
	
	//�������� ���� �޼ҵ�
	public static void printAll(HashMap<String,String>map) {
		System.out.println("����\t�ѱ���");
		System.out.println("---------------------");
		Iterator<String> eng_list = map.keySet().iterator();
		while(eng_list.hasNext()) {
			eng = eng_list.next();
			kor= map.get(eng);
			System.out.println(eng+"\t"+kor);
		}
	}

	//�ܾ������ ���� �޼ҵ�
	public static void deleteWord(HashMap<String,String>map) {
		System.out.println("�ܾ �����մϴ�.");
		System.out.print("�ܾ �Է��ϼ���===>");	
		eng = sc.next();
		kor = map.remove(eng);
		if (kor != null ) {
			System.out.printf("����ܾ� %s�� �������� �����߽��ϴ�.\n",eng);
		}else {
			System.out.printf("�����Ϸ��� ����ܾ� %s�� ������ �����ϴ�.\n",eng);		
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("tiger", "ȣ����");
		map.put("lion", "����");
		map.put("apple", "���");
		
		int menu = -1 ;
		while(menu != 0) {
			printMenu();
			menu = sc.nextInt();
			if(menu == 0) {
				System.out.println("���α׷��� �����մϴ�.");
			}
			
			switch(menu) {
			case 1 : insertWord(map);break;
			case 2 : searchWord(map);break;
			case 3 : printAll(map);break;
			case 4 : deleteWord(map);break;
			}
	}
}
}




