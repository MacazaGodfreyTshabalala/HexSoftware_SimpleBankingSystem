
package simplebankingsystem;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class CustomerDAO {
    
    private final Connection connection;
    public CustomerDAO() throws SQLException{
        connection = DBConnection.getConnection();
        
        
    
    }
    
    //create Customer
    public void insertCustomer(Customer customer) 
    {
    
        try
        {
         String sql = "INSERT INTO customers ( name, surname, dob, gender, email, maritalStatus, address, city, province, code,"
                 + " religion, category, income, education, occupation, idNo, sarsNo, persalNo, pensioner, existingAcc) "
                 + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
         
         PreparedStatement stmt = connection.prepareStatement(sql);
         stmt.setString(1, customer.getName());
         stmt.setString(2, customer.getSurname());
         stmt.setString(3, customer.getDob());
         stmt.setString(4, customer.getGender());
         stmt.setString(5, customer.getEmail());
         stmt.setString(6, customer.getMaritalStatus());
         stmt.setString(7, customer.getAddress());
         stmt.setString(8, customer.getCity());
         stmt.setString(9, customer.getProvince());
         stmt.setString(10,customer.getCode() );
         stmt.setString(11, customer.getReligion());
         stmt.setString(12, customer.getCategory());
         stmt.setString(13, customer.getIncome());
         stmt.setString(14, customer.getEducation());
         stmt.setString(15, customer.getOccupation());
         stmt.setInt(16, customer.getIdNo());
         stmt.setString(17, customer.getSarsNo());
         stmt.setString(18, customer.getPersalNo());
         stmt.setString(19, customer.getPensioner());
         stmt.setString(20, customer.getExistingAcc());
         
         stmt.executeUpdate();
         
        }catch(SQLException e)
        {
            
            
            
        }
          
          
    }
}
