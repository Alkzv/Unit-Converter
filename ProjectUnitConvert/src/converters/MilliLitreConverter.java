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
public class MilliLitreConverter extends AbstractConverter {

    public MilliLitreConverter() {

        super.setDescriptionClassConverter(MeasureType.VOLUMEMILLILITRE);

    }

    @Override
    public double toBasicUnit(double valueJTextInsert) {
        return (100*valueJTextInsert)/(1*100); // milliletre to centimetre cubic
    }

    @Override
    public double fromBasicUnit(double valueJTextInsert) {
        return (valueJTextInsert) * (1);//centimetre cubic to milliletre
    }
}
