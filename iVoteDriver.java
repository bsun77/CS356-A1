import java.util.Scanner;


public class iVoteDriver {

	@SuppressWarnings("resource")
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		boolean finished = false;
		while(!finished){
			System.out.println("Press 'a' for multiple choice or 'b' for True or False.");
			String type = input.nextLine();
			if(type.equals("a")){
				multiChoice();
				finished = true;
			} else if (type.equals("b")){
				trueFalse();
				finished = true;
			} else {
				System.out.println("That's not a choice.");
			}
		}


	}

	@SuppressWarnings("resource")
	public static void multiChoice(){
		StudentSimulator student = new StudentSimulator();
		String question = "";
		String answer = "";
		String a="",b="",c="",d="";
		Scanner choice = new Scanner(System.in);
		
		System.out.println("What is the question? ");
		question = choice.nextLine();
		
		for(int i = 0; i < 4; i++){
			System.out.println("What are the choices? ");
			if(i == 0)
				a = choice.nextLine();
			if(i == 1)
				b = choice.nextLine();
			if(i == 2)
				c = choice.nextLine();
			if(i == 3)
				d = choice.nextLine();
		}
		System.out.println("Which option is the answer?");
		answer = choice.nextLine();
		
		iVote ivote = new MultiChoice(a,b,c,d);
		ivote.setQuestion(question);
		ivote.setAnswer(answer);
		for(int i = 0; i < 35; i++){
			student.simulateMC();
			ivote.placeVote(student.getID(), student.getAnswer());
		}
		ivote.display();
	}

	public static void trueFalse(){

		StudentSimulator student = new StudentSimulator();
		String question = "";
		String answer = "";
		Scanner choice = new Scanner(System.in);
		
		System.out.println("What is the question? ");
		question = choice.nextLine();
		
		System.out.println("Which option is the answer?");
		answer = choice.nextLine();
		
		iVote ivote = new TrueFalse();
		ivote.setQuestion(question);
		ivote.setAnswer(answer);
		for(int i = 0; i < 35; i++){
			student.simulateTF();
			ivote.placeVote(student.getID(), student.getAnswer());
		}
		ivote.display();
	}
}
