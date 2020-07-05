package site.itwill.io;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

//Ű���� �Է°��� ���ڵ�������(2Byte)�� �Է¹޾� ����Ϳ� �����ϴ� ���α׷�
//=> ���ڵ������� : ���õ����͸� ���� �����ͷ� ������Ų ��
//=> EOF(End Of File) : �Է����� - [Ctrl]+[Z]�� �Է��ϸ� ���α׷� ����
public class CharacterStreamApp {
	public static void main(String[] args) throws IOException {
		System.out.println("[�޼���]Ű���带 ���� ���� �Է��� �ּ���.[����:Ctrl+Z]");
		
		//InputStreamReader(IntputStream in) : InputStream �ν��Ͻ��� ���޹޾� 
		//InputStreamReader �ν��Ͻ��� �����ϱ� ���� ������
		//=> ���õ����� ��� ���ڵ������͸� �Է¹��� �� �ִ� ��Ʈ������ Ȯ��
		InputStreamReader in = new InputStreamReader(System.in);
		
		//OutputStreamWriter(OutputStream out) : OutputStream �ν��Ͻ��� ���޹޾� 
		//OutputStreamWriter �ν��Ͻ��� �����ϱ� ���� ������
		//=> ���õ����� ��� ���ڵ������͸� ��� ���� �� �ִ� ��Ʈ������ Ȯ��
		//OutputStreamWriter out = new OutputStreamWriter(System.out);
		//PrintWriter Ŭ���� : OutputStreamWriter Ŭ������ ��ӹ��� �ڽ�Ŭ����(�ڽ��� �� �޼ҵ尡 ����)
		PrintWriter out=new PrintWriter(System.out);
		
		int readByte;
		
		while(true) {
			//�Է½�Ʈ������ �Է°��� ���ڵ������͸� �о� ��ȯ�޾� ����
			readByte=in.read();
			if(readByte==-1) break;
			
			//���ڵ������ͷ� ��ȯ�Ͽ� ��½�Ʈ������ ����
			//=> Writer ���� ���Ŭ������ ���� ��¹��ۿ� ��Ƽ� �ѹ��� ��½�Ʈ���� ����
			out.write(readByte);
			//Writer.flush() : ��¹��ۿ� �����ϴ� ���ڵ������͸� ��½�Ʈ������ �����ϴ� �޼ҵ�
			out.flush();
			
		}
		
		System.out.println("[�޼���]���α׷��� �����մϴ�.");
	}

}
