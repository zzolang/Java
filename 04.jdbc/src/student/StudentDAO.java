package site.itwill.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//DAO(Data Access Object) Ŭ���� : �����ü�� ������� �������� ����,����
//,����,�˻� ����� �����ϱ� ���� ������ Ŭ���� - CRUD ��� ����
// => �����ü : ����Ÿ�� ������� �����ϱ� ���� �ϵ���� �Ǵ� ����Ʈ����
// => �������̽��� ��ӹ޾� �ۼ��ϴ� ���� ����
// => �̱��� Ŭ����(���α׷��� �ν��Ͻ��� �ϳ��� �����ϴ� Ŭ����)�� �ۼ��ϴ� ���� ����

//STUDENT ���̺��� �л������� ���� ����,����,����,�˻� ����� �����ϱ� ���� Ŭ����
// => �޼ҵ帶�� Connection �ν��Ͻ��� �����ޱ� ���� JdbcDAO Ŭ������ ��ӹ޾� �ۼ�
public class StudentDAO extends JdbcDAO {
	//�̱��� ������ ������ ����� Ŭ���� �ۼ� ���
	//1.Ŭ������ �ν��Ͻ��� �����ϱ� ���� �����ʵ� ���� - �ý��� �ʵ�
	private static StudentDAO _dao;
	
	//2.������ ����ȭ ���� - Ŭ���� �ܺο��� �����ڸ� �̿��Ͽ� �ν��Ͻ� ���� �Ұ�
	private StudentDAO() {
		// TODO Auto-generated constructor stub
	}

	//3.Ŭ������ �ε��� �� �ý��� �ʵ忡 Ŭ������ �ν��Ͻ��� �����Ͽ� ����
	static {
		_dao=new StudentDAO();
	}
	
	//4.�ý��� �ʵ忡 ����� Ŭ������ �ν��Ͻ��� ��ȯ�ϴ� �޼ҵ� �ۼ�
	public static StudentDAO getStudentDAO() {
		/*
		//static ������ �������� ���� ���
		if(_dao==null) {
			_dao=new StudentDAO();
		}
		*/
		return _dao;
	}
	
	//�л������� ���޹޾� STUDENT ���̺��� ���� �����ϰ� �������� ������ ��ȯ�ϴ� �޼ҵ�
	public int insertStudent(StudentDTO student) {
		Connection con=null;
		PreparedStatement pstmt=null;
		int rows=0;
		try {
			con=getConnection();
			
			String sql="insert into student values(?,?,?,?,?)";
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, student.getNo());
			pstmt.setString(2, student.getName());
			pstmt.setString(3, student.getPhone());
			pstmt.setString(4, student.getAddress());
			pstmt.setString(5, student.getBirthday());
			
			rows=pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("[����]insertStudent() �޼ҵ��� SQL ���� = "+e.getMessage());
		} finally {
			close(con, pstmt);
		}
		return rows;
	}
	
	//�л������� ���޹޾� STUDENT ���̺��� �������� �����ϰ� �������� ������ ��ȯ�ϴ� �޼ҵ�
	public int updateStudent(StudentDTO student) {
		Connection con=null;
		PreparedStatement pstmt=null;
		int rows=0;
		try {
			con=getConnection();
			
			String sql="update student set name=?,phone=?,address=?,birthday=? where no=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, student.getName());
			pstmt.setString(2, student.getPhone());
			pstmt.setString(3, student.getAddress());
			pstmt.setString(4, student.getBirthday());
			pstmt.setInt(5, student.getNo());
			
			rows=pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("[����]updateStudent() �޼ҵ��� SQL ���� = "+e.getMessage());
		} finally {
			close(con, pstmt);
		}
		return rows;
	}
	
	//�й��� ���޹޾� STUDENT ���̺��� �������� �����ϰ� �������� ������ ��ȯ�ϴ� �޼ҵ�
	public int deleteStudent(int no) {
		Connection con=null;
		PreparedStatement pstmt=null;
		int rows=0;
		try {
			con=getConnection();
			
			String sql="delete from student where no=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, no);
			
			rows=pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("[����]deleteStudent() �޼ҵ��� SQL ���� = "+e.getMessage());
		} finally {
			close(con, pstmt);
		}
		return rows;
	}
	
	//�й��� ���޹޾� STUDENT ���̺��� �������� �˻��Ͽ� �л������� ��ȯ�ϴ� �޼ҵ�
	// => ������ �˻� : �˻��� ���� �ϳ��� ��� - �� �Ǵ� DTO ��ȯ
	public StudentDTO selectNoStudent(int no) {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		StudentDTO student=null;
		try {
			con=getConnection();
			
			String sql="select * from student where no=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, no);
			
			rs=pstmt.executeQuery();
			
			//�˻����� ������ ��� DTO �ν��Ͻ��� �����ϰ� �÷������� �ʵ尪�� ����
			if(rs.next()) {
				student=new StudentDTO();
				student.setNo(rs.getInt("no"));
				student.setName(rs.getString("name"));
				student.setPhone(rs.getString("phone"));
				student.setAddress(rs.getString("address"));
				student.setBirthday(rs.getString("birthday").substring(0, 10));
			}
		} catch (SQLException e) {
			System.out.println("[����]selectNoStudent() �޼ҵ��� SQL ���� = "+e.getMessage());
		} finally {
			close(con, pstmt, rs);
		}
		return student;
	}
	
	//�̸��� ���޹޾� STUDENT ���̺��� �������� �˻��Ͽ� �л�������� ��ȯ�ϴ� �޼ҵ�
	// => ������ �˻� : �˻��� ���� �������� ��� - List ��ȯ
	public List<StudentDTO> selectNameStudent(String name) {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		List<StudentDTO> studentList=new ArrayList<StudentDTO>();
		try {
			con=getConnection();
			
			String sql="select * from student where name like '%'||?||'%' order by no";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, name);
			
			rs=pstmt.executeQuery();
			
			//�˻����� ������ ��� �ݺ� ó��
			// => DTO �ν��Ͻ��� �����ϰ� �÷������� �ʵ尪�� ����
			// => DTO �ν��Ͻ��� List �ν��Ͻ��� ��ҷ� �߰�
			while(rs.next()) {
				StudentDTO student=new StudentDTO();
				student.setNo(rs.getInt("no"));
				student.setName(rs.getString("name"));
				student.setPhone(rs.getString("phone"));
				student.setAddress(rs.getString("address"));
				student.setBirthday(rs.getString("birthday").substring(0, 10));
				
				studentList.add(student);
			}
		} catch (SQLException e) {
			System.out.println("[����]selectNameStudent() �޼ҵ��� SQL ���� = "+e.getMessage());
		} finally {
			close(con, pstmt, rs);
		}
		return studentList;
	}
	
	//STUDENT ���̺��� ��� �������� �˻��Ͽ� �л�������� ��ȯ�ϴ� �޼ҵ�
	public List<StudentDTO> selectAllStudent() {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		List<StudentDTO> studentList=new ArrayList<StudentDTO>();
		try {
			con=getConnection();
			
			String sql="select * from student order by no";
			pstmt=con.prepareStatement(sql);
			
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				StudentDTO student=new StudentDTO();
				student.setNo(rs.getInt("no"));
				student.setName(rs.getString("name"));
				student.setPhone(rs.getString("phone"));
				student.setAddress(rs.getString("address"));
				student.setBirthday(rs.getString("birthday").substring(0, 10));
				
				studentList.add(student);
			}
		} catch (SQLException e) {
			System.out.println("[����]selectAllStudent() �޼ҵ��� SQL ���� = "+e.getMessage());
		} finally {
			close(con, pstmt, rs);
		}
		return studentList;
	}
}