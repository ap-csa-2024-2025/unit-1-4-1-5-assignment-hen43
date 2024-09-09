public class Problem1{
    public static void main(String[] args) {
        int skibidiGyatts = 7;
        for(int i = 0; i < 8; i++){
            if (i < 4) {
                skibidiGyatts++;
            }else{
                skibidiGyatts--;
            }
            System.out.println("Goon count is now " + skibidiGyatts);
        }
    }
}