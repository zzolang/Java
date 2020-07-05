package site.itwill.io;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

//키보드 입력값을 인코딩데이터(2Byte)로 입력받아 모니터에 전달하는 프로그램
//=> 인코딩데이터 : 원시데이터를 문자 데이터로 변형시킨 값
//=> EOF(End Of File) : 입력종료 - [Ctrl]+[Z]를 입력하면 프로그램 종료
public class CharacterStreamApp {
	public static void main(String[] args) throws IOException {
		System.out.println("[메세지]키보드를 눌러 값을 입력해 주세요.[종료:Ctrl+Z]");
		
		//InputStreamReader(IntputStream in) : InputStream 인스턴스를 전달받아 
		//InputStreamReader 인스턴스를 생성하기 위한 생성자
		//=> 원시데이터 대신 인코딩데이터를 입력받을 수 있는 스트림으로 확장
		InputStreamReader in = new InputStreamReader(System.in);
		
		//OutputStreamWriter(OutputStream out) : OutputStream 인스턴스를 전달받아 
		//OutputStreamWriter 인스턴스를 생성하기 위한 생성자
		//=> 원시데이터 대신 인코딩데이터를 출력 받을 수 있는 스트림으로 확장
		//OutputStreamWriter out = new OutputStreamWriter(System.out);
		//PrintWriter 클래스 : OutputStreamWriter 클래스를 상속받은 자식클래스(자식이 더 메소드가 많음)
		PrintWriter out=new PrintWriter(System.out);
		
		int readByte;
		
		while(true) {
			//입력스트림에서 입력값을 인코딩데이터를 읽어 반환받아 저장
			readByte=in.read();
			if(readByte==-1) break;
			
			//인코딩데이터로 변환하여 출력스트림으로 전달
			//=> Writer 관련 출력클래스는 값을 출력버퍼에 모아서 한번에 출력스트림에 전달
			out.write(readByte);
			//Writer.flush() : 출력버퍼에 존재하는 인코딩데이터를 출력스트림으로 전달하는 메소드
			out.flush();
			
		}
		
		System.out.println("[메세지]프로그램을 종료합니다.");
	}

}
