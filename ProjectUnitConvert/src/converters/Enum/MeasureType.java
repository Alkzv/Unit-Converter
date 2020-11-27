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
    
    DISTANCECENTIMETRE("distance", "centimetre(cm)"),
    VOLUMECUBICCENTIMETRE("volume","cubic centimetre (cm³)"),
    VOLUMECUBICMETRE("volume","cubic metre (cm³)"),
    DISTANCEDECAMETRE("distance", "decametre (dam)"),
    DISTANCEDECIMETRE("distance", "decimetre (dm)"),
    DISTANCEHECTOMETRE("distance", "hectometre (hm)"),
    DISTANCEINCH("distance", "inch (in)"),
    DISTANCEKILOMETRE("distance", "kilometre (km)"),
    VOLUMELITRE("volume", "litre (L)"),
    DISTANCEMETRE("distance", "metre (m)"),
    DISTANCEMICROMETRE("distance", "micrometre (μm)"),
    VOLUMEMILLILITRE("volume", "millilitre (ml)"),
    VOLUMEMILLIMETRE("volume", "millimetre (mm)"),
    DISTANCENANOMETRE("distance", "nanometre (nm)"),
    AREASOCCERFIELD("area", "soccer field (FIFA) (--)"),
    AREASQUAREMETRE("area", "square metre (m²)"),
    VOLUMEUSLIQUIDGALLON("volume", "US liquid gallon (gal)"),
    DISTANCEYARD("distance", "yard (yd)"),
    MASS("mass", "kilogram (kg)"),
    TIME("time", "second (s)"),
    SPEED("speed", "m/s"),
    ACCELERATION("accelerations", "m/s²"),
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
