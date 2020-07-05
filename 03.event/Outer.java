package site.itwill.event;

//�ܺ�Ŭ����(Outer Ŭ����) : ����Ŭ������ ����� Ŭ����
//=> ����Ŭ������ �ν��Ͻ��� �����Ͽ� �ʵ�� �޼ҵ� ���
public class Outer {
	private int outerNum;
	
	//������
	public Outer() {
	
	}

	public Outer(int outerNum) {
		super();
		this.outerNum = outerNum;
	}

	//�޼ҵ�
	public int getOuterNum() {
		return outerNum;
	}

	public void setOuterNum(int outerNum) {
		this.outerNum = outerNum;
	}
	
	public void outerDisplay() {
		System.out.println("outerNum = "+outerNum);
		
	}
	
	public void outerInnerDisplay() {
		//System.out.println("innerNum = "+innerNum);
		
		//����Ŭ������ �̿��Ͽ� �ν��Ͻ� ����
		Inner inner=new Inner(100);
		//System.out.println("innerNum = "+inner.innerNum);
		inner.innerDisplay();
	}
	
	//����Ŭ����(Inner Class) : Ŭ���� �ȿ� ����� Ŭ����
	//=> �ܺ�Ŭ������ ����� �ʵ�� �޼ҵ忡 ���� ����
	public class Inner{
		private int innerNum;
		
		//������
		public Inner() {
			
		}

		public Inner(int innerNum) {
			super();
			this.innerNum = innerNum;
		}

		//�޼ҵ�
		public int getInnerNum() {
			return innerNum;
		}

		public void setInnerNum(int innerNum) {
			this.innerNum = innerNum;
		}
		
		public void innerDisplay() {
			System.out.println("innerNum = "+innerNum);
		}
		
		public void innerOuterDisplay() {
			//System.out.println("outerNum = "+outerNum);
			outerDisplay();
			
		}
		
	}
	
	//�������� Ŭ����(Nested Class) : Ŭ���� �ȿ� ����� Static Ŭ����
	//=> �ܺ�Ŭ������ ����� �ʵ�� �޼ҵ忡 ���� �Ұ���
	//=> �ܺ�Ŭ������ ����� �����ʵ�� �����޼ҵ忡 ���� ����
	//=> �ܺ�Ŭ������ ���� �ٸ� Ŭ�������� ��� ������ Ŭ����
	public static class Nested {
		private int nestedNum;
		
		public Nested() {
			// TODO Auto-generated constructor stub
		}

		public Nested(int nestedNum) {
			super();
			this.nestedNum = nestedNum;
		}

		public int getNestedNum() {
			return nestedNum;
		}

		public void setNestedNum(int nestedNum) {
			this.nestedNum = nestedNum;
		}
		
		public void nestedDisplay() {
			System.out.println("nested");
		}
		
	}
	
	
	
}






















