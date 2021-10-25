package com.sist.game02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CardDeck {
	private ArrayList<Card> deck = new ArrayList<Card>();
	
	//52개의 카드를 생성하여 덱에 넣는다
	public CardDeck() {
		
		String []suit = {"Clubs","Diamonds","Hearts","Spades"}; //카드 모양 4가지
		
		//카드의 숫자 13가지를 담는다
		String []number = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		
		//중첩반복문을 이용하여 52개의 카드를 생성하여 deck에 담기
		for(int i=0 ;i<suit.length;i++) { //카드 모양만큼 반복문 돌기
			for(int j=0 ; j<number.length ; j++ ) { //카드 숫자만큼 반복문
				deck.add(new Card(suit[i],number[j]));
			}
		}
	}
	
	//52개의 카드가 순서대로 잇어요
	//게임을 위해 카드를 무작위로 섞어주는 메소드
	public void shuffle() {
		Collections.shuffle(deck);
	}
	
	//52장의 카드가 있는 deck으로 부터 카드를 하나씩 뽑아오는 메소드를 만든다
	//뽑아오고 deck에는 지워준다.
	//항상 deck의 맨 첫번째 요소를 뽑아오도록 한다. (deck의 0번째 인덱스 요소를 뽑아서 지우고 반환)
	public Card deal() {
		return deck.remove(0); 
		//맨 처음에 호출하면 52장의 카드 중에 0번째를 반환
		//맨 처음에 호출하면 51장의 카드 중에 0번째를 반환
		//...
	}
}
	


