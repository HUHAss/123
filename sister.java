 public class InputScanner{
	 public static void main (String[] args){
		 final String youngsister = "YOUNGER ";
		 final String oldersister = "OLDER ";
		 final String sister = "SECRET";
		 
		 Scanner scan = new Scanner(System.in);
		 
		 System.our.println("Please input the age of your sister");
		 int age = scan.nextInt();
		 
		 String nickname = sister;
        
		int check = age/18;
		
		switch(check){
			case 0:
			     System.out.println("you are young");
				 break;
			case 1:
                 System.out.println("you are old");
             	break;
            default:
             System.out.println("it is a secret");
                break;			 
		}
		
	 }
	 
 }