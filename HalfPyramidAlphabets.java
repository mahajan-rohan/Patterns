/*

A 
A B 
A B C 
A B C D 
A B C D E

 */
public class HalfPyramidAlphabets {
    public static void main(String[] args) {
        int n=5;
        char ch ='A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch+++" ");
            }
            System.out.println();
            ch='A';
        }
    }
}
