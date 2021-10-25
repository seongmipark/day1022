package com.sist.game;

public class CardGame02 {

	public static void main(String[] args) {
		
		//carddeck��ü�� �����Ѵ�.
		//�����ڿ� ���ؼ� 52���� ī�尡 �����ȴ�.
		CardDeck deck = new CardDeck();
		
		//ī�� ����
		deck.shuffle();
		
		//ī������� �� ����� �θ��� ����
		Player p1 = new Player();
		Player p2 = new Player();
		
		//�θ��� ����ڰ� ī�带 7�徿 �̾ƿ�����
		for(int i = 1 ;i<=7;i++) {
		p1.getCard(deck.deal());
		p2.getCard(deck.deal());
		}
		//ù��° ����� �ڽ��� ��� ī�带 �����ش�
		p1.showCards();
		//�ι�° ����� �ڽ��� ��� ī�带 �����ش�
		p2.showCards();
		
		if(p1.isOnePair() !=0) {
			System.out.println("player1�� ������Դϴ�." + p1.isOnePair());
		}else {
			System.out.println("player1�� ���� �ƴմϴ�.");
		}

		if(p2.isOnePair() !=0) {
			System.out.println("player2�� ������Դϴ�." + p2.isOnePair());
		}else {
			System.out.println("player2�� ���� �ƴմϴ�.");
		}
		
	}

}
