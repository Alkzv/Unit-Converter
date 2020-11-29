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
public class MicrometreConverter extends AbstractConverter {

    public MicrometreConverter() {

        super.setDescriptionClassConverter(MeasureType.DISTANCEMICROMETRE);

    }

    @Override
    public double toBasicUnit(double valueJTextInsert) {
        return (100 * valueJTextInsert) / (10000 * 100); // micrometro para cm 
    }

    @Override
    public double fromBasicUnit(double valueJTextInsert) {
        return (valueJTextInsert) * (10000); // cm para micrometro
    }
}
