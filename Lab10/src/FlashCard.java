import java.util.ArrayList;

public class FlashCard {
	
	ArrayList<String> card = new ArrayList<String>();
	
	public void addCard(String s) {
		card.add(s);
	}
	
	public void addToCard(int i, String s) {
		card.set(i, card.get(i).concat(s));
	}
	
	public String getCard(int i) {
		return card.get(i).toString();
	}
	
	public int cardSize() {
		return card.size();
	}

}