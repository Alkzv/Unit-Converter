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
public class SquareMetreConverter extends AbstractConverter {

    public SquareMetreConverter() {

        super.setDescriptionClassConverter(MeasureType.AREASQUAREMETRE);

    }

    @Override
    public double toBasicUnit(double valueJTextInsert) {
        return valueJTextInsert/7140;// square meters to soccer field 
    }

    @Override
    public double fromBasicUnit(double valueJTextInsert) {
        return valueJTextInsert*7140; // soccer field to square meters;
    }
}
