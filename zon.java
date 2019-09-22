public class Caculate{
	public static void main(String[] args){
		int res;
		int n1 = 12;
		int n2 = 24;
		int n3 = 16;
		int n4 = 3;
		double d;
		double v1 = 10.0;
		double v2 = 3.1416;
		res = n1/n4;
		System.out.printf("res = %d\n",res);
		d = n1/n4;
		System.out.printf("d = %.2f\n",d);
		res = n3/n4;
		System.out.printf("res = %d\n",res);
		d = v1/n4;
		System.out.printf("d = %.2f\n",d);
		d = n3/n4;
		System.out.printf("d = %.2f\n",d);
		d = v1/v2;
		System.out.printf("d = %.2f\n",d);
		res = n1/n2;
		System.out.printf("res = %d\n",res);
		d = (double)n1/n2;
		System.out.printf("d = %lf",d);
		d = n1/(double)n2;
		System.out.printf("d = %lf",d);
		d = (double)(n1/n2);
		System.out.printf("d = %lf",d);
	}
}