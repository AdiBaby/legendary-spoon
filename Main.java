/**
* (C) ADITYA PREREPA 10-22-18
* NO EXTERNAL API USE
**/

public class Main {
    public static void main(String[] args) {

        AstralBody mercury = new AstralBody(0.39, 2440, 0.1, 440, 167, "Mercury");
        AstralBody venus = new AstralBody(0.732, 6052, 0.75, 735, 462, "Venus");
        AstralBody earth = new AstralBody(1, 6378, 0.3, 735, 462, "Earth");
        AstralBody moon = new AstralBody(1, 1738, 0.12, 0.00, 0.00, "Moon");
        AstralBody mars = new AstralBody(1.524, 3397, 0.25, 215, -58, "Mars");

        //This makes me sad :(
        String[] params = new String[10];
        params[0] = "distance (KM)";
        params[1] = "radius (km)";
        params[2] = "albedo";
        params[3] = "S_p Wm^-2";
        params[4] = "s_Ave Wm^-2";
        params[5] = "S_Albedo Wm^-2";
        params[6] = "T_K";
        params[7] = "T_C";
        params[8] = "T_ObsK";
        params[9] = "T_ObsC";

        //Sorry for this...This is pretty stupid planning
        double[] mercuryValues = new double[10];
        mercuryValues[0] = mercury.getDistanceFromSun();
        mercuryValues[1] = mercury.getRadius();
        mercuryValues[2] = mercury.getAlbedo();
        mercuryValues[3] = mercury.generate_S_p();
        mercuryValues[4] = mercury.generate_S_ave();
        mercuryValues[5] = mercury.generate_S_Ave_Albedo();
        mercuryValues[6] = mercury.generate_temperature_K();
        mercuryValues[7] = mercury.generate_temperature_C();
        mercuryValues[8] = mercury.getTObsK();
        mercuryValues[9] = mercury.getTObsC();

        double[] venusValues = new double[10];
        venusValues[0] = venus.getDistanceFromSun();
        venusValues[1] = venus.getRadius();
        venusValues[2] = venus.getAlbedo();
        venusValues[3] = venus.generate_S_p();
        venusValues[4] = venus.generate_S_ave();
        venusValues[5] = venus.generate_S_Ave_Albedo();
        venusValues[6] = venus.generate_temperature_K();
        venusValues[7] = venus.generate_temperature_C();
        venusValues[8] = venus.getTObsK();
        venusValues[9] = venus.getTObsC();

        double[] earthValues = new double[10];
        earthValues[0] = earth.getDistanceFromSun();
        earthValues[1] = earth.getRadius();
        earthValues[2] = earth.getAlbedo();
        earthValues[3] = earth.generate_S_p();
        earthValues[4] = earth.generate_S_ave();
        earthValues[5] = earth.generate_S_Ave_Albedo();
        earthValues[6] = earth.generate_temperature_K();
        earthValues[7] = earth.generate_temperature_C();
        earthValues[8] = earth.getTObsK();
        earthValues[9] = earth.getTObsC();

        double[] moonValues = new double[10];
        moonValues[0] = moon.getDistanceFromSun();
        moonValues[1] = moon.getRadius();
        moonValues[2] = moon.getAlbedo();
        moonValues[3] = moon.generate_S_p();
        moonValues[4] = moon.generate_S_ave();
        moonValues[5] = moon.generate_S_Ave_Albedo();
        moonValues[6] = moon.generate_temperature_K();
        moonValues[7] = moon.generate_temperature_C();
        moonValues[8] = moon.getTObsK();
        moonValues[9] = moon.getTObsC();

        double[] marsValues = new double[10];
        marsValues[0] = mars.getDistanceFromSun();
        marsValues[1] = mars.getRadius();
        marsValues[2] = mars.getAlbedo();
        marsValues[3] = mars.generate_S_p();
        marsValues[4] = mars.generate_S_ave();
        marsValues[5] = mars.generate_S_Ave_Albedo();
        marsValues[6] = mars.generate_temperature_K();
        marsValues[7] = mars.generate_temperature_C();
        marsValues[8] = mars.getTObsK();
        marsValues[9] = mars.getTObsC();

        //f Stands for float, huge bug came from using d instead. The s represents spaces.
        String leftAlignFormat = "| %-18s | %-18f | %-18f | %-18f | %-18f | %-18f |%n";
        //Notice the agility of this...Calls string from object rather than hard-coding a string
        System.out.format("+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+%n");
        System.out.format("| Planet             | " + mercury.getName() + "            |  " + venus.getName() + "              | " + earth.getName() + "              | " + moon.getName() + "              | " + mars.getName() + "               | %n");
        System.out.format("+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+%n");

        for (int i = 0; i <= 9; i++) {
            System.out.format(leftAlignFormat, params[i], mercuryValues[i], venusValues[i], earthValues[i], moonValues[i], marsValues[i]);
        }

        System.out.format("+--------------------+--------------------+--------------------+--------------------+--------------------+--------------------+%n");
    }
}
