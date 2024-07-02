//1. Crie uma classe Counter que tenha uma variável estática count e um método
//construtor que incremente essa variável toda vez que uma nova instância da
//classe for criada. Adicione um método estático getCount que retorna o valor de
//count.
public class Counter {
    private static int count = 0;

    public Counter() {
        count++;
    }
    public static int getCount() {
        return count;
    }
}
