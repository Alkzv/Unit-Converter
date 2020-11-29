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
public class InchConverter extends AbstractConverter {

    public InchConverter() {

        super.setDescriptionClassConverter(MeasureType.DISTANCEINCH);

    }

    @Override
    public double toBasicUnit(double valueJTextInsert) {
        return (valueJTextInsert) * (2.54); // inch para cm
    }

    @Override
    public double fromBasicUnit(double valueJTextInsert) {
        return (100 * valueJTextInsert) / (100 * 2.54); // cm para inch
    }
}
