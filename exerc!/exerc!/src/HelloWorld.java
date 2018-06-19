public class HelloWorld{
    public static void main(String[] args) {
        String nome="Victor";
        int num1 = 1;
        int num2 = 3;
        int cont = 5;
        int acumulador=0;
        // ele vai "printar "Hello, World" na janela do terminal
        //System.out.println("Hello, World");

        if ((num1 + num2)>= 5) {
            System.out.println("Xanada");
        }else if(num1 > 10) {
            System.out.println("Xanaia");
        }else{
            System.out.println("Xampola");
        }

        while(cont > 0){
            acumulador ++;
            cont --;
        }
        System.out.println(acumulador);

        for(int i = 1; i <= 10; ++i){
            System.out.println( i );

            /*
             * for(parte1; parte2; parte3)
             * parte1: é onde nós declaramos uma variável
             * parte2: é onde nós colocamos uma condição
             * para qeu continue ou seja terminado
             * parte3: é onde nós incrementamos a nossa variável
             * */
        }
    }
}
