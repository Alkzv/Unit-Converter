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
public class DecametreConverter extends AbstractConverter {

    /**
     * Constructor
     */
    public DecametreConverter() {

        super.setDescriptionClassConverter(MeasureType.DISTANCEDECAMETRE);

    }

    /**
     * Implemented method of the abstract class that receives the value inserted
     * in the JTextField for conversion
     *
     * @param valueJTextInsert
     * @return Double - valueJTextInsert * (1000)
     */
    @Override
    public double toBasicUnit(double valueJTextInsert) {
        return (valueJTextInsert) * (1000); // Decametre to Cm 
    }

    /**
     * Implemented method of the abstract class that receives the value inserted
     * in the JTextField for conversiono
     *
     * @param valueJTextInsert
     * @return Double - (valueJTextInsert * 100) / (1000 * 100)
     */
    @Override
    public double fromBasicUnit(double valueJTextInsert) {
        return (valueJTextInsert * 100) / (1000 * 100); // Cm to Decametre
    }
}
