package site.itwill.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

//♥♥♥♥♥♥♥♥♥♥♥♥현재시간 : 19년 11월 20일 15:27 분 새로운 패키지를 만들어서 프로그래밍 시작♥♥♥♥♥♥♥♥♥♥♥♥♥♥
//♥♥♥♥♥♥♥♥♥♥오늘은 거의 이론 수업으로 칠판으로 수업을 많이 했어요♥♥♥♥♥♥♥♥♥♥♥♥♥♥
//♥♥♥♥♥♥♥♥♥♥♥♥♥IP 네트워크 관련 이에용!♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥
//♥♥♥♥♥♥♥♥♥♥♥♥♥형 ㅠㅠ 아프지마세요..오늘 하루 푹쉬시고 힘내셔서 내일 몸 건강히 오세요!~♥♥♥♥♥♥♥♥♥♥♥♥♥
//♥♥♥♥♥♥♥♥♥♥♥♥형이 없으니까 너무 빈자리가 크게 느껴집니다.♥♥♥♥♥♥♥♥♥♥♥♥♥

//InetAddress 클래스 :  네트워크 정보(IP Address, HostName)를 저장하기 위한 클래스
public class InetAddressApp {
	public static void main(String[] args) throws UnknownHostException {
//		InetAddress.getLocalHost() : 로컬 컴퓨터의 네트워크 정보를 반환하는 메소드
//		=> UnknownHostException 발생 : HostName의 컴퓨터를 찾을 수 없는 경우 발생되는 예외
		InetAddress myComputer=InetAddress.getLocalHost();
		
//		InetAddress.toString() : 네트워크 정보를 문자열로 변환하여 반환하는 메소드
//		=> 참조변수를 출력할 경우 메소드 호출 생략 가능
//		System.out.println("myComputer="+myComputer.toString());
		System.out.println("myComputer="+myComputer);
		
//		InetAddress.getHostName() : 네트워크 컴퓨터이름(HostName)을 문자열로 변환하여 반환하는 메소드
		System.out.println("myComputer="+myComputer.getHostName());
		
//		InetAddress.getHostAddress() : IP 주소를 문자열로 변환하여 반환하는 메소드
		System.out.println("myComputer="+myComputer.getHostAddress());
		System.out.println("===================================================================================================================");
//		InetAddress.getByName(String host) : 컴퓨터 이름에 대한 네트워크 정보를 반환하는 메소드
//		- 도메인을 이용한 컴퓨터 이름(DomainHostName)
		InetAddress itwill=InetAddress.getByName("www.itwill.site");
		System.out.println("[www.itwill.site] IP Address ="+itwill.getHostAddress());
		System.out.println("===================================================================================================================");
//		InetAddress.getAllByName(String hostName) : 컴퓨터 이름에 대한 네트워크 정보들을 배열로 반환하는 메소드
		InetAddress[] daum=InetAddress.getAllByName("www.daum.net");
		
		for(InetAddress address:daum) {
			System.out.println("[www.daum.net] IP Address ="+address.getHostAddress());			
		}
		System.out.println("===================================================================================================================");
		
	}

}
