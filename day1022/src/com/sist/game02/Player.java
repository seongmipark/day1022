package com.sist.game02;

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
            if(num[i] == 2 ) isTwoPair = true;//...2���ΰ� 2��,,
            return isTwoPair;
        }
        return isTwoPair;    
}
	
	
	
	// Flush : 5���� ī���� ���̰� ��� ���� ������ ����	
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


		// ��Ʈ����Ʈ : ���ڰ� �̾����� ������ ����
		

		
		//���� ī�带 ��� ���
		public void showCards() {
		System.out.println(list);
		}

}




