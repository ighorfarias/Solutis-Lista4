public abstract class AnimalMarinhoAB extends AnimalAB {

    public abstract void nadar();

    @Override
    public void moverse() {
        nadar(); // Animais marinhos se movem nadando
    }
}