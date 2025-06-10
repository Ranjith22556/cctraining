public class simpleprint {
    public static void main(String[] args) {
        String name="Ranjith";
        char gender='M';
        long phn=9391387930L;
        float salary=30000.00f;
        System.out.printf("%s",name);
        System.out.println();
        System.out.printf("%c",gender);
        System.out.println();
        System.out.printf("%d",phn);
        System.out.println();
        System.out.printf("%f",salary);
        System.out.println();
        System.out.printf("%.2f",salary);
        System.out.println();
        System.out.printf("%.5f",salary);
    }
}
