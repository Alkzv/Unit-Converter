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
public class CubicCentimetreConverter extends AbstractConverter {

    public CubicCentimetreConverter() {

        super.setDescriptionClassConverter(MeasureType.VOLUMECUBICCENTIMETRE);

    }

    @Override
    public double toBasicUnit(double valueJTextInsert) {
        return valueJTextInsert;
    }

    @Override
    public double fromBasicUnit(double valueJTextInsert) {
        return valueJTextInsert;
    }
}
