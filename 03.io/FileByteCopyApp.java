package site.itwill.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//�������Ͽ� ����� ���� ���õ����ͷ� �о� Ÿ�����Ͽ� �����Ͽ� �����ϴ� ���α׷�
//=> ��� ���Ͽ� ���� ���� ��� ����
public class FileByteCopyApp {
	public static void main(String[] args) throws IOException {
		BufferedInputStream in = null;
		BufferedOutputStream out=null;
		
		try{
//			BufferedInputStream : �Է½�Ʈ���� ���޹޾� ��뷮 �Է½�Ʈ������ �����ϴ� Ŭ����
			in=new BufferedInputStream(new FileInputStream("c:/data/Setup.log"));
			
//			BufferedOutputStream : ��½�Ʈ���� ���޹޾� ��뷮 ��½�Ʈ������ �����ϴ� Ŭ����
			out=new BufferedOutputStream(new FileOutputStream("c:/data/Setup_byte.log"));
			
			int readByte;
			while(true) {
				readByte=in.read();
				if(readByte==-1) break;
				out.write(readByte);
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
