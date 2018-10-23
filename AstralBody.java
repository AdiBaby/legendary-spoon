public class AstralBody {

    //Values Given in constructor in main
    public double distanceFromSun;
    public double radius;
    public double albedo;
    public double TObsK;
    public double TObsC;
    public String name;

    //Generated values in this class
    public double S_ave;
    public double S_ave_albedo;
    public double T_p_K;
    public double T_p_C;
    public double s_P ;

    //Hard coded values : SEPARATE FOR DEBUGGING
    public double Stefan_Boltz_Const = 5.67 * Math.pow(10,-8);
    public double radiusOfSun = 700000;
    public double AU = 1.5 * Math.pow(10,8);
    public double S_s = 6.42 * Math.pow(10,7);

    public AstralBody(double distanceFromSun, double radius, double albedo, double TObsK, double TObsC, String name) {       //Find out what t Obs is later
        this.distanceFromSun = distanceFromSun * AU;
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
        s_P = (S_s*(radiusOfSun*radiusOfSun)) / (distanceFromSun*distanceFromSun);
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
