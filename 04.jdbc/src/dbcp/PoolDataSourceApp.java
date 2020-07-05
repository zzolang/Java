package site.itwill.dbcp;

import java.sql.Connection;
import java.sql.SQLException;

import oracle.ucp.jdbc.PoolDataSource;
import oracle.ucp.jdbc.PoolDataSourceFactory;

//javax.sql.DataSource : DBCP Ŭ������ �ۼ��ϱ� ���� ��ӹ޾ƾ� �Ǵ� �������̽�
//=> DBCP Ŭ������ ������ ������ �޼ҵ尡 �����ϵ��� �޼ҵ� �ۼ� ��Ģ ����

//UCP(Universal Connection Pool) ���̺귯���� PoolDataSource Ŭ������ �̿��� ���α׷�
public class PoolDataSourceApp {
	public static void main(String[] args) throws SQLException {
		//PoolDataSourceFactory.getPoolDataSource() : PoolDataSource �ν��Ͻ��� �����Ͽ� ��ȯ�ϴ� �޼ҵ�
		PoolDataSource pds=PoolDataSourceFactory.getPoolDataSource();
		
		//Connection �ν��Ͻ��� �����ϱ� ���� PoolDataSource �ν��Ͻ��� ���� ����
		pds.setConnectionFactoryClassName("oracle.jdbc.driver.OracleDriver");
		pds.setURL("jdbc:oracle:thin:@localhost:1521:xe");
		pds.setUser("scott");
		pds.setPassword("tiger");
		
		//Connection �ν��Ͻ��� ������ �����ϱ� ���� PoolDataSource �ν��Ͻ��� ���� ����
		//=> Connection �ν��Ͻ��� ������ �������� ���� ��� �⺻�� ���
		pds.setInitialPoolSize(2);
		pds.setMaxPoolSize(3);
	
		//PoolDataSource.getConnection() : Connection �ν��Ͻ��� ��ȯ�ϴ� �޼ҵ�
		//=> PoolDataSource �ν��Ͻ��� Connection �ν��Ͻ��� ���� ��� ����
		Connection con1=pds.getConnection();
		pds.getConnection().close();
		System.out.println("con1="+con1);
		System.out.println("��밡���� Connetion ���� = "+pds.getAvailableConnectionsCount());
		//Connection �ν��Ͻ��� �����ϸ� PoolDataSource �ν��Ͻ����� ���ο� Connection �����Ͽ� �߰�
		//- ������ Connection �ν��Ͻ� ���� ����
		con1.close();
		System.out.println("=================================================================");
		System.out.println("��� ������ Connection ���� = "+pds.getAvailableConnectionsCount());
		Connection con2=pds.getConnection();
		pds.getConnection().close();
		System.out.println("con2="+con2);
		System.out.println("��밡���� Connetion ���� = "+pds.getAvailableConnectionsCount());
		con2.close();
		System.out.println("=================================================================");
		Connection con3=pds.getConnection();
		pds.getConnection().close();
		System.out.println("con3="+con3);
		System.out.println("��밡���� Connetion ���� = "+pds.getAvailableConnectionsCount());
		con3.close();
		System.out.println("=================================================================");
		
		System.out.println("��� ������ Connection ���� = "+pds.getAvailableConnectionsCount());
		// ����� �ݳ��� �ƴ϶� ����(�ݳ�����)�ϰ� ���ؼ� Ǯ�� ��� ������ �����ϱ� ���� �����Ѵ�.
		// �ּ����� ������ �����Ϸ��� �ϴµ� �ּ����� ������ŭ ����(�ݳ�����)�� �� ���ٽÿ� ���� �߻�
		
	}

}
