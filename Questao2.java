public class Questao2 {
    public static void main(String[] args){

        int[] vetor = {1,5,3,4,2};
        
        int contador  = 0;
        int dado = 2;
        

        //Código  que utiliza dois FOR para fazer o calculo de 2 posições do vetor
        for(int i = 0; i<vetor.length ; i++){
            for(int j = i+1; j<vetor.length ; j++){
                if(Math.abs(vetor[i] - vetor[j]) == dado){ // Math abs retorna um valor positivo
                    contador++;
                } 
        }    
       }
        
       System.out.println("Existem " + contador + " Pares de inteiros no vetor com uma diferenca de " + dado); 
        




    }
}
