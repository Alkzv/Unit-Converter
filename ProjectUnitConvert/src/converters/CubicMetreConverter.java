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
public class CubicMetreConverter extends AbstractConverter {

    /**
     * Constructor
     */
    public CubicMetreConverter() {

        super.setDescriptionClassConverter(MeasureType.VOLUMECUBICMETRE);

    }

    /**
     * Implemented method of the abstract class that receives the value inserted
     * in the JTextField for conversion
     *
     * @param valueJTextInsert
     * @return Double - (valueJTextInsert) * (*1000000)
     */
    @Override
    public double toBasicUnit(double valueJTextInsert) {
        return (valueJTextInsert) * (1000000); // cubic metre to cubic centimetre
    }

    /**
     * Implemented method of the abstract class that receives the value inserted
     * in the JTextField for conversion
     *
     * @param valueJTextInsert
     * @return Double (100 * valueJTextInsert) / (1000000 * 100)
     */
    @Override
    public double fromBasicUnit(double valueJTextInsert) {
        return (100 * valueJTextInsert) / (1000000 * 100);// cubic centimetre to cubic metre 
    }
}
