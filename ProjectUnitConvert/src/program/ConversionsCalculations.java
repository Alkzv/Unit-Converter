/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import converters.ClassInterface.AbstractConverter;
import java.util.regex.Pattern;

/**
 *
 * @author PC
 */
public class ConversionsCalculations {

    private String valueJComboBox01ConvertFrom;
    private String valueJComboBox02To;
    private double valueJTextInsertInDouble;
    private double valueConverted;

    public ConversionsCalculations(String valueJComboBox01ConvertFrom, String valueJComboBox02To, double valueJTextInsertInDouble) {

        this.valueJComboBox01ConvertFrom = valueJComboBox01ConvertFrom;
        this.valueJComboBox02To = valueJComboBox02To;
        this.valueJTextInsertInDouble = valueJTextInsertInDouble;

    }

    public double Conversions() {

        try {

            String[] nameClassvalueJComboBox01ConvertFrom = valueJComboBox01ConvertFrom.split(Pattern.quote(":"));
            String nameClassToConversionJComboBox01ConvertFrom = nameClassvalueJComboBox01ConvertFrom[1];
            nameClassToConversionJComboBox01ConvertFrom = nameClassToConversionJComboBox01ConvertFrom.trim();
            String[] nameClassvalueJComboBox02To = valueJComboBox02To.split(Pattern.quote(":"));
            String nameClassToConversionJComboBox02To = nameClassvalueJComboBox02To[1];
            nameClassToConversionJComboBox02To = nameClassToConversionJComboBox02To.trim();
            AbstractConverter convertFromClass = (AbstractConverter) Class.forName(nameClassToConversionJComboBox01ConvertFrom).newInstance();
            AbstractConverter toClass = (AbstractConverter) Class.forName(nameClassToConversionJComboBox02To).newInstance();
            valueConverted = toClass.fromBasicUnit(convertFromClass.toBasicUnit(valueJTextInsertInDouble));

        } catch (Exception e) {
            
            System.out.println(e);
            
        }
        return valueConverted;
    }

}
