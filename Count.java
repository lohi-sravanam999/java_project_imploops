class Count 
{
	public static void main(String[] args) 
	{
		int num=724,count=0,res;
		while(num!=0){
			res=num%10;
			num/=10;
			count++;
			
		}
		
		System.out.println(count);
	}
}
