public class Questao1 {
    public static void main(String[] args){

        int[] arr = {9,2,1,4,6};
        int aux;
        int tamanho = arr.length;
        

        //Algoritmo de ordenação Bubble Sort
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1 ; j <arr.length; j++){
                    if(arr[i] > arr[j]){
                        aux=arr[j];
                        arr[j] = arr[i];
                        arr[i] = aux; 
                    }
            }
        }


        System.out.print("Valores : ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " "); // 1 2 4 6 9
        }
        
        
        System.out.print("\nValor do meio : ");
        System.out.println(arr[tamanho/2]);

    }
}
