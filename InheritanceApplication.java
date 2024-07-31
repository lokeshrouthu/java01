package oopsInCodingHub;
import java.util.Scanner;
public class InheritanceApplication {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BSC bsc=new BSC();
		BTech btech=new BTech();
		MTech mtech=new MTech();
		MSC msc=new MSC();
		bsc.display();
		bsc.college();
		String s=sc.next();
		String s1="intermediate";
		if(s.equalsIgnoreCase(s1)) { 
			bsc.course();
			s=sc.next();
			
		}
		else if(s.equalsIgnoreCase("ug")){
			msc.course();
			s=sc.next();
		}
		
		switch(s) {
		case "bsc":
			System.out.println("BSc Sub Brancehes are \n1.MEC\n2.MCC\n3.MCCS\n4.MECS");
			bsc.branch();
			break;
		case "btech":
			System.out.println("B-Tech sub Brannhes are \n1.CSE\n2.CSE(AI&ML)\n3.IT\n4.ECE\n5.CIVIL\n5.MECH");
			btech.branch();
			break;
		case "mtech":
			System.out.println("M-Tech sub Branches are\n1.Computer\n2.Aeronatical");
			mtech.branch();
			break;
		case "msc":
			System.out.println("M-Sc sub Branches are \n1.Maths\n2.Physics\n3.Chemistry");
			msc.branch();
			break;
		default:
			System.out.println("Not selecte any one ");
			break;
		}
	}
}
class Jntuk{
	Scanner sc=new Scanner(System.in);
	void display() {
		System.out.println("Welecome to Jntuk University");
	}

}
class College extends Jntuk{
	void college() {
		System.out.println("Welcome to Khit College ");
		System.out.println("Are you completed \n1.Intermediate \n2.UG");
		
		
	}
}
class PG extends College{
	void course() {
		System.out.println("Are you intrest in \n1.MSC\n2.M-TECH");
	}
	
}
class UG extends College{
	void course() {
		System.out.println("Are you intrest in \n1.BSC\n2.B-TECH");
	}
}
class BSC extends UG{
	void branch() {
		String s=sc.next();
		switch(s) {
		case "mec":
			System.out.println("Mec fees is 25000");
			break;
		case "mcc":
			System.out.println("Mcc fees is 30000");
			break;
		case "mccs":
			System.out.println("Mec fees is 40000");
			break;
		case "mecs":
			System.out.println("Mec fees is 35000");
			break;
			default:
				System.out.println("Not other course we are offer ");
				break;
			
		}
	}
}
class BTech extends UG{
	void branch() {
		System.out.println("Enter Eamcet Rank ");
		int rank=sc.nextInt();
		int scol=0;
		double fee=0;
		if(rank<25000) {
			scol=75;
		}
		else if(rank<50000)
			scol=50;
		else if(rank<75000)
			scol=25;
		else
			scol=0;
		System.out.println("Choose branch ");
		int s=sc.nextInt();
		switch(s) {
		case 1:
			System.out.println("Enter fee");
			fee=sc.nextDouble();
			fee=fee-((scol*fee)/100);
			System.out.println("Compute science fees is "+fee);
			break;
		case 2:
			System.out.println("Enter fee");
			fee=sc.nextDouble();
			fee=fee-((scol*fee)/100);
			System.out.println("Compute science in Artificial intelligence  fees is "+fee);
			break;
		case 3:
			System.out.println("Enter fee");
			fee=sc.nextDouble();
			fee=fee-((scol*fee)/100);
			System.out.println("Compute science in Artificial intelligence  fees is "+fee);
			break;
		case 4:
			System.out.println("Enter fee");
			fee=sc.nextDouble();
			fee=fee-((scol*fee)/100);
			System.out.println("Compute science in Artificial intelligence  fees is "+fee);
			break;
		case 5:
			System.out.println("Enter fee");
			fee=sc.nextDouble();
			fee=fee-((scol*fee)/100);
			System.out.println("Compute science in Artificial intelligence  fees is "+fee);
			break;
			default:
				System.out.println("Invalid course");	
		}
	}
	
}
class MSC extends PG{
	void branch() {
		System.out.println("Enter ICET Rank");
		int rank=sc.nextInt();
		int scol=0;
		double fee=0;
		if(rank<5000) {
			scol=40;
		}
		else if(rank<15000)
			scol=25;
		else if(rank<30000)
			scol=15;
		else
			scol=0;
		System.out.println("Choose branch ");
		int s=sc.nextInt();
		switch(s) {
		case 1:
			System.out.println("Enter fee");
			fee=sc.nextDouble();
			fee=fee-((scol*fee)/100);
			System.out.println("Maths fees is "+fee);
			break;
		case 2:
			System.out.println("Enter fee");
			fee=sc.nextDouble();
			fee=fee-((scol*fee)/100);
			System.out.println("Physics fees is "+fee);
			break;
		case 3:
			System.out.println("Enter fee");
			fee=sc.nextDouble();
			fee=fee-((scol*fee)/100);
			System.out.println("Chemistry fees is "+fee);	
			default:
				
		}
	}
	
}
class MTech extends PG{
	void branch() {
		System.out.println("Enter PGCET Rank");
		int rank=sc.nextInt();
		int scol=0;
		double fee=0;
		if(rank<5000) {
			scol=40;
		}
		else if(rank<15000)
			scol=25;
		else if(rank<30000)
			scol=15;
		else
			scol=0;
		System.out.println("Choose branch ");
		int s=sc.nextInt();
		do {
		switch(s) {
		case 1:
			System.out.println("Enter fee");
			fee=sc.nextDouble();
			fee=fee-((scol*fee)/100);
			System.out.println("Compute science fees is "+fee);
			break;
		
		case 2:
			System.out.println("Enter fee");
			fee=sc.nextDouble();
			fee=fee-((scol*fee)/100);
			System.out.println("Aeronatical fees is "+fee);
			break;
			default:
				System.out.println("M-Tech sub Branches are\n1.Computer\n2.Aeronatical");
				System.out.println("Choose above branches branch ");
		}
		System.out.println("enter des");
		String des=sc.next();
		if(des.equalsIgnoreCase("yes")) {
			System.out.println("choose branches");
			s=sc.nextInt();
		}
		else
			break;
		}while(true);
	}
}
