public class AstralBody {

    //Values Given in constructor in main
    private double distanceFromSun;
    private double radius;
    private double albedo;
    private double TObsK;
    private double TObsC;
    private String name;

    //Generated values in this class
    private double S_ave;
    private double S_ave_albedo;
    private double T_p_K;
    private double T_p_C;
    private double s_P ;

    //Hard coded values : SEPARATE FOR DEBUGGING
    private double Stefan_Boltz_Const = 5.67 * Math.pow(10,-8);
    private double radiusOfSun = 700000;
    private double AU = 1.5 * Math.pow(10,8);
    private double S_s = 6.42 * Math.pow(10,7);

    public AstralBody(double distanceFromSun, double radius, double albedo, double TObsK, double TObsC, String name) {   
        this.distanceFromSun = distanceFromSun * AU;    //Huge bug came here, forgot to multiply by the unit of measurement.
        this.albedo = albedo;
        this.radius = radius;
        this.TObsC = TObsC;
        this.TObsK = TObsK;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public double getDistanceFromSun() {
        return this.distanceFromSun;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getAlbedo() {
        return this.albedo;
    }

    public double generate_S_p() {
        s_P = (S_s*(radiusOfSun*radiusOfSun)) / (distanceFromSun*distanceFromSun);  //Didnt want to make a static method, so we will just use this formula as s_P throughout the code.
        return s_P;
    }

    public double getTObsK() {
        return this.TObsK;
    }

    public double getTObsC() {
        return this.TObsC;
    }

    public double generate_S_Ave_Albedo() {
        S_ave_albedo = ((S_s*(radiusOfSun*radiusOfSun)) / (distanceFromSun*distanceFromSun)/(4)) * (1 - albedo);
        return S_ave_albedo;
    }

    public double generate_temperature_K() {
        T_p_K = Math.pow(((((S_s*(radiusOfSun*radiusOfSun)) / (distanceFromSun*distanceFromSun)/(4)) * (1 - albedo)) / Stefan_Boltz_Const), (0.25));
        return T_p_K;
    }

    public double generate_temperature_C() {
        //Got T_p_K here
        T_p_C = Math.pow(((((S_s*(radiusOfSun*radiusOfSun)) / (distanceFromSun*distanceFromSun)/(4)) * (1 - albedo)) / Stefan_Boltz_Const), (0.25));
        //Conversion Factor
        T_p_C -= 273.15;
        return T_p_C;
    }

    public double generate_S_ave() {
        S_ave = ((S_s*(radiusOfSun*radiusOfSun)) / (distanceFromSun*distanceFromSun)) / (4);
        return S_ave;
    }

}
