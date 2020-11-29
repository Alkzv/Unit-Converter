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
public class MillimetreConverter extends AbstractConverter {

    public MillimetreConverter() {

        super.setDescriptionClassConverter(MeasureType.VOLUMEMILLIMETRE);

    }

    @Override
    public double toBasicUnit(double valueJTextInsert) {
        return valueJTextInsert/1000; // millimetre to cubic centimetre
    }

    @Override
    public double fromBasicUnit(double valueJTextInsert) {
        return valueJTextInsert*1000; // cubic centimetre to millimetre
    }
}
