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
public class YardConverter extends AbstractConverter {
/**
 * Constructor
 */
    public YardConverter() {

        super.setDescriptionClassConverter(MeasureType.DISTANCEYARD);

    }
/**
 * Implemented method of the abstract class that receives the value inserted in the JTextField for conversion
 * @param valueJTextInsert
 * @return Double - (valueJTextInsert) * (91.44)
 */
    @Override
    public double toBasicUnit(double valueJTextInsert) {
        return (valueJTextInsert) * (91.44); // yard to cm
    }
/**
 * Implemented method of the abstract class that receives the value inserted in the JTextField for conversion
 * @param valueJTextInsert
 * @return Double (100 * valueJTextInsert) / (91.44 * 100)
 */
    @Override
    public double fromBasicUnit(double valueJTextInsert) {
        return (100 * valueJTextInsert) / (91.44 * 100);// cm to yard;
    }
}
