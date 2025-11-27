public class JavaStatements {
    public static void main(String[] args) {

        int currentYear = 2025;
        int birthYear = 1997;

        int diffYear = currentYear - birthYear ;

        if(diffYear < 18){
            System.out.println("Sunt minor");
        }else {
            System.out.println("Nu sunt minor");
        }

    }
}
