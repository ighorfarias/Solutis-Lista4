public class Pombo extends AnimalVoadorAB {

    @Override
    public void voar() {
        caminhoPercorrido += 20;
        System.out.println("O pombo voou. Caminho percorrido: " + caminhoPercorrido);
    }

    @Override
    public void comer() {
        quantidadeComida += 2;
        System.out.println("O pombo comeu. Quantidade de comida ingerida: " + quantidadeComida);
    }

    @Override
    public void dormir() {
        horasDormidas += 5;
        System.out.println("O pombo dormiu. Horas dormidas: " + horasDormidas);
    }
}