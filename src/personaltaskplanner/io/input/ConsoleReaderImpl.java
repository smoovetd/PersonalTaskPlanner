/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personaltaskplanner.io.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author blagiev
 */
public class ConsoleReaderImpl implements  Reader{

    private static final BufferedReader consoleBuffReader = new BufferedReader(new InputStreamReader(System.in));
    
    @Override
    public String readLineFromConsole(String arguments) {
        String lineContent;
        lineContent = "";
        try {
            lineContent = consoleBuffReader.readLine();
        } catch (IOException ex) {
            Logger.getLogger(ConsoleReaderImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lineContent;
    }
}
