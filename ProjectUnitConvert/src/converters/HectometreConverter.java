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
public class HectometreConverter extends AbstractConverter {

    public HectometreConverter() {

        super.setDescriptionClassConverter(MeasureType.DISTANCEHECTOMETRE);

    }

    @Override
    public double toBasicUnit(double valueJTextInsert) {
        return (valueJTextInsert) * (10000);//hectometro para cm
    }

    @Override
    public double fromBasicUnit(double valueJTextInsert) {
        return (100 * valueJTextInsert) / (10000 * 100);//cm para hectometre
    }
}
