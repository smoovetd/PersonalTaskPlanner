/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personaltaskplanner.io.output;

/**
 *
 * @author blagiev
 */
public interface Writer {
    void writeLine(String lineContent);
    
    void write(String content); 
}
