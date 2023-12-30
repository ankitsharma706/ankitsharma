public class prac03 {
    public static void main(String[] args) {
        StringBuilder o = new StringBuilder();
        for (int i = 0; i < 45; i++) {
            o.append("#");
        }
        System.out.println(o);
        System.out.println("##                                         ##");
        System.out.println("##                                         ##");
        System.out.println("##                                         ##");
        System.out.println("##                                         ##");
        System.out.println("##                                         ##");
        System.out.println("##                                         ##");
        System.out.println(o);
        String x = "#".repeat(45);
        System.out.println(x);
        String y = " ".repeat(41);
        System.out.println("##" + y + "##");
        System.out.println("##" + y + "##");
        System.out.println("##" + y + "##");
        System.out.println("##" + y + "##");
        System.out.println("##" + y + "##");
        System.out.println("##" + y + "##");
        System.out.println(x);
        System.out.println(("#").repeat(45));
        System.out.println("##"+((" ").repeat(41))+"##");
        System.out.println("##"+((" ").repeat(41))+"##");
        System.out.println("##"+((" ").repeat(41))+"##");
        System.out.println("##"+((" ").repeat(41))+"##");
        System.out.println("##"+((" ").repeat(41))+"##");
        System.out.println(("#").repeat(45));
    }
}
