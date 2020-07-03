package example;

public class ArrayExample {
	public static void main(String[] args) {
		//사람들에 대한 나이를 저장하고 있는 배열 생성
		int[] age= {27,16,22,36,57,60,43,23,14,29,44,52,69,51,39,33,11};
		
		//배열에 저장된 사람들의 평균 나이를 계산하여 출력하세요.
		//ex) 평균 나이 - 36살
		
		int tot=0;
		int avg=0;
		for(int number : age) {
			tot+=number;
			avg=(int)tot/age.length;
		}
		System.out.println("평균나이 >> "+avg+"살");
		
		
		System.out.println("======================================================");
		
		//배열에 저장된 사람들의 나이를 연령별로 구분하여 인원수를 계산하여 출력하세요.
		//ex)	10대 = 3명
		//		20대 = 4명
		//		...
		//		60대 = 2명
		
		int cnt10=0,cnt20=0,cnt30=0,cnt40=0,cnt50=0,cnt60=0;
		
		for(int number : age) {
			if(number>=10 && number<20) cnt10++;
			else if(number>=20 && number<30) cnt20++;
			else if(number>=30 && number<40) cnt30++;
			else if(number>=40 && number<50) cnt40++;
			else if(number>=50 && number<60) cnt50++;
			else if (number>=60) cnt60++;
			}
		System.out.println("10대 = "+cnt10+"명");
		System.out.println("20대 = "+cnt20+"명");
		System.out.println("30대 = "+cnt30+"명");
		System.out.println("40대 = "+cnt40+"명");
		System.out.println("50대 = "+cnt50+"명");
		System.out.println("60대 = "+cnt60+"명");
		
		
	}
}
