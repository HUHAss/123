public class PyramidTest{
	public static void main(String[] args){
		int i=5;
		for (int j=1;j<=5;j++){
			int times=j;
			while(times!=0){
				System.out.print("*");
				times--;
			}
			System.out.print("\n");
		}	
	}
}