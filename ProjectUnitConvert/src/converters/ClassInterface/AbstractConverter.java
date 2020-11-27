/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converters.ClassInterface;

import converters.Enum.MeasureType;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author PC
 */
public abstract class AbstractConverter {

    private String nameOfEnumUsedOfTheClass;
    
    public void setDescriptionClassConverter(Enum descriptionOftheClass) {
        
        this.nameOfEnumUsedOfTheClass = descriptionOftheClass.toString();
    }

    public List<MeasureType> getDescriptionClassConverter() {

        List<MeasureType> list = Arrays.asList(MeasureType.valueOf(nameOfEnumUsedOfTheClass));
        
        return list;
    
        }
   

    }

