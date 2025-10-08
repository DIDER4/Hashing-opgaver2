import java.util.Objects;

public class Bil {
    String registreringsnummer;
    String mærke;
    String model;
    String farve;

    public Bil(String registreringsnummer, String mærke, String model, String farve) {
        this.registreringsnummer = registreringsnummer;
        this.mærke = mærke;
        this.model = model;
        this.farve = farve;
    }

    public String getFarve() {
        return farve;
    }

    public String getModel() {
        return model;
    }

    public String getMærke() {
        return mærke;
    }

    public String getRegistreringsnummer() {
        return registreringsnummer;
    }

    public void setFarve(String farve) {
        this.farve = farve;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMærke(String mærke) {
        this.mærke = mærke;
    }

    public void setRegistreringsnummer(String registreringsnummer) {
        this.registreringsnummer = registreringsnummer;
    }

    @Override
    public int hashCode(){
        return Objects.hash(registreringsnummer,mærke);
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) {
            return true;
        } else if (obj instanceof Bil bil){
            return this.hashCode() == bil.hashCode();
        }
        return false;
    }

}
