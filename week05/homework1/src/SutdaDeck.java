
public class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		/*
			(1) �迭 SutdaCard�� ������ �ʱ�ȭ �Ͻÿ�.
		*/
		for (int i = 0; i < CARD_NUM; i++) {
			int n = (i+2)/2;
			cards[i] = new SutdaCard(n, false);
		}

	}
}
