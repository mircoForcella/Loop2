public class Start {
    public static void main(String[] args) {
        for(int i = 0, y = 1 ; i <= 34; i = y + i, y = y + i){
            System.out.println(i);
            System.out.println(y);
        }
    }
}
