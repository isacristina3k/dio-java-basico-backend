public class ParametrosInvalidos extends RuntimeException {
    int parametroUm;
    int parametroDois;

    void VerificaParametro(int parametroUm, int parametroDois){
        if (parametroUm > parametroDois){
            System.out.println("O primeiro parametro deve ser menor que o segundo!");
        }
    }

    

}
