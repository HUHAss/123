public class HelloWorld{
	public static void mian(String[] args){
		sayHello(sum());
	}
	
	public static void sayHello(int sum){
		System.out.println("Hello World!"+sum);
	}
	
	public static int sum(){
		int sum = 0;
		for(int i=0;i<=100;i++){
			
			sum +=i;
		}
		return 0;
	}
}
	
     

   