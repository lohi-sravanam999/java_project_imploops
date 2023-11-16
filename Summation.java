class Summation
{
	public static void main(String[] args) 
	{
		int num=987,rem,sum=0;
		while(num!=0){
			rem=num%10;
			sum=sum+rem;
			num/=10;
		}
		System.out.println(sum);
	}
}
