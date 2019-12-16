public class TheThirdItem{ 

public static void main(String[] args){ 

Scanner scan = new Scanner(System.in); 

int age; 

System.out.println("请输入年龄："); 

age = scan.nextInt(); 

if(age > 18) { 

System.out.println("大姐姐"); 

} 

else { 

System.out.println("小姐姐"); 

} 

} 

}