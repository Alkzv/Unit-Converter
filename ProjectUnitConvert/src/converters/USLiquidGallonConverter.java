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
public class USLiquidGallonConverter extends AbstractConverter {

    public USLiquidGallonConverter() {

        super.setDescriptionClassConverter(MeasureType.VOLUMEUSLIQUIDGALLON);

    }

    @Override
    public double toBasicUnit(double valueJTextInsert) {
        return (valueJTextInsert) * (3785);// gallon american to cubic centimetre 
    }

    @Override
    public double fromBasicUnit(double valueJTextInsert) {
        return (100 * valueJTextInsert) / (3785 * 100); // cubic centimetre to gallon american  
    }
}
