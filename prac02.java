public class prac02 {
    public static void main(String[] args) {
        // System.out.println("Welcome to the world of iter");
        // String x="Ankit";
        // double y=0.5*3*4;
        // System.out.println(x);
        // System.out.println(y);
        int x1 = 45;
        int y1 = 68;
        int z1 = 98;
        // int temp = x1;
        // x1 = y1;
        // y1 = temp;
        // System.out.println("x: " + x1 + " y: " + y1);

        // x1 = x1 + y1;
        // y1 = x1 - y1;
        // x1 = x1 - y1;
        // System.out.println("x: " + x1 + " y: " + y1);
        x1 = x1 + y1 + z1;
        y1 = x1 - y1 - z1;
        z1 = x1 - y1 - z1;
        x1 = x1 - y1 - z1;
        System.out.println("x: " + x1 + " y: " + y1 + " z1 : " + z1);

        String ruler1 = "1";
        String ruler2 = ruler1 + " 2 " + ruler1;
        String ruler3 = ruler2 + " 3 " + ruler2;
        String ruler4 = ruler3 + " 4 " + ruler3;

        System.out.println(ruler1 + "\n" + ruler2 + "\n" + ruler3 + "\n" + ruler4);

    }
}
