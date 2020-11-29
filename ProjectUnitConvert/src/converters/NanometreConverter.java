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
 * @author PC-SAFE
 */
public class NanometreConverter extends AbstractConverter {

    public NanometreConverter() {

        super.setDescriptionClassConverter(MeasureType.DISTANCENANOMETRE);

    }

    @Override
    public double toBasicUnit(double valueJTextInsert) {
        return valueJTextInsert/0.0000001;// nanometro to cm
    }

    @Override
    public double fromBasicUnit(double valueJTextInsert) {
        return valueJTextInsert*0.0000001;// cm to nanometro
    }
}
