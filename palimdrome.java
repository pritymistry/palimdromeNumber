class palimdrome{
	public static void main(String args[]){

		int n=Integer.parseInt(args[0]);
		int arr[]= new int[n];

		for(int i=0;i<n;i++){
			arr[i]=Integer.parseInt(args[i+1]);
		}

		int rem,sum=0;
		int temp;
		System.out.println("palimdrome numbers: ");
		for(int i=0; i<n; i++){
			isPalimdrome(arr[i]);		
		}
	}
	static void isPalimdrome(int num){
		int rem,sum=0,temp=num;
		while(num>0){
				rem=num%10;
				num=num/10;
				sum=(sum*10)+rem;
			}
		if(temp==sum)
			System.out.println(temp);
	}
}


