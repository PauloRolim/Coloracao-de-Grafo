/**
 * Para usar o programa atribua a variável matriz[][] um dos grafos escritos nos arquivos .TXT
 * é necessário informar o caminho do arquivo e a quantidade de vértices do grafo.
 */

public class Main {
    
    public static void main(String args[]) {
        Coloracao c = new Coloracao();   

        LerMatrizArquivo l = new LerMatrizArquivo(); // instanciação do leitor de arquivo
                                                                       
                                                                      // Passando a matriz do arquivo para o programa                                                                                
        int matriz[][] = l.leArquivoEImprimeInstancias("random.txt", 10); // os paramentros são: endereço do arquivo e número de vértices

        int aux[][] = matriz;

        char[] rs = c.colorir(aux);
        
        System.out.println("--------RESULTADOS--------");
        for (int i = 0; i < rs.length; i++) {
            System.out.println("COR DO VÉRTICE "+ i +" ->"+" "+ rs[i]);
        }
        System.out.println("--------------------------");


        System.out.println("-----CORES UTILIZADAS-----");
        System.out.print("Foram usadas as cores: ");

        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;
        int countE = 0;
        int countF = 0;
        int countG = 0;

        for(int i = 0; i < rs.length; i++){
            if( rs[i] == 'a'){
                countA = 1;
            } else if (rs[i] == 'b') {
                 countB = 1;    
            } else if (rs[i] == 'c') {
                   countC = 1;
            } else if (rs[i] == 'd') {
                    countD = 1;
            } else if (rs[i] == 'e') {
                    countE = 1;
            } else if (rs[i] == 'f') {
                    countF = 1;
            } else if (rs[i] == 'g') {
                     countG = 1;
            }
 
        }
        
        if(countA == 1){
            System.out.print("a");
        }

        if(countB == 1){
            System.out.print(" b");
        }
         
        if(countC == 1){
            System.out.print(" c");
        }

        if(countD == 1){
            System.out.print(" d");
        }

        if(countE == 1){
            System.out.print(" e");
        }
        
        if(countF == 1){
            System.out.print(" f");
        }

        if(countG == 1){
            System.out.print(" g");
        }
    }
}
