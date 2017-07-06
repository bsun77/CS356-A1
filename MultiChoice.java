import java.util.HashSet;


public class MultiChoice implements iVote {

	int[] answers = new int[4];
	private HashSet<String> userid = new HashSet<>();
	private String a,b,c,d;	
	private String answer;
	private String question;
	
	
	public MultiChoice(String w, String x, String y, String z){
		this.a = w;
		this.b = x;
		this.c = y;
		this.d = z;
	}	

	@Override
	public void display() {
		System.out.println(question);
		System.out.println("Number of "+a+": "+answers[0]);
		System.out.println("Number of "+b+": "+answers[1]);
		System.out.println("Number of "+c+": "+answers[2]);
		System.out.println("Number of "+d+": "+answers[3]);
		System.out.println("The right answer is "+answer);
	}

	@Override
	public void placeVote(String s, int i) {
		if(userid.add(s)){
			answers[i]++;
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
