/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personaltaskplanner.exceptions;

/**
 *
 * @author blagiev
 */
public class InvalidItemSettingException extends Exception{
      
   public InvalidItemSettingException(String msg){
       super(msg);
   }
}
