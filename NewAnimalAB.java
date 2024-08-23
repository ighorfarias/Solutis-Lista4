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
            quantidadeComida += 10;
            System.out.println("O cachorro comeu. Quantidade de comida ingerida: " + quantidadeComida);
        }

        @Override
        public void moverse() {
            caminhoPercorrido += 5;
            System.out.println("O cachorro se moveu. Caminho percorrido: " + caminhoPercorrido);
        }

        @Override
        public void dormir() {
            horasDormidas += 8;
            System.out.println("O cachorro dormiu. Horas dormidas: " + horasDormidas);
        }
    }

    public class Gato extends AnimalAB {

        @Override
        public void comer() {
            quantidadeComida += 5;
            System.out.println("O gato comeu. Quantidade de comida ingerida: " + quantidadeComida);
        }

        @Override
        public void moverse() {
            caminhoPercorrido += 3;
            System.out.println("O gato se moveu. Caminho percorrido: " + caminhoPercorrido);
        }

        @Override
        public void dormir() {
            horasDormidas += 12;
            System.out.println("O gato dormiu. Horas dormidas: " + horasDormidas);
        }
    }

    public class Elefante extends AnimalAB {

        @Override
        public void comer() {
            quantidadeComida += 50;
            System.out.println("O elefante comeu. Quantidade de comida ingerida: " + quantidadeComida);
        }

        @Override
        public void moverse() {
            caminhoPercorrido += 2;
            System.out.println("O elefante se moveu. Caminho percorrido: " + caminhoPercorrido);
        }

        @Override
        public void dormir() {
            horasDormidas += 6;
            System.out.println("O elefante dormiu. Horas dormidas: " + horasDormidas);
        }
    }

    public class Leao extends AnimalAB {

        @Override
        public void comer() {
            quantidadeComida += 30;
            System.out.println("O leão comeu. Quantidade de comida ingerida: " + quantidadeComida);
        }

        @Override
        public void moverse() {
            caminhoPercorrido += 7;
            System.out.println("O leão se moveu. Caminho percorrido: " + caminhoPercorrido);
        }

        @Override
        public void dormir() {
            horasDormidas += 10;
            System.out.println("O leão dormiu. Horas dormidas: " + horasDormidas);
        }
    }
}
