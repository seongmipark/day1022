package com.sist.game;

public class CardGame02 {

	public static void main(String[] args) {
		
		//carddeck객체를 새성한다.
		//생성자에 의해서 52개의 카드가 생성된다.
		CardDeck deck = new CardDeck();
		
		//카드 섞기
		deck.shuffle();
		
		//카드게임을 할 경기자 두명을 생성
		Player p1 = new Player();
		Player p2 = new Player();
		
		//두명의 경기자가 카드를 7장씩 뽑아오도록
		for(int i = 1 ;i<=7;i++) {
		p1.getCard(deck.deal());
		p2.getCard(deck.deal());
		}
		//첫번째 사람이 자신의 모든 카드를 보여준다
		p1.showCards();
		//두번째 사람이 자신의 모든 카드를 보여준다
		p2.showCards();
		
		if(p1.isOnePair() !=0) {
			System.out.println("player1은 원페어입니다." + p1.isOnePair());
		}else {
			System.out.println("player1은 원페어가 아닙니다.");
		}

		if(p2.isOnePair() !=0) {
			System.out.println("player2은 원페어입니다." + p2.isOnePair());
		}else {
			System.out.println("player2은 원페어가 아닙니다.");
		}
		
	}

}
