public class Notebook {
    Integer ram;
    Integer hdd;
    String operatingSystem;
    String colour;

    Notebook(Integer r, Integer hd, String os, String clr) {
        ram = r;
        hdd = hd;
        operatingSystem = os;
        colour = clr;
    }

    @Override
    public String toString() {
        String str = "===========================" + "\n"
                + "RAM: " + ram + ";  HDD: " + hdd
                + ";  OC: " + operatingSystem + ";  Color: " + colour;
        return str;
    }
    public boolean compRam(Notebook v) {
        if ((this.ram == v.ram) || (this.ram <= v.ram)) return true;
        else return false;
    }
    public boolean compHdd(Notebook v) {
        if ((this.hdd == v.hdd) || (this.hdd <= v.hdd)) return true;
        else return false;
    }
    public boolean compOperatingSystem(Notebook v) {
        if (this.operatingSystem == v.operatingSystem) return true;
        else return false;
    }
    public boolean compColour(Notebook v) {
        if (this.colour == v.colour) return true;
        else return false;
    }

}
