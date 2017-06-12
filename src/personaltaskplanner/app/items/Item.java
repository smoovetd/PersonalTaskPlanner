package personaltaskplanner.app.items;

import java.util.Date;
import personaltaskplanner.app.statuses.Status;
import personaltaskplanner.exceptions.InvalidItemSettingException;

public abstract class Item {
    
    private long id;
    
    private String header;
    
    private String description;
    
    private Date startDate;
    
    private ItemType type;
    
    private Status status;
    
    private ItemUtilities itemUtils;
    
    protected Item(String header, String description, ItemType type) throws InvalidItemSettingException{
        this.setId(itemUtils.getNextFreeId());
        this.setHeader(header);
        this.setDescription(description);
        this.setType(type);
        this.setStartDate(new Date());
    }
    
    private void setId (long id) throws InvalidItemSettingException{
        if(id <= 0){
            throw new InvalidItemSettingException("Item's Id cannot be less than zero");
        }
        this.id = id;
    }
    
    public long getId(){
        return this.id;
    }
    
    private void setHeader(String header) throws InvalidItemSettingException{
        if (header == null || header.equals("")){
            throw new InvalidItemSettingException("Header cannot be empty");
        }
        
        this.header = header;
    }
    
    public String getHeader(){
        return this.header;
    }
    
    private void setDescription(String description){
        this.description = description;
    }
    
    public String getDescription(){
        return this.description;
    }
    
    public void setType(ItemType type){
        this.type = type;
    }
    
    public ItemType getType(){
        return this.type;
    }
    
    private void setStartDate(Date date){
        this.startDate = date;
    }
    
    public Date getStartDate(){
        return this.startDate;
    }
}
