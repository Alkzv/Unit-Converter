/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converters.ClassInterface;

/**
 *
 * @author PC
 */

public abstract class AbstractConverter {
    
  protected String descriptionOftheClass;
    
    
    public void setDescriptionClassConverter(String descriptionOftheClass) {
        
        this.descriptionOftheClass = descriptionOftheClass;
       
    }

    public String getDescriptionClassConverter( ) {
        
        return this.descriptionOftheClass;
       
    }


  
}