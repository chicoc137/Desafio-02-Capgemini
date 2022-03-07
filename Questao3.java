public class Questao3{

        public static void main(String[] args) {
   
            
              String texto = "tenha um bom dia";
              String palavra = texto.replaceAll("\\s+",""); // Função que retira os espaços do TEXTO passando por parametro qual parte do texto pegar e outro parametro o que vai substituir
              System.out.println(palavra); //palavra sem espaços


              String palavraEncriptada = gridPalavra(palavra);

              System.out.println("A palavra Encriptada é : " + palavraEncriptada);
            
            
        }
        
        static String gridPalavra(String palavra)
        {
            int t = palavra.length(); // retorna o tamanho da palavra
            int k = 0, linha, coluna;
            linha = (int) Math.floor(Math.sqrt(t)); // retorna a raiz quadrada e arredonda para o menor numero inteiro 
            coluna = (int) Math.ceil(Math.sqrt(t)); // retorna a raiz quadrada e arredonda para o maior numero inteiro
     
            if (linha * coluna < t || linha < coluna || linha > coluna)
            {
                linha = coluna;
            }
            
            char s[][] = new char[linha][coluna]; // Cria uma Matriz de CHAR para armazenar os caracteres da palavra
            String novaPalavra = "";
                 
             
             
           //convertendo a String em GRID
            for (int i = 0; i < linha; i++)
            {
                for (int j = 0; j < coluna; j++)
                {
                    if(k < palavra.length())
                        s[i][j] = palavra.charAt(k);
                    k++;
                }
            }
            
            
     
           
            // Criando a nova palavra encriptada
            for (int i = 0; i < linha; i++)
            {
                for (int j = 0; j < coluna; j++)
                {
                    novaPalavra += s[j][i];
                }
                novaPalavra+=" ";
            }
            
            return novaPalavra;
            
        }
            
            
        
    }