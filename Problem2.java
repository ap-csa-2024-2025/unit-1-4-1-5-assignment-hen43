public class Problem2{
    public static void main(String[] args){
        
        int wankyGronkler = 437;
        int digitOne = wankyGronkler / 100;
        int digitTwo = wankyGronkler / 10 % 10;
        int digitThree = wankyGronkler % 100 % 10;

        System.out.println(digitOne);
        System.out.println(digitTwo);
        System.out.println(digitThree);
        
    }
}
