public class Peixe extends AnimalMarinhoAB {

    @Override
    public void nadar() {
        caminhoPercorrido += 15;
        System.out.println("O peixe nadou. Caminho percorrido: " + caminhoPercorrido);
    }

    @Override
    public void comer() {
        quantidadeComida += 3; //
        System.out.println("O peixe comeu. Quantidade de comida ingerida: " + quantidadeComida);
    }

    @Override
    public void dormir() {
        horasDormidas += 4;
        System.out.println("O peixe dormiu. Horas dormidas: " + horasDormidas);
    }
}