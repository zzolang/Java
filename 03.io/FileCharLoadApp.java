package site.itwill.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

//���Ͽ� ����� ���� ���ڵ������ͷ� �о� ����Ϳ� �����Ͽ� ����ϴ� ���α׷�

public class FileCharLoadApp {
	public static void main(String[] args) throws IOException {
		System.out.println("[�޼���]c:\\data\\char.txt ���Ͽ� ����� �����Դϴ�.");
//		FileReader Ŭ���� : ���Ͽ� �Է½�Ʈ���� �����ϴ� Ŭ����
//		=> FileReader(String fileName) : ���ϰ�θ� ���޹޾� �Է½�Ʈ���� ������ִ� ������
//		=> ���ϰ�ο� ������ �������� ���� ��� FileNotFoundException �߻� - ����ó��
		FileReader in=null;
		try {
			in=new FileReader("c:\\data\\char.txt");
			
		OutputStreamWriter out = new OutputStreamWriter(System.out);
//		PrintWriter	out = new PrintWriter(System.out);
		
		int readByte;
		
	
			while(true) {
				readByte=System.in.read();
				if(readByte==-1) break;
				out.write(readByte);
				out.flush();
			}
		} catch (FileNotFoundException e) {
			System.out.println("[����]�������Ͽ� �������� �ʽ��ϴ�.");
		} finally {
			//FileReader.close() : ���� �Է½�Ʈ���� �����ϴ� �޼ҵ�
			if(in!=null) in.close();
		}
	}
}
