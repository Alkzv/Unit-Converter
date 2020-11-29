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
public class YardConverter extends AbstractConverter {

    public YardConverter() {

        super.setDescriptionClassConverter(MeasureType.DISTANCEYARD);

    }

    @Override
    public double toBasicUnit(double valueJTextInsert) {
        return (valueJTextInsert) * (91.44); // yard to cm
    }

    @Override
    public double fromBasicUnit(double valueJTextInsert) {
        return (100 * valueJTextInsert) / (91.44 * 100);// cm to yard;
    }
}
