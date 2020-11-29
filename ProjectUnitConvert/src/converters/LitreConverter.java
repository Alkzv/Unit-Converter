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
public class LitreConverter extends AbstractConverter {

    public LitreConverter() {

        super.setDescriptionClassConverter(MeasureType.VOLUMELITRE);

    }

    @Override
    public double toBasicUnit(double valueJTextInsert) {
        return valueJTextInsert*1000;// litre to centimetre cubic 
    }

    @Override
    public double fromBasicUnit(double valueJTextInsert) {
        return valueJTextInsert/1000;// centimetre cubic to litre
    }
}
