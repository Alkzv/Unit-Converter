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
 * @author PC
 */
public class MetreConverter extends AbstractConverter {

    public MetreConverter() {

        super.setDescriptionClassConverter(MeasureType.DISTANCEMETRE);

    }

    @Override
    public double toBasicUnit(double valueJTextInsert) {
        return valueJTextInsert*100;// Metre to cm
    }

    @Override
    public double fromBasicUnit(double valueJTextInsert) {
        return valueJTextInsert/100; //Cm to Metre 
    }
}
