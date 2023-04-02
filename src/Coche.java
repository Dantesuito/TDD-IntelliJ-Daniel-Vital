public class Coche {
    public int velocidad;

    public void acelerar_Daniel_Vital_Torres(int aceleracion) {
        velocidad += aceleracion;
    }

    public void decelerar_Daniel_Vital_Torres(int deceleracion) {
        velocidad -= deceleracion;
        if (velocidad < 0){
            velocidad = 0;
        }
    }
}
