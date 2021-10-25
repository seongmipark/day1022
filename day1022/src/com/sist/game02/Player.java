package com.sist.game02;

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
					n = map.get(list.get(i).getNumber());
					return n;
				}
			}
		}
		return n;
	}

	
	public boolean isTwoPair(){
		
        boolean isTwoPair = false;
		int[] num = new int[13];
		
		
		for(int i = 0 ;  i<list.size(); i++){
	        switch(list.get(i).getNumber()){
	        case "2" :num[0] ++; break;
	        case "3" :num[1] ++; break;
	        case "4" :num[2] ++; break;
	        case "5" :num[3] ++; break;	
	        case "6" :num[4] ++; break;
	        case "7" :num[5] ++; break;
	        case "8" :num[6] ++; break;
	        case "9" :num[7] ++; break;	
	        case "10" :num[8] ++; break;
	        case "Jack" :num[9] ++; break;
	        case "Queen" :num[10] ++; break;		        
	        case "King" :num[11] ++; break;
	        case "Ace" :num[12] ++; break;			        
	        }
	}
        for(int i=0; i<13; i++) {
            if(num[i] == 2 ) isTwoPair = true;//...2개인게 2쌍,,
            return isTwoPair;
        }
        return isTwoPair;    
}
	
	
	
	// Flush : 5장의 카드의 무늬가 모두 같게 나오는 조합	
		public boolean Flush(){
	        boolean isFlush = false;
			int[] shape = new int[4];
			
			for(int i = 0 ; i<7 ; i++){
		        switch(list.get(i).getSuit().substring(0, 1)){
		        case "C" :
		            shape[0] ++;
		            break;
		        case "D" :
		            shape[1] ++;
		            break;
		        case "H" :
		            shape[2] ++;
		            break;
		        case "S" :
		            shape[3] ++;
		            break;
		        }
		}
	        for(int i=0; i<4; i++) {
	            if(shape[i] == 5) isFlush = true;
	            return isFlush;
	        }
	        return isFlush;    
}


		// 스트레이트 : 숫자가 이어지게 나오는 조합
		

		
		//나의 카드를 모두 출력
		public void showCards() {
		System.out.println(list);
		}

}




