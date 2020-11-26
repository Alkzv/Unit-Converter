/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converters.Enum;

/**
 *
 * @author PC
 */
public enum MeasureType {
    
    DISTANCE("distance", "metre (m)"),
    AREA("area", "square metre (m\\u33a1)"),
    VOLUME("volume", "litre (L)"),
    MASS("mass", "kilogram (kg)"),
    TIME("time", "second (s)"),
    SPEED("speed", "m/s"),
    ACCELERATION("accelerations", "m/s\u00b2"),
    FORCE("force", "newton (N)"),
    PRESSURE("pressure", "pascal (Pa)"),
    ENERGY("energy", "joule (J)"),
    POWER("power", "watt (W)"),
    VISCOSITY("viscosity", "Pa·s");
    private String type;
    private String basicUnit;

    private MeasureType(String type, String basicUnit) {
        this.type = type;
        this.basicUnit = basicUnit;
    }

    public final String getBasicUnit() {
        return basicUnit;
    }

    public String getTypeString() {
        return (type);
    }
}
