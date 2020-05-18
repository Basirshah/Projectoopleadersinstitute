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
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Basir
 */
public class DashboardController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML 
    private Text f1name;
    @FXML 
    private Text f1sub;
    @FXML 
    private Text f1exp;
     @FXML 
    private Text f1fee;
     
      @FXML 
    private Text f2name;
    @FXML 
    private Text f2sub;
    @FXML 
    private Text f2exp;
     @FXML 
    private Text f2fee;
        @FXML 
    private Text f3name;
    @FXML 
    private Text f3sub;
    @FXML 
    private Text f3exp;
     @FXML 
    private Text f3fee;
        @FXML 
    private Text f4name;
    @FXML 
    private Text f4sub;
    @FXML 
    private Text f4exp;
     @FXML 
    private Text f4fee;
    
    
    
    
    @FXML
    public void movetologinpage(ActionEvent event) throws IOException{
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
              app_stage.show();
    
    }
    String Experience="abc";
    private Text experience;
 @FXML
 void  teacherinfofortime(MouseEvent event) throws IOException{
  Parent home_page_parent = FXMLLoader.load(getClass().getResource("Details.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
              app_stage.show();
 
 }
          @FXML
   void faculty1 (ActionEvent event){
         try
        {
            String connect="jdbc:mysql://localhost:3306/appli";
            
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
 String infotech ="INSERT INTO `hiredteachers`(facultyname,  facultysubjects , facultyexperience ,facultyfees ) VALUE ('"+f1name.getText()+"','"+f1sub.getText()+"','"+f1exp.getText()+"','"+f1fee.getText()+"');";
            
            //Step-5 //execute query on database
            st.execute(infotech);
            System.out.println("Teacher data added");
            //Step-6 //Close Connection.
            con.close();   
        }
        catch(Exception ex)
        {
            System.out.println("Error: "+ ex.getMessage());
        } 
        Alert a = new Alert(Alert.AlertType.INFORMATION,  
                              "",ButtonType.OK); 
      a.setContentText("Your request to hire teacher has been added to Server. \n Your teacher will conntact you soon.");
        a.show();
        
    }
    @FXML
     void faculty2 (ActionEvent event){
         try
        {
            String connect="jdbc:mysql://localhost:3306/appli";
            
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
 String infotech ="INSERT INTO `hiredteachers`(facultyname,  facultysubjects , facultyexperience ,facultyfees ) VALUE ('"+f2name.getText()+"','"+f2sub.getText()+"','"+f2exp.getText()+"','"+f2fee.getText()+"');";
            
            //Step-5 //execute query on database
            st.execute(infotech);
            System.out.println("Teacher data added");
            //Step-6 //Close Connection.
            con.close();   
        }
        catch(Exception ex)
        {
            System.out.println("Error: "+ ex.getMessage());
        } 
        Alert a = new Alert(Alert.AlertType.INFORMATION,  
                              "",ButtonType.OK); 
      a.setContentText("Your request to hire teacher has been added to Server. \n Your teacher will conntact you soon.");
        a.show();
        
    }
      @FXML
       void faculty3 (ActionEvent event){
         try
        {
            String connect="jdbc:mysql://localhost:3306/appli";
            
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
 String infotech ="INSERT INTO `hiredteachers`(facultyname,  facultysubjects , facultyexperience ,facultyfees ) VALUE ('"+f3name.getText()+"','"+f3sub.getText()+"','"+f3exp.getText()+"','"+f3fee.getText()+"');";
            
            //Step-5 //execute query on database
            st.execute(infotech);
            System.out.println("Teacher data added");
            //Step-6 //Close Connection.
            con.close();   
        }
        catch(Exception ex)
        {
            System.out.println("Error: "+ ex.getMessage());
        } 
        Alert a = new Alert(Alert.AlertType.INFORMATION,  
                              "",ButtonType.OK); 
      a.setContentText("Your request to hire teacher has been added to Server. \n Your teacher will conntact you soon.");
        a.show();
        
    }
        @FXML
         void faculty4 (ActionEvent event){
         try
        {
            String connect="jdbc:mysql://localhost:3306/appli";
            
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
 String infotech ="INSERT INTO `hiredteachers`(facultyname,  facultysubjects , facultyexperience ,facultyfees ) VALUE ('"+f4name.getText()+"','"+f4sub.getText()+"','"+f4exp.getText()+"','"+f4fee.getText()+"');";
            
            //Step-5 //execute query on database
            st.execute(infotech);
            System.out.println("Teacher data added");
            //Step-6 //Close Connection.
            con.close();   
        }
        catch(Exception ex)
        {
            System.out.println("Error: "+ ex.getMessage());
        } 
        Alert a = new Alert(Alert.AlertType.INFORMATION,  
                              "",ButtonType.OK); 
      a.setContentText("Your request to hire teacher has been added to Server. \n Your teacher will conntact you soon.");
        a.show();
        
    }
    public void details(ActionEvent event) throws IOException{
       Alert alert =new Alert(Alert.AlertType.NONE,  
                              "",ButtonType.CLOSE);
        alert.setTitle("FAQS");
  alert.setContentText("How Leaders Institue Works? "
          + " \n It works via loaction access in order to connecct teacher and Student."
          + "\nIs it safe? "
          + "\n Yes it is with the tecchnology of javafx and most trusted servers."
          + "\nHow do we connect to teacher? "
          + "\nyou can first make a sign in account and in dashboard you have everything displayed about teacher"
          + "\nyou can contact him via call ."
  );
  alert.show();
    
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
