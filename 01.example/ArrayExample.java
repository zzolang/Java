package example;

public class ArrayExample {
	public static void main(String[] args) {
		//����鿡 ���� ���̸� �����ϰ� �ִ� �迭 ����
		int[] age= {27,16,22,36,57,60,43,23,14,29,44,52,69,51,39,33,11};
		
		//�迭�� ����� ������� ��� ���̸� ����Ͽ� ����ϼ���.
		//ex) ��� ���� - 36��
		
		int tot=0;
		int avg=0;
		for(int number : age) {
			tot+=number;
			avg=(int)tot/age.length;
		}
		System.out.println("��ճ��� >> "+avg+"��");
		
		
		System.out.println("======================================================");
		
		//�迭�� ����� ������� ���̸� ���ɺ��� �����Ͽ� �ο����� ����Ͽ� ����ϼ���.
		//ex)	10�� = 3��
		//		20�� = 4��
		//		...
		//		60�� = 2��
		
		int cnt10=0,cnt20=0,cnt30=0,cnt40=0,cnt50=0,cnt60=0;
		
		for(int number : age) {
			if(number>=10 && number<20) cnt10++;
			else if(number>=20 && number<30) cnt20++;
			else if(number>=30 && number<40) cnt30++;
			else if(number>=40 && number<50) cnt40++;
			else if(number>=50 && number<60) cnt50++;
			else if (number>=60) cnt60++;
			}
		System.out.println("10�� = "+cnt10+"��");
		System.out.println("20�� = "+cnt20+"��");
		System.out.println("30�� = "+cnt30+"��");
		System.out.println("40�� = "+cnt40+"��");
		System.out.println("50�� = "+cnt50+"��");
		System.out.println("60�� = "+cnt60+"��");
		
		
	}
}
