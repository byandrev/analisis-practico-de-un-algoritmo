import java.util.Scanner;

public class D {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        byte A = sc.nextByte();
        byte B = sc.nextByte();
        byte matriz[][] = new byte[A][B];//1

        for(byte i=0; i<A; i++){
            for(byte j=0; j<B; j++){
                matriz[i][j] = sc.nextByte();//1
            }
        }
        procesarMatriz(matriz);
        imp(matriz);
    }

    public static void procesarMatriz(byte matriz [][]){
        for(byte i=0; i<matriz.length; i++){
            for(byte j=0; j<matriz[i].length; j++){
                if(i%2==0){
                    matriz[i][j] += 1;
                }
                if(j%2==0){//2
                    matriz[i][j] += 2;
                }
                if(i%2!=0 && j%2!=0){
                    matriz[i][j] -= 3;
                }
            }
        }
    }

    public static void imp(byte matriz [][]){
        for(byte i=0; i<matriz.length; i++){
            for(byte j=0; j<matriz[i].length; j++){
                System.out.print(""+matriz[i][j]+(j<matriz[i].length-1?" ":"\n"));
            }
        }
    }
}