public class NewAnimalAB {
    public abstract class AnimalAB implements AnimalIF {
        protected int quantidadeComida;
        protected int caminhoPercorrido;
        protected int horasDormidas;

        public AnimalAB() {
            this.quantidadeComida = 0;
            this.caminhoPercorrido = 0;
            this.horasDormidas = 0;
        }

        @Override
        public abstract void comer();

        @Override
        public abstract void moverse();

        @Override
        public abstract void dormir();
    }

    public class Cachorro extends AnimalAB {

        @Override
        public void comer() {
            quantidadeComida += 10; // O cachorro come 10 unidades de comida
            System.out.println("O cachorro comeu. Quantidade de comida ingerida: " + quantidadeComida);
        }

        @Override
        public void moverse() {
            caminhoPercorrido += 5; // O cachorro se move 5 unidades de distância
            System.out.println("O cachorro se moveu. Caminho percorrido: " + caminhoPercorrido);
        }

        @Override
        public void dormir() {
            horasDormidas += 8; // O cachorro dorme por 8 horas
            System.out.println("O cachorro dormiu. Horas dormidas: " + horasDormidas);
        }
    }

    public class Gato extends AnimalAB {

        @Override
        public void comer() {
            quantidadeComida += 5; // O gato come 5 unidades de comida
            System.out.println("O gato comeu. Quantidade de comida ingerida: " + quantidadeComida);
        }

        @Override
        public void moverse() {
            caminhoPercorrido += 3; // O gato se move 3 unidades de distância
            System.out.println("O gato se moveu. Caminho percorrido: " + caminhoPercorrido);
        }

        @Override
        public void dormir() {
            horasDormidas += 12; // O gato dorme por 12 horas
            System.out.println("O gato dormiu. Horas dormidas: " + horasDormidas);
        }
    }

    public class Elefante extends AnimalAB {

        @Override
        public void comer() {
            quantidadeComida += 50; // O elefante come 50 unidades de comida
            System.out.println("O elefante comeu. Quantidade de comida ingerida: " + quantidadeComida);
        }

        @Override
        public void moverse() {
            caminhoPercorrido += 2; // O elefante se move 2 unidades de distância
            System.out.println("O elefante se moveu. Caminho percorrido: " + caminhoPercorrido);
        }

        @Override
        public void dormir() {
            horasDormidas += 6; // O elefante dorme por 6 horas
            System.out.println("O elefante dormiu. Horas dormidas: " + horasDormidas);
        }
    }

    public class Leao extends AnimalAB {

        @Override
        public void comer() {
            quantidadeComida += 30; // O leão come 30 unidades de comida
            System.out.println("O leão comeu. Quantidade de comida ingerida: " + quantidadeComida);
        }

        @Override
        public void moverse() {
            caminhoPercorrido += 7; // O leão se move 7 unidades de distância
            System.out.println("O leão se moveu. Caminho percorrido: " + caminhoPercorrido);
        }

        @Override
        public void dormir() {
            horasDormidas += 10; // O leão dorme por 10 horas
            System.out.println("O leão dormiu. Horas dormidas: " + horasDormidas);
        }
    }
}
