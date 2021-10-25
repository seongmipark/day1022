package com.sist.game02;

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
			if(p1.isOnePair() !=0) {
				System.out.printf("player1�� ������Դϴ�.%d\n",p1.isOnePair());
			}else {
				System.out.printf("player1�� ���� �ƴմϴ�.\n");
			}
		}

		if(p2.isOnePair() !=0) {
			System.out.printf("player2�� ������Դϴ�.%d\n",p2.isOnePair());
		}else {
			System.out.printf("player2�� ���� �ƴմϴ�.\n");
		}
		
		if(p1.isTwoPair() != false) {
			System.out.printf("player1�� ������Դϴ�." );
		}else {
			System.out.printf("player1�� ���� �ƴմϴ�.\n");
		}

		if(p2.isTwoPair() != false) {
			System.out.printf("player2�� ������Դϴ�.");
		}else {
			System.out.printf("player2�� ���� �ƴմϴ�.\n");
		}
		
		if(p1.Flush() != false ) {
			System.out.printf("player1�� �÷����Դϴ�.\n");
		}else {
			System.out.printf("player1�� �÷��ð� �ƴմϴ�.\n");
		}
		
		if(p2.Flush() != false ) {
			System.out.printf("player2�� �÷����Դϴ�.\n");
		}else {
			System.out.printf("player2�� �÷��ð� �ƴմϴ�.\n");
		}
		
	}


}
