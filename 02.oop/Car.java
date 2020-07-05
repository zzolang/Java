package oop;


//����������(Access Modifies) : private, protected, public
//private : Ŭ���� ���ο��� ���� �����ϸ� Ŭ���� �ܺο��� ���� �Ұ��� �ϵ��� �����ϴ� Ű����
// => �ʵ� ����� ����ϸ� ����ȭ ó��
//public : ��� ��Ű���� Ŭ�������� ���� �����ϵ��� �����ϴ� Ű����
// => �޼ҵ� ����� ����Ͽ� ���� ó�� 
public class Car {
	//�ʵ�(Field) : ��� ���� �Ӽ��� ����
	private String modelName;//�𵨸�
	private boolean engineStatus;//�������� >> �õ�(false : OFF, true : ON)
	private int currentSpeed;//����ӵ�
	
	//������(Constructor) : ��ü ������ �����ϱ� ���� �޼ҵ�
	//=> ���� : �⺻������(Default Constructor)�� ���������� ����Ǿ� ���
	
	//�޼ҵ�(Method) : ��� ���� ������ ����
	// => �ʵ带 �̿��Ͽ� ���ϴ� ��� ����
	public void startEngine() {//�õ��� �Ѵ� �޼ҵ�
		engineStatus=true;
		System.out.println(modelName+"�� �õ��� �׽��ϴ�.");
	}
	
	public void stopEngine() {//�õ��� ���� �޼ҵ�
		if(currentSpeed>0) {
			/*
			currentSpeed=0;
			System.out.println(modelName+"��(��) ������ϴ�.");
			*/
			//�޼ҵ� ���ο��� �ٸ� �޼ҵ� ȣ�� ����
			speedZero();
		}
		
		engineStatus=false;
		System.out.println(modelName+"�� �õ��� �����ϴ�.");
	}
	
	public void speedUp(int speed) {//�ӵ��� ���� ��Ű�� �޼ҵ�
		if(!engineStatus) {//�õ��� ���� �ִ� ���
			System.out.println(modelName+"�� �õ��� ���� �ֽ��ϴ�.");
			return;
		}
		
		if(currentSpeed+speed>150) {
			speed=150-currentSpeed;
		}
		
		currentSpeed+=speed;
		System.out.println(modelName+"�� �ӵ��� "+speed+"��ŭ ���� �Ǿ����ϴ�. ���� �ӵ���"+currentSpeed+"km/h �Դϴ�.");
	}
	
	
	public void speedDown(int speed) {//�ӵ��� ���� ��Ű�� �޼ҵ�
		if(!engineStatus) {//�õ��� ���� �ִ� ���
			System.out.println(modelName+"�� �õ��� ���� �ֽ��ϴ�.");
			return;
		}
		
		if(currentSpeed<speed) {
			speed=currentSpeed;
		}
		currentSpeed-=speed;
		System.out.println(modelName+"�� �ӵ��� "+speed+"��ŭ ���� �Ǿ����ϴ�. ���� �ӵ���"+currentSpeed+"km/h �Դϴ�.");
	}

	
	public void speedZero() {//�ӵ��� 0���� �����ϴ� �޼ҵ�
		currentSpeed=0;
		System.out.println(modelName+"��(��) ������ϴ�.");
	}
	
	//����ȭ ����� �ʵ��� �ʵ尪�� ��ȯ�ϴ� �޼ҵ�(Getter)�� �ʵ尪�� �����ϴ� �޼ҵ�(Setter) ���� => ĸ��ȭ
	//ĸ��ȭ �޼ҵ� �ۼ� ����Ű >> [Alt]+[Shift]+[S] >> [R]  >> �ʵ� ���� >> Generator
	public String getModelName() { 
		//�ʵ忡 ����� �� ��ȯ
		return modelName;	
	}
	
	public void setModelName(String name) {
		//�Ű������� ���޵Ǿ� ����� ���� �̿��Ͽ� �ʵ尪 ����
		// => �Ű������� ����� ���� ���� ��ȿ�� �˻�
		this.modelName=name; 
	}
	
	//�ʵ��� �ڷ����� boolean�̸� Getter �޼ҵ� ��� Is �޼ҵ� ����
	public boolean isEngineStatus() {
		return engineStatus;
	}

	public void setEngineStatus(boolean engineStatus) {
		this.engineStatus = engineStatus;
	}

	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(int currentSpeed) {
		if(currentSpeed!=0) {
			currentSpeed=0;
			
		}
		this.currentSpeed = currentSpeed;
	}
	
		
}
