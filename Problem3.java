public class Problem3{
    public static void main(String[] args){

        int wankyGronkler = 4372;
        int digitOne = wankyGronkler / 1000;
        int digitTwo = wankyGronkler / 100 % 10;
        int digitThree = wankyGronkler % 100 / 10;
        int digitFour = wankyGronkler % 10;

        System.out.println(digitFour);
        System.out.println(digitThree);
        System.out.println(digitTwo);
        System.out.println(digitOne);

    }
}