package example;

public class VariableExample {
	public static void main(String[] args) {
		//������ ���̰� 7�̰� ������ ���̰� 10�� �簢���� ������ ��� �簢���� ���̸� ����Ͽ� ���
		int garo=7;
		int sero=10;
		System.out.println("�簢���� ���� = "+garo*sero);
		System.out.println("=============================================");
		
		/* �ش�
		 int garo=7,sero=10;
		 int nulbe=garo*sero;
		 System.out.println("�簢���� ���� = "+nulbe);
		*/
				
		
		//���̰� 9�̰� �غ��� ���̰� 7�� �ﰢ���� ������ ��� �ﰢ���� ���̸� ����Ͽ� ���
		int heigt=9;
		int ground=7;
		System.out.println("�ﰢ���� ���� = "+(double)heigt*ground/2);
		System.out.println("=============================================");
		
		/* �ش�
		 int ����=9,����=7;
		 double ����=����*����/2.0; // ��õ���
		 double ����=(double)����*����/2; //�������, ���̸� ������ ����ȯ �Ҷ� �ð��� ���� �� �ɸ�.
		 System.out.println("�ﰢ���� ���� = "+����);
		*/
		
		//10���� ��ü ������ �հ谡 759Kg�� ��� ��� �����Ը� ����Ͽ� ���
		int momuge=759;
		System.out.println("��� ������ = "+(double)momuge/10.0+"Kg");
		System.out.println("=============================================");	
		
		/*
		 int count=10,totWeight=759;
		 double avgWeight=(double)totWeight/count;
		 System.out.println("��� ������ = "+avgWeight+"Kg");
		*/
		
		//�̸��� "ȫ�浿"�� �л��� �������� 89��, �������� 93��, �������� 95���� �޾��� ���
		//������ ����� ����Ͽ� �̸�, ����, ����� ���
		//��, ����� �Ҽ��� �� �ڸ������� ����ϰ� �������� ���� ó���Ͽ� ��� �ۼ�
		int kor=89;
		int eng=93;
		int math=95;
		String name="ȫ�浿";

		System.out.println("�̸� = "+name);
		System.out.println("���� = "+(kor+eng+math));
		
		double avr=(double)(kor+eng+math)/3;
		//System.out.println("��� = "+avr);
		
		System.out.println("��� = "+(int)(avr*10)/10.);	
		
		/* �ش�
		 String="ȫ�浿";
		 int kor=89;,eng=93;,mat=95;
		 int tot=kor+eng+mat;
		 
		 double avg=tot/3.;
		 double avg=(double)tot/3;//�������
		 
		System.out.println("�̸� = "+name+", ���� = "+tot+", ��� = "+(int)(avg*10)/10.);
		
		*/
		
		
	}
}
