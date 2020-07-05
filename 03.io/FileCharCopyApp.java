package site.itwill.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//원본파일에 저장된 값을 인코딩데이터로 읽어 타겟파일에 전달하여 저장하는 프로그램
//=> 텍스트 파일만 복사 기능 제공
public class FileCharCopyApp {
	public static void main(String[] args) throws IOException {
		BufferedReader in = null;
		BufferedWriter out=null;
		
		try{
//			BufferedReader : 입력스트림을 전달받아 대용량 입력스트림으로 생성하는 클래스
//			in=new BufferedReader(new FileReader("c:/data/Setup.log"));
			in=new BufferedReader(new FileReader("c:/data/Setup.exe"));
			
//			BufferedWriter : 출력스트림을 전달받아 대용량 출력스트림으로 생성하는 클래스
//			out=new BufferedWriter(new FileWriter("c:/data/Setup_char.log"));
			out=new BufferedWriter(new FileWriter("c:/data/Setup_byte.exe"));
			
			int readByte;
			while(true) {
				readByte=in.read();
				if(readByte==-1) break;
				out.write(readByte);
				out.flush();
			}
			System.out.println("[메시지]파일을 성공적으로 복사하였습니다.");
		} catch (FileNotFoundException e) {
			System.out.println("[에러]원본파일이 존재하지 않습니다.");
		}finally {
			if(in!=null) in.close();
			if(out!=null) out.close();
		}

	}
}
