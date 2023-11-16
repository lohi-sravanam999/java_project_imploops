class Pro
{
	public static void main(String[] args) 
	{
		int num=987,pro=1,rem;
		while(num!=0){
			rem=num%10;
			pro=pro*rem;
			num/=10;
		}
			if(pro%2==0){
		System.out.println("pro is even"+pro);
			}
			else{
				System.out.println("pro is odd"+pro);
			}
		

	}
}
