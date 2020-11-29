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
 * @author PC - SAFE
 */
public class DecimetreConverter extends AbstractConverter {

    public DecimetreConverter() {

        super.setDescriptionClassConverter(MeasureType.DISTANCEDECIMETRE);

    }

    @Override
    public double toBasicUnit(double valueJTextInsert) {
        return (valueJTextInsert) * (10); // decimetro para cm
    }

    @Override
    public double fromBasicUnit(double valueJTextInsert) {
        return (100 * valueJTextInsert) / (10 * 100); // cm para decimetro
    }
}
