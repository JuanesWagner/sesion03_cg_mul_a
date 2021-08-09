public class Cilindrica {
    private float radioP,azimutal,z;

    public Cilindrica(float radioP, float azimutal, float z) {
        this.radioP = radioP;
        this.azimutal = azimutal;
        this.z = z;
    }
    
    public Cilindrica esferica_cilindrica(float radio1, float angulot){
        float radioP1= (float)Math.sqrt(Math.pow(radio1, 2)*Math.pow(Math.sin(angulot), 2));
        return new Cilindrica(radioP,azimutal,z);
    }

    public float getRadioP() {
        return radioP;
    }

    public void setRadioP(float radioP) {
        this.radioP = radioP;
    }

    public float getAzimutal() {
        return azimutal;
    }

    public void setAzimutal(float azimutal) {
        this.azimutal = azimutal;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    
}
