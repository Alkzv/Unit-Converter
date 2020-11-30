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
 * @author Roque Matheus Gomes Costa
 */
public abstract class AbstractConverter {

    private String nameOfEnumUsedOfTheClass;
/**
 * Method that receives the enum and his content
 * @param descriptionOftheClass 
 */
    public void setDescriptionClassConverter(Enum descriptionOftheClass) {

        this.nameOfEnumUsedOfTheClass = descriptionOftheClass.toString();
    }
/**
 * Abstract method that will be implemented in the other classes that extends this class
 * @param unit
 * @return Double - unit 
 */
    public abstract double toBasicUnit(double unit);
/**
 * Abstract method that will be implemented in the other classes that extends this class
 * @param valueJTextInsert
 * @return Double - valueJTextInsert
 */
    public abstract double fromBasicUnit(double valueJTextInsert);
/**
 * Method that receives a name of a propertie of enum and get this propertie content and save in a list
 * @return list
 */
    public List<MeasureType> getDescriptionClassConverter() {

        List<MeasureType> list = Arrays.asList(MeasureType.valueOf(nameOfEnumUsedOfTheClass));

        return list;

    }

}
