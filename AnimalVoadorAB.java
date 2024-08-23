public abstract class AnimalVoadorAB extends AnimalAB {

    public abstract void voar();

    @Override
    public void moverse() {
        voar(); // Animais voadores se movem voando
    }
}