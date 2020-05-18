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
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Basir
 */
//public class LoginpageController extends Application{}

public class LoginpageController extends Application {
    @FXML
         private ImageView fb;
    @FXML
    private Hyperlink otherpage;
           List<Hyperlink> links = new ArrayList<>();
    @FXML
    public void start(Stage stage) throws IOException {
       
    Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
     otherpage = new Hyperlink();
        otherpage.setOnAction((new EventHandler<ActionEvent >() { 
     public void handle(ActionEvent  event) { 
        System.out.println("Hello World"); 
     } 
    }));
//         fb = new ImageView();
//fb.setOnMouseClicked((MouseEvent e) -> {
//            System.out.println("Clicked!"); // change functionality
//        });
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
       stage.show();

//     System.out.println("Clicked!");
    
    }
    

    /**
     * Initializes the controller class.
     */
    String dbusername;
    String dbpassword;
    @FXML
    private Button teacher;
     @FXML
    private Button student;
    @FXML
    private TextField username;
      @FXML
    private PasswordField password;
        @FXML
void instagram(MouseEvent event) {
    
    Alert al = new Alert(Alert.AlertType.NONE,  
                              "",ButtonType.OK);
    al.setTitle("Goto Instagram");
  al.setContentText("https://instagram.com/theleadersinstitute?igshid=75bci4ao76cg");
  al.show(); 
    
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
void twitter(MouseEvent event) {
    
    Alert all = new Alert(Alert.AlertType.NONE,  
                              "",ButtonType.OK);
    all.setTitle("Goto Twitter ");
  all.setContentText("https://twitter.com/leaderinstitute?s=08");
  all.show(); 
    
} 
private ResultSet rs ;

private Statement st;
public void getdata(){
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
                                  
 try{
    
    String Query ="Select * From request";
    rs=st.executeQuery(Query);
    System.out.println("Retrived Data");
    while (rs.next()){
          dbusername =rs.getString("username");
   System.out.println(dbusername);
    dbpassword =rs.getString("password");
   System.out.println(dbpassword);
  
    }
   
}
catch(Exception ex)
        {
        
System.out.println(ex);
        }
            
        }
        catch(Exception ex)
        {
            System.out.println("Error: "+ ex.getMessage());
        }


       
}

@FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        getdata();
       
if ( dbpassword.equals(password.getText()) && dbusername.equals(username.getText())){
    System.out.println("condition true");
Parent home_page_parent = FXMLLoader.load(getClass().getResource("dashboard.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
              app_stage.show();
}
else {

Alert alert =new Alert(Alert.AlertType.ERROR,  
                              "",ButtonType.OK);
alert.setContentText("You Entered invalid username / Password");
alert.show();
username.clear();
password.clear();
}
         
        
              
//           if (isValidCredentials())
//            {
////                app_stage.hide(); //optional
//                app_stage.setScene(home_page_scene);
//                app_stage.show();  
//            }
//            else
//            {
//                username.clear();
//                password.clear();
////                invalid_label.setText("Sorry, invalid credentials"); 
//            }
    }
    
    @FXML
     private void teacherform(ActionEvent event) throws IOException {

        Parent home_page_parent = FXMLLoader.load(getClass().getResource("techerform.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
              app_stage.show(); 
              
           
    }
     @FXML
    private void studentform(ActionEvent event) throws IOException {

        Parent home_page_parent = FXMLLoader.load(getClass().getResource("Studentform.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
              app_stage.show(); 
       
    }
@FXML
 public void database() throws IOException
    {
      
        
    }

//      private boolean isValidCredentials()
//    {
//        boolean let_in = false;
//        System.out.println( "SELECT * FROM Users WHERE USERNAME= " + "'" + username.getText() + "'" 
//            + " AND PASSWORD= " + "'" + password.getText() + "'" );
//    
//        Connection c = null;
//        java.sql.Statement stmt = null;
//        try {
//            c = DriverManager.getConnection("com.mysql.jdbc.Driver");
//            c.setAutoCommit(false);
//            
//            System.out.println("Opened database successfully");
//            stmt = c.createStatement();
//            
//            ResultSet rs = stmt.executeQuery( "SELECT * FROM Users WHERE USERNAME= " + "'" + username.getText() + "'" 
//            + " AND PASSWORD= " + "'" + password.getText() + "'");
//            
//            while ( rs.next() ) {
//                 if (rs.getString("USERNAME") != null && rs.getString("PASSWORD") != null) { 
//                     String  username = rs.getString("USERNAME");
//                     System.out.println( "USERNAME = " + username );
//                     String password = rs.getString("PASSWORD");
//                     System.out.println("PASSWORD = " + password);
//                     let_in = true;
//                 }  
//            }
////            rs.close();
////            stmt.close();
//            c.close();
//            } catch ( Exception e ) {
//                System.err.println( e.getClass().getName() + ": " + e.getMessage() );
////                System.exit(0);
//            }
//            System.out.println("isValidCredentials operation done successfully");
//            return let_in;
//        
//    }
//    
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
      
    }    

   public static void main(String[] args) {
        launch(args);
   }
    
}

