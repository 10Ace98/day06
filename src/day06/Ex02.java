package day06;


import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
//		int array[]= {1,2,3};
//		String srray[]= {"hello","hi","hell"};
//		
//		System.out.println(array[0]);
//		System.out.println(array[1]);
//		System.out.println(array[2]);
//		
//		int arr[]=new int[5];//공간 할당하며 생성
//		int num=3;			//변수에 인덱스 번호 지정해서 넣어서도 가능
//		arr[num]=500;
//		arr[0]=100;
//		arr[1]=200;
//		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
//		
//		String srr[] =new String[2];
//		srr[0]="Ssdf";
//		System.out.println(srr[0]);
//		System.out.println(srr[1]);
//		
//		
//		for(int i=0;i<5;i++) {
//			arr[i]=100*i;
//			System.out.println("arr["+i+"] : "+ arr[i]);
//		}
//		System.out.println();
//		
//		for(int i=1;i<=arr.length;i++) {
//			arr[i-1]=100*i;
//			System.out.println("arr["+(i-1)+"] : "+ arr[i-1]);
//		}
//		System.out.println();
		
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=100*(i+1);
//			System.out.println("arr["+i+"] : "+ arr[i]);
//		}
		
		
//		int [] arr =new int[] {10,20,30,40};
//		int [] arr = {10,20,30,40};
//		for(int s : arr) {
//			System.out.println(s);
//		}
//		
//		String [] name=new String[3];
//		Scanner	scan=new Scanner(System.in);
//		for(int i=0;i<name.length;i++)
//		{
//			System.out.println(i+1+" 번째 이름 입력 >>>");
//			name[i]=scan.next();
//		} 
//		
//		for(String n : name) {
//			System.out.println("이름 : "+n);
//		}
		
//		int arr[] =new int [] {10,54,13,17,25,30};
//		
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]%2==0) {
//				System.out.println("짝수 : "+arr[i]);
//			}else{
//				System.out.println("홀수 : "+arr[i]);
//			}
//		}
		
		//자연수 N을 입력받아, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
		
//		System.out.println("숫자 입력 >>>");
//		int user=scan.nextInt();
//		for(int i=1; i<=user;i++) {
//			System.out.println(i);
//		}
		
		
//		0보다 크거나 같고, 99보다 작거나 같은 정수가 주어질 때 다음과 같은 연산을 할 수 있다. 
//		먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다. 
//		그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다. 다음 예를 보자.
//
//		
//
//		위의 예는 4번만에 원래 수로 돌아올 수 있다. 따라서 26의 사이클의 길이는 4이다.
//
//		N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.
		
		
		int tmp=0;
		int su1=0,su2=0,su3=0;
		int sum=0;
		int answer=1;
		int count=0;
		
		System.out.println("숫자 입력 >>>");
		int user=scan.nextInt();
		if(user/10==0) {
			user*=10;
		}
		su1=user/10;
		su2=user%10;	
		while(answer==1) {
			
			sum=su1+su2;
			su3=(su2*10)+sum%10;
			
			su1=su3/10;
			su2=su3%10;

			count++;

			if(su3==user) {
				answer=0;
			}
		}
		System.out.println("총 "+count+" 번의 싸이클을 돌았습니다");
		//26부터 시작한다. 2+6 = 8이다. 새로운 수는 68이다. 6+8 = 14이다. 새로운 수는 84이다. 8+4 = 12이다. 새로운 수는 42이다. 4+2 = 6이다. 새로운 수는 26이다.
		
		
		
		
		
			
		
		
		
		
		
		
		
	}
	
	
}

