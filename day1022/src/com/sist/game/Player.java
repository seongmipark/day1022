package com.sist.game;

import java.util.ArrayList;
import java.util.HashMap;

public class Player {
	//게임을 하는 경기자가 CardDeck로부터 카드를 하나씩 가져와 담을 리스트를 만든다.
	private ArrayList<Card> list = new ArrayList<Card>();
	
	//카드를 매개변수로 받아서 나의 list에 담는다
	public void getCard(Card card) {
		list.add(card);
	}
	
	//원페어인지 판별하여 누가 이겼는지 처리하기위해 원페어인 숫자를 반환
	//숫자 2~10까지는 Integer.parseInt()하면 정수로 만들어 주는데 문제가 없는데
	//뒤에 문자때문에 Integer.parseInt()을 할 수없다.
	//그래서 "2"를 key로 하고 value을 "2"로 하는 map을 만들어 준다.
	public int isOnePair(){
		String []number = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		HashMap<String,Integer> map = new HashMap<String, Integer>();
		
		//number 2에 대한 value값을 2로하고 1씩증가시킬것이다.
		int value = 2;
		
		for(int i =0 ; i<number.length ; i++ ) {//카드의 숫자배열만큼 반복실행
			map.put(number[i],value++);//key는 카드의 숫자, value는 2부터 하나씩 증가
		}
		
		int n = 0;
		for(int i = 0 ;i<list.size();i++ ) {
			for(int j=i+1 ; j < list.size() ; j++){
				
				//i번째 카드숫자랑 j번째 카드 숫자랑 동일한지 판별
				if(list.get(i).getNumber().equals(list.get(j).getNumber())) {
					
					//동일한 카드의 숫자(문자열)에 해당하는 정수를 map으로부터 가져오고 
					n = map.get(list.get(i).getNumber());
					//같으면 나머지 비교안하고 반환
					return n;
				}
			}
		}
		return n;
	}
	
				
				
	//나의 카드를 모두 출력
	public void showCards() {
		System.out.println(list);
	}
	
	
	
	
	
}
