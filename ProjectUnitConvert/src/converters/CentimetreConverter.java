/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converters;

import converters.ClassInterface.AbstractConverter;
import converters.Enum.MeasureType;

/**
 *
 * @author Lucas Alkimim Chaves 
 * 
 */
public class CentimetreConverter extends AbstractConverter {
/**
 * Constructor
 */
    public CentimetreConverter() {
        
        super.setDescriptionClassConverter(MeasureType.DISTANCECENTIMETRE);

    }
/** Implemented method of the abstract class that receives the value inserted in the JTextField for conversion
 * @param valueJTextInsert
 * @return valueJTextInsert
 */
    @Override
    public double toBasicUnit(double valueJTextInsert) {
        return valueJTextInsert;
    }
/** Implemented method of the abstract class that receives the value inserted in the JTextField for conversion
 * @param valueJTextInsert
 * @return valueJTextInsert
 */
    @Override
    public double fromBasicUnit(double valueJTextInsert) {
        return valueJTextInsert;
    }
}
