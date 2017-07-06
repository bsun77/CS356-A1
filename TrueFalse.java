import java.util.HashSet;

public class TrueFalse implements iVote {

	private int[] tf = new int[2];
	private HashSet<String> userid = new HashSet<>();
	private String answer;
	private String question;
	
	@Override
	public void display() {
		System.out.println(question);
		System.out.println("Number of true: "+tf[0]);
		System.out.println("Number of false: "+tf[1]);
		if(answer.equals("1") || answer.equals("true")){
			System.out.println("The right answer is: True");
		} else if (answer.equals("2") || answer.equals("false")){
			System.out.println("The right answer is: False");
		} else {
			System.out.println("That is not an answer.");
		}
	}

	@Override
	public void placeVote(String s, int i) {
		if(userid.add(s)){
			tf[i]++;
		}
	}

	@Override
	public void setQuestion(String s) {
		this.question = s;
	}

	@Override
	public void setAnswer(String s) {
		this.answer = s;
	}
}
