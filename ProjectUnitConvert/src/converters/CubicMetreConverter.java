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
public class CubicMetreConverter extends AbstractConverter {

    public CubicMetreConverter() {

        super.setDescriptionClassConverter(MeasureType.VOLUMECUBICMETRE);

    }

    @Override
    public double toBasicUnit(double valueJTextInsert) {
        return (valueJTextInsert) * (1000000); // cubic metre to cubic centimetre
    }

    @Override
    public double fromBasicUnit(double valueJTextInsert) {
        return (100 * valueJTextInsert) / (1000000 * 100);// cubic centimetre to cubic metre 
    }
}
