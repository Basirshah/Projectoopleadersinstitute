/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jfxml_login;


import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Basir
 */

     
public class TecherformController implements Initializable {
@FXML
    private TextField name;
@FXML
    private TextField fname;
@FXML
    private TextField age;
@FXML
    private TextField gender;
@FXML
    private TextField qualifi;
@FXML
    private TextField email;
@FXML
    private TextField address;
@FXML
    private TextField mobile;
@FXML
    private TextField phone;
      String firstname;
String fathername;
String Age;
String Gender;
String Qualification;
String Email;
String Address;
String Mobile ;
String Phone;
// information info = new information ();
 Alert a = new Alert(Alert.AlertType.NONE,  
                              "",ButtonType.OK); 
 
@FXML
  private void handleButtonAction(ActionEvent event ) throws IOException {
firstname = name.getText();
 fathername = fname.getText();
 Age = age.getText();
 Gender = gender.getText();
 Qualification= qualifi.getText();  
 Email = email.getText();
 Address = address.getText();
 Mobile = mobile.getText();
 Phone = phone.getText();
// Filing.file="C:\\Users\\Basir\\OneDrive\\Documents\\Netbean\\leaderinstitute-master\\src\\jfxml_login\\teacherdatabase.txt";
 // tostring method is used to write patient data in string form
  a.setTitle("Confirmation");
  a.setContentText("Your Data has been Sucessfully saved you are redirected to dashboard now ");
  a.show(); 
  info();
  database();
// Filing.writeData(toString());
 Parent home_page_parent = FXMLLoader.load(getClass().getResource("dashboard.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
              app_stage.show(); 
 }
   public void info(){
         try
        {
            String connect="jdbc:mysql://localhost:3306/teacherinformation";
            
            //Step-1 //load driver
            Class.forName("com.mysql.jdbc.Driver");
            
            //Step-2 //Create Connection Object
                                                       //connection string, username, password
            Connection con=DriverManager.getConnection(connect,"root","");
            
            //Step-3 //Create Statement object
            Statement st=con.createStatement(); 
            
            
            System.out.println("teacher info connection done");
         
            //Step-4 //Database Query to insert Record
                                  
//            String input ="INSERT INTO login (leaders,  iqra)  values (basir, herii)";
 String infotech ="INSERT INTO `teacherinfo`(firstname,  age , gender ,qualification , email ,address , mobile, password,fathername) VALUE ('"+firstname+"','"+Age+"','"+Gender+"','"+Qualification+"','"+Email+"','"+Address+"','"+Mobile+"','"+Phone+"','"+fathername+"');";
            
            //Step-5 //execute query on database
            st.execute(infotech);
            System.out.println("Teacher Data inserted successfully..");
            //Step-6 //Close Connection.
            con.close();   
        }
        catch(Exception ex)
        {
            System.out.println("Error: "+ ex.getMessage());
        }

  }
    public void database(){
         try
        {
            String connectString="jdbc:mysql://localhost:3306/appli";
            
            //Step-1 //load driver
            Class.forName("com.mysql.jdbc.Driver");
            
            //Step-2 //Create Connection Object
                                                       //connection string, username, password
            Connection con=DriverManager.getConnection(connectString,"root","");
            
            //Step-3 //Create Statement object
            Statement st=con.createStatement(); 
            
            
            System.out.println("Ok,Connection is done");
         
            //Step-4 //Database Query to insert Record
                                  
//            String input ="INSERT INTO login (leaders,  iqra)  values (basir, herii)";
 String input ="INSERT INTO `request`(username,  password) VALUE ('"+firstname+"','"+Phone+"');";
            
            //Step-5 //execute query on database
            st.execute(input);
            
            
            System.out.println("Data inserted successfully..");
            
            //Step-6 //Close Connection.
            con.close();
            
            
        }
        catch(Exception ex)
        {
            System.out.println("Error: "+ ex.getMessage());
        }}
  public String toString() {   
// TODO Auto-generated method stub 
return "  Name:"+firstname+"  FatherName: "+fathername + "  Last Qualification :"+ Qualification + "  Password: "+ Phone+ "  Mobile number: "+ Mobile +"  Gender :" +Gender +"  Email :" +Email+ "Age:"+Age;
    } 
  @FXML
void twitter(MouseEvent event) {
    
    Alert all = new Alert(Alert.AlertType.NONE,  
                              "",ButtonType.OK);
    all.setTitle("Goto Twitter ");
  all.setContentText("https://twitter.com/leaderinstitute?s=08");
  all.show(); 
    
} 
  @FXML
void facebook(MouseEvent event) {
    
    Alert bl = new Alert(Alert.AlertType.NONE,  
                              "",ButtonType.OK);
   bl.setTitle("Goto Facebook ");
  bl.setContentText("https://www.facebook.com/theleadersinstitute/");
  bl.show(); 
    
}
  @FXML
  void instagram(MouseEvent event) {
    
    Alert al = new Alert(Alert.AlertType.NONE,  
                              "",ButtonType.OK);
    al.setTitle("Goto Instagram");
  al.setContentText("https://instagram.com/theleadersinstitute?igshid=75bci4ao76cg");
  al.show(); 
    
} 
  @FXML
  void backbutton(MouseEvent event) throws IOException{
      Parent home_page_parent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
              app_stage.show(); 
  }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
