package com.sist.game;

public class CardGame {

	public static void main(String[] args) {
		
		//carddeck객체를 새성한다.
		//생성자에 의해서 52개의 카드가 생성된다.
		CardDeck deck = new CardDeck();
		
		//카드 섞기
		deck.shuffle();
		
		//카드게임을 할 경기자 두명을 생성
		Player p1 = new Player();
		Player p2 = new Player();
		
		//첫번째 사람이 카드를 하나 뽑아온다.
		p1.getCard(deck.deal());
		//두번째 사람이 카드를 하나 뽑아온다.
		p2.getCard(deck.deal());
		
		//첫번째 사람이 자신의 모든 카드를 보여준다
		p1.showCards();
	
		//두번째 사람이 자신의 모든 카드를 보여준다
		p2.showCards();

	}

}
