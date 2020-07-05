package site.itwill.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//�������Ͽ� ����� ���� ���ڵ������ͷ� �о� Ÿ�����Ͽ� �����Ͽ� �����ϴ� ���α׷�
//=> �ؽ�Ʈ ���ϸ� ���� ��� ����
public class FileCharCopyApp {
	public static void main(String[] args) throws IOException {
		BufferedReader in = null;
		BufferedWriter out=null;
		
		try{
//			BufferedReader : �Է½�Ʈ���� ���޹޾� ��뷮 �Է½�Ʈ������ �����ϴ� Ŭ����
//			in=new BufferedReader(new FileReader("c:/data/Setup.log"));
			in=new BufferedReader(new FileReader("c:/data/Setup.exe"));
			
//			BufferedWriter : ��½�Ʈ���� ���޹޾� ��뷮 ��½�Ʈ������ �����ϴ� Ŭ����
//			out=new BufferedWriter(new FileWriter("c:/data/Setup_char.log"));
			out=new BufferedWriter(new FileWriter("c:/data/Setup_byte.exe"));
			
			int readByte;
			while(true) {
				readByte=in.read();
				if(readByte==-1) break;
				out.write(readByte);
				out.flush();
			}
			System.out.println("[�޽���]������ ���������� �����Ͽ����ϴ�.");
		} catch (FileNotFoundException e) {
			System.out.println("[����]���������� �������� �ʽ��ϴ�.");
		}finally {
			if(in!=null) in.close();
			if(out!=null) out.close();
		}

	}
}
