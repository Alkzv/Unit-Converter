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
 */
public class KilometreConverter extends AbstractConverter {
/**
 * Constructor
 */
    public KilometreConverter() {

        super.setDescriptionClassConverter(MeasureType.DISTANCEKILOMETRE);

    }
/**
 * Implemented method of the abstract class that receives the value inserted in the JTextField for conversion
 * @param valueJTextInsert
 * @return Double - (valueJTextInsert) * (100000)
 */
    @Override
    public double toBasicUnit(double valueJTextInsert) {
        return (valueJTextInsert) * (100000); // km to cm
    }
/**
 * 
 * @param valueJTextInsert
 * @return Double (100 * valueJTextInsert) / (100000 * 100) 
 */
    @Override
    public double fromBasicUnit(double valueJTextInsert) {
        return (100 * valueJTextInsert) / (100000 * 100); //cm to km 
    }
}
