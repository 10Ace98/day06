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
//		int arr[]=new int[5];//���� �Ҵ��ϸ� ����
//		int num=3;			//������ �ε��� ��ȣ �����ؼ� �־�� ����
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
//			System.out.println(i+1+" ��° �̸� �Է� >>>");
//			name[i]=scan.next();
//		} 
//		
//		for(String n : name) {
//			System.out.println("�̸� : "+n);
//		}
		
//		int arr[] =new int [] {10,54,13,17,25,30};
//		
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]%2==0) {
//				System.out.println("¦�� : "+arr[i]);
//			}else{
//				System.out.println("Ȧ�� : "+arr[i]);
//			}
//		}
		
		//�ڿ��� N�� �Է¹޾�, 1���� N���� �� �ٿ� �ϳ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
//		System.out.println("���� �Է� >>>");
//		int user=scan.nextInt();
//		for(int i=1; i<=user;i++) {
//			System.out.println(i);
//		}
		
		
//		0���� ũ�ų� ����, 99���� �۰ų� ���� ������ �־��� �� ������ ���� ������ �� �� �ִ�. 
//		���� �־��� ���� 10���� �۴ٸ� �տ� 0�� �ٿ� �� �ڸ� ���� �����, �� �ڸ��� ���ڸ� ���Ѵ�. 
//		�� ����, �־��� ���� ���� ������ �ڸ� ���� �տ��� ���� ���� ���� ������ �ڸ� ���� �̾� ���̸� ���ο� ���� ���� �� �ִ�. ���� ���� ����.
//
//		
//
//		���� ���� 4������ ���� ���� ���ƿ� �� �ִ�. ���� 26�� ����Ŭ�� ���̴� 4�̴�.
//
//		N�� �־����� ��, N�� ����Ŭ�� ���̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		
		int tmp=0;
		int su1=0,su2=0,su3=0;
		int sum=0;
		int answer=1;
		int count=0;
		
		System.out.println("���� �Է� >>>");
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
		System.out.println("�� "+count+" ���� ����Ŭ�� ���ҽ��ϴ�");
		//26���� �����Ѵ�. 2+6 = 8�̴�. ���ο� ���� 68�̴�. 6+8 = 14�̴�. ���ο� ���� 84�̴�. 8+4 = 12�̴�. ���ο� ���� 42�̴�. 4+2 = 6�̴�. ���ο� ���� 26�̴�.
		
		
		
		
		
			
		
		
		
		
		
		
		
	}
	
	
}

