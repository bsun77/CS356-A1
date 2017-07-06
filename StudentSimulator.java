import java.util.Random;


public class StudentSimulator implements Student {

	private String id;
	private int answer;
	
	@Override
	public void setID(String id) {
		this.id = id;
		
	}

	@Override
	public String getID() {
		return id;
	}

	@Override
	public void setAnswer(int ans) {
		this.answer = ans;
		
	}

	@Override
	public int getAnswer() {
		return answer;
	}

	public void simulateMC() {
		Random rand = new Random();
		answer = rand.nextInt(4);
		id = Integer.toString(rand.nextInt(999999999));
	}
	
	public void simulateTF() {
		Random rand = new Random();
		answer = rand.nextInt(2);
		id = Integer.toString(rand.nextInt(999999999));
	}
}
