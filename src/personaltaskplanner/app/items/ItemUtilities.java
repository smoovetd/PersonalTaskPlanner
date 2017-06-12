/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personaltaskplanner.app.items;

public class ItemUtilities {
    
    private static long currentTakenID = 0;
    
    public long getNextFreeId(){
        long nextFreeId;
        
        nextFreeId = currentTakenID++;
        return nextFreeId;
    }
    
}
