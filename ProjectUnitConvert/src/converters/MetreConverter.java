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
public class MetreConverter extends AbstractConverter {

    /**
     * Constructor
     */
    public MetreConverter() {

        super.setDescriptionClassConverter(MeasureType.DISTANCEMETRE);

    }

    /**
     * Implemented method of the abstract class that receives the value inserted
     * in the JTextField for conversion
     *
     * @param valueJTextInsert
     * @return Double - (valueJTextInsert) * (100)
     */
    @Override
    public double toBasicUnit(double valueJTextInsert) {
        return (valueJTextInsert) * (100);// Metre to cm
    }

    /**
     * Implemented method of the abstract class that receives the value inserted
     * in the JTextField for conversion
     *
     * @param valueJTextInsert
     * @return Double - (100 * valueJTextInsert) / (100 * 100)
     */
    @Override
    public double fromBasicUnit(double valueJTextInsert) {
        return (100 * valueJTextInsert) / (100 * 100); //Cm to Metre 
    }
}
