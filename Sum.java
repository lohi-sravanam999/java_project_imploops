class Sum 
{
	public static void main(String[] args) 
	{
		int num=987,sum=0,rem;
		while(num!=0){
			rem=num%10;
			sum=sum+rem;
			num/=10;
		}
			if(sum%2==0){
		System.out.println("sum is even"+sum);
			}
			else{
				System.out.println("sum is odd"+sum);
			}
		

	}
}
