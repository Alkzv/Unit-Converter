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
public class KilometreConverter extends AbstractConverter {

    public KilometreConverter() {

        super.setDescriptionClassConverter(MeasureType.DISTANCEKILOMETRE);
         

    }
}
