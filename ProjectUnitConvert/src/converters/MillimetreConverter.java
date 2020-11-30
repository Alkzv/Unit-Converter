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
public class MillimetreConverter extends AbstractConverter {
/**
 * Constructor
 */
    public MillimetreConverter() {

        super.setDescriptionClassConverter(MeasureType.DISTANCEMILLIMETRE);

    }
/**
 * Implemented method of the abstract class that receives the value inserted in the JTextField for conversion
 * @param valueJTextInsert
 * @return Double - (100 * valueJTextInsert) / (10 * 100)
 */
    @Override
    public double toBasicUnit(double valueJTextInsert) {
        return (100 * valueJTextInsert) / (10 * 100); // millimetre to centimetre
    }
/**
 * Implemented method of the abstract class that receives the value inserted in the JTextField for conversion
 * @param valueJTextInsert
 * @return (valueJTextInsert) * (10)
 */
    @Override
    public double fromBasicUnit(double valueJTextInsert) {
        return (valueJTextInsert) * (10); // centimetre to millimetre
    }
}
