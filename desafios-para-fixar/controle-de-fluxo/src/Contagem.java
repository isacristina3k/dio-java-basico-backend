public class Contagem {
    int recebeNumIteracoes;

    public int retornaNumIteracoes(int parametroUm, int parametroDois){

        int numIntercoes;
        numIntercoes = parametroDois - parametroUm;
        return numIntercoes;
    }

    public void imprimeIteracoes(int numIntercoes){
        recebeNumIteracoes = numIntercoes;
        for (int i=0; i > recebeNumIteracoes; i++){
            System.out.println("Imprimindo o numero" + i);

        }

    }

}
