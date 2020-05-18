/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jfxml_login;

/**
 *
 * @author Basir
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Filing {

    static String file;

    public static void writeData(String data) throws IOException {

        try (FileWriter filewriter = new FileWriter(new File(file), true); BufferedWriter write = new BufferedWriter(filewriter)) {

            write.write(data);
            write.newLine();
        }

    }

    static void writeData(int billno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void writeData(double ammount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
