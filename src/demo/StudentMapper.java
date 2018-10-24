package demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class StudentMapper implements RowMapper<Student> {
   public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
      Student student = new Student();
      student.setFirstName(rs.getString("EMP_NAME"));
      student.setid(rs.getInt("EMPID"));
      student.setLastName(rs.getString("CITY"));
      return student;
   }
}