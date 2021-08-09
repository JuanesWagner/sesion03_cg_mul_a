public class Esferica {
    private float radio1,angulot,z;
    
    public Esferica (float radio1, float angulot, float z){
        this.radio1=radio1;
        this.angulot=angulot;
        this.z=z;
    }
    
    public Esferica cilidrica_esferica(float radioP, float azimutal){
        float p=(float)Math.sqrt(Math.pow(radioP, 2)+Math.pow(z, 2));
        return new Esferica(radio1,angulot,z);
    }

    public float getRadio1() {
        return radio1;
    }

    public void setRadio1(float radio1) {
        this.radio1 = radio1;
    }

    public float getAngulot() {
        return angulot;
    }

    public void setAngulot(float angulot) {
        this.angulot = angulot;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    
}
