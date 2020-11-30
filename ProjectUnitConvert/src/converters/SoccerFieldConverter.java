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
public class SoccerFieldConverter extends AbstractConverter {
/**
 * Constructor
 */
    public SoccerFieldConverter() {

        super.setDescriptionClassConverter(MeasureType.AREASOCCERFIELD);

    }
/**
 * Implemented method of the abstract class that receives the value inserted in the JTextField for conversion
 * @param valueJTextInsert
 * @return valueJTextInsert
 */
    @Override
    public double toBasicUnit(double valueJTextInsert) {
        return valueJTextInsert;
    }
/**
 * Implemented method of the abstract class that receives the value inserted in the JTextField for conversion
 * @param valueJTextInsert
 * @return valueJTextInsert
 */
    @Override
    public double fromBasicUnit(double valueJTextInsert) {
        return valueJTextInsert;
    }
}
