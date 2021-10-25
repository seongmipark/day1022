package com.sist.game;

import java.util.ArrayList;
import java.util.HashMap;

public class Player {
	//������ �ϴ� ����ڰ� CardDeck�κ��� ī�带 �ϳ��� ������ ���� ����Ʈ�� �����.
	private ArrayList<Card> list = new ArrayList<Card>();
	
	//ī�带 �Ű������� �޾Ƽ� ���� list�� ��´�
	public void getCard(Card card) {
		list.add(card);
	}
	
	//��������� �Ǻ��Ͽ� ���� �̰���� ó���ϱ����� ������� ���ڸ� ��ȯ
	//���� 2~10������ Integer.parseInt()�ϸ� ������ ����� �ִµ� ������ ���µ�
	//�ڿ� ���ڶ����� Integer.parseInt()�� �� ������.
	//�׷��� "2"�� key�� �ϰ� value�� "2"�� �ϴ� map�� ����� �ش�.
	public int isOnePair(){
		String []number = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		HashMap<String,Integer> map = new HashMap<String, Integer>();
		
		//number 2�� ���� value���� 2���ϰ� 1��������ų���̴�.
		int value = 2;
		
		for(int i =0 ; i<number.length ; i++ ) {//ī���� ���ڹ迭��ŭ �ݺ�����
			map.put(number[i],value++);//key�� ī���� ����, value�� 2���� �ϳ��� ����
		}
		
		int n = 0;
		for(int i = 0 ;i<list.size();i++ ) {
			for(int j=i+1 ; j < list.size() ; j++){
				
				//i��° ī����ڶ� j��° ī�� ���ڶ� �������� �Ǻ�
				if(list.get(i).getNumber().equals(list.get(j).getNumber())) {
					
					//������ ī���� ����(���ڿ�)�� �ش��ϴ� ������ map���κ��� �������� 
					n = map.get(list.get(i).getNumber());
					//������ ������ �񱳾��ϰ� ��ȯ
					return n;
				}
			}
		}
		return n;
	}
	
				
				
	//���� ī�带 ��� ���
	public void showCards() {
		System.out.println(list);
	}
	
	
	
	
	
}
