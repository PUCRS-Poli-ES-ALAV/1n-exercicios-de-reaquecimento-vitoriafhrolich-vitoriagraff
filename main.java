public class main {

    public static void main(String[] args) {

        int x =6;
        int y=4;
        System.out.println("resultado:"+mutiplicacao(x,y));
        System.out.println("resultado:"+soma(x,y));
         System.out.println("resultado:"+calculo(x));
    }
    public static int mutiplicacao(int x, int y){   
        if (x == 0) {
        return 0;
    }
        return y + mutiplicacao(x - 1, y);  
        
    }
    public static int soma(int x, int y){
        if (y == 0){
            return x;
        }
        return soma(++x,--y);
    }
    public static double calculo(double x){
         if(x==0){
            return 0;
        }
        return 1/x + calculo(x-1);
    }
    public static String inversao(String n){
        
        return inversao(n);
    }
}
