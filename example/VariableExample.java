package example;

public class VariableExample {
	public static void main(String[] args) {
		//가로의 길이가 7이고 세로의 길이가 10인 사각형이 존재할 경우 사각형의 넓이를 계산하여 출력
		int garo=7;
		int sero=10;
		System.out.println("사각형의 넓이 = "+garo*sero);
		System.out.println("=============================================");
		
		/* 해답
		 int garo=7,sero=10;
		 int nulbe=garo*sero;
		 System.out.println("사각형의 넓이 = "+nulbe);
		*/
				
		
		//높이가 9이고 밑변의 길이가 7인 삼각형이 존재할 경우 삼각형의 넓이를 계산하여 출력
		int heigt=9;
		int ground=7;
		System.out.println("삼각형의 넓이 = "+(double)heigt*ground/2);
		System.out.println("=============================================");
		
		/* 해답
		 int 높이=9,길이=7;
		 double 넓이=높이*길이/2.0; // 추천방법
		 double 넓이=(double)높이*길이/2; //권장안함, 높이를 강제로 형변환 할때 시간이 조금 더 걸림.
		 System.out.println("삼각형의 넓이 = "+넓이);
		*/
		
		//10명의 전체 몸무게 합계가 759Kg인 경우 평균 몸무게를 계산하여 출력
		int momuge=759;
		System.out.println("평균 몸무게 = "+(double)momuge/10.0+"Kg");
		System.out.println("=============================================");	
		
		/*
		 int count=10,totWeight=759;
		 double avgWeight=(double)totWeight/count;
		 System.out.println("평균 몸무게 = "+avgWeight+"Kg");
		*/
		
		//이름이 "홍길동"인 학생이 국어점수 89점, 영어점수 93점, 수학점수 95점을 받았을 경우
		//총점과 평균을 계산하여 이름, 총점, 평균을 출력
		//단, 평균은 소수점 한 자리까지만 출력하고 나머지는 절삭 처리하여 출력 작성
		int kor=89;
		int eng=93;
		int math=95;
		String name="홍길동";

		System.out.println("이름 = "+name);
		System.out.println("총점 = "+(kor+eng+math));
		
		double avr=(double)(kor+eng+math)/3;
		//System.out.println("평균 = "+avr);
		
		System.out.println("평균 = "+(int)(avr*10)/10.);	
		
		/* 해답
		 String="홍길동";
		 int kor=89;,eng=93;,mat=95;
		 int tot=kor+eng+mat;
		 
		 double avg=tot/3.;
		 double avg=(double)tot/3;//권장안함
		 
		System.out.println("이름 = "+name+", 총점 = "+tot+", 평균 = "+(int)(avg*10)/10.);
		
		*/
		
		
	}
}
