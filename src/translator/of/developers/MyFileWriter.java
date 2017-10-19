/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package translator.of.developers;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Rustem Azimov
 */
public class MyFileWriter {
    public void exportToFile(String[][] data, String path) throws IOException{
        BufferedWriter writer = new BufferedWriter(new FileWriter(new File(path)));
        for(String[] raw: data){
            writer.write("\"" + raw[0] + "\"" + " ---> " + "\"" + raw[1] + "\"");
            writer.newLine();
        }
        writer.flush();
        writer.close();
    }
}
