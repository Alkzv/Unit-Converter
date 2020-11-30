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
 * @author Roque Matheus Gomes Costa
 */
public class SquareMetreConverter extends AbstractConverter {

    /**
     * Constructor
     */
    public SquareMetreConverter() {

        super.setDescriptionClassConverter(MeasureType.AREASQUAREMETRE);

    }

    /**
     * Implemented method of the abstract class that receives the value inserted
     * in the JTextField for conversion
     *
     * @param valueJTextInsert
     * @return Double (100 * valueJTextInsert) / (7140 * 100)
     */
    @Override
    public double toBasicUnit(double valueJTextInsert) {
        return (100 * valueJTextInsert) / (7140 * 100);// square meters to soccer field 
    }

    /**
     * Implemented method of the abstract class that receives the value inserted
     * in the JTextField for conversion
     *
     * @param valueJTextInsert
     * @return Double (valueJTextInsert) * (7140)
     */
    @Override
    public double fromBasicUnit(double valueJTextInsert) {
        return (valueJTextInsert) * (7140); // soccer field to square meters;
    }
}
