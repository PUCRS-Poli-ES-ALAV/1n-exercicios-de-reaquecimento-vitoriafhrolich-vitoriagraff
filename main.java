import java.util.ArrayList;

public class main {

    public static void main(String[] args) {

        int x =6;
        int y=4;
        System.out.println("resultado:"+mutiplicacao(x,y));
        System.out.println("resultado:"+soma(x,y));
         System.out.println("resultado:"+calculo(x));
        System.out.println("Fatorial de 5: "+fatorial(5));
        System.out.println("Somatorio de 5: "+somatorio(5));
        System.out.println("Fibonacci de 10: "+fibonacci(10));
        System.out.println("Somatorio de 5 a 10: "+somatoriointervalo(5,10));
        System.out.println("Palindromo 'radar': "+isPal("radar"));
        System.out.println("Palindromo 'radar': "+isPal("abobora"));
        System.out.println("Palindromo 'hello': "+isPal("hello"));
        System.out.println("Conversao de 2 para base 2: "+convBase2(2));
        System.out.println("Somatório de array [1, 2, 3, 4, 5]: "+somatorioArray(new int[]{1, 2, 3, 4, 5}, 5));
        System.out.println("Maior valor do array [1, 2, 3, 4, 5]: "+findBiggest(new ArrayList<>(java.util.Arrays.asList(1, 2, 3, 4, 5))));
        System.out.println("Substr 'hello' em 'hello world': "+findSubStr("hello world", "hello"));

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
      public static int fatorial(int n){
        if (n == 0 || n == 1) {
        return 1;
    }
        return n * fatorial(n - 1);
}
public static int somatorio(int n) {
    if (n == 0) {
        return 0;
    }
    else if (n < 0) {
        return n+ somatorio(n + 1);
    }
    return n + somatorio(n - 1);
}
public static int fibonacci(int n) {
    if (n <= 1) {
        return n;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
}
public static int somatoriointervalo(int k, int j){
    if(k == j){
        return k;
    }
    if(k>j){
        return j +somatoriointervalo(k-1, j);
    }
    else{
        return k + somatoriointervalo(k+1, j);
    }
}
    public static boolean isPal(String s){
        if(s.length() <= 1){
            return true;
    }
    if(s.charAt(0)!= s.charAt(s.length() - 1)){
        return false;
    }
    return isPal(s.substring(1, s.length() - 1));
}
public static String convBase2(int n){
    if(n == 0){
        return "0";
    }
    if(n == 1){
        return "1";
    }
    return convBase2(n / 2) + (n % 2);
}
public static int somatorioArray(int arr[], int n) {
    if (n <= 0) {
        return 0;
    }
    return arr[n - 1] + somatorioArray(arr, n - 1);

}
public static int findBiggest(ArrayList<Integer> ar) {
    if(ar.size()==1){
        return ar.get(0);
    }
    int anterior= ar.remove(ar.size()-1);
    return Math.max(anterior, findBiggest(ar));
}
public static boolean findSubStr(String str, String match){
    if (str.length() < match.length()) {
        return false;
    }
    if (str.substring(0, match.length()).equals(match)) {
        return true;
    }
    return findSubStr(str.substring(1), match);
}

}
