package demo;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentTemplate {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	
	public void setDataSource(DataSource dataSource) {
	    this.dataSource = dataSource;
	    this.jdbcTemplateObject = new JdbcTemplate(dataSource);    
	}
	
	public void create(String firstName, Integer id, String lastName) {
	      String SQL = "INSERT INTO EMP(EMP_NAME, EMPID, CITY)VALUES(?, ?, ?)";
	      jdbcTemplateObject.update( SQL, firstName, id,lastName);
	      System.out.println("Created Record Name = " + firstName + " ID = " + id + " LastName = " +lastName);
	      return;
	   }
	
	   public Student getStudent(Integer id) {
	      String SQL = "select * from EMP where EMPID = ?";
	      Student student = jdbcTemplateObject.queryForObject(SQL, 
	         new Object[]{id}, new StudentMapper());
	      return student;
	   }
}
