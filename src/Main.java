
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello to Java!");
     //variabile
        int age=28;
        double waight =70.5d;
        short age2 = 29;
        long number = 2222022020202l;
        float waightfloat = 70.5f;
        boolean alive = true ;
        char litere = 'A';
        byte something = 0;

        System.out.println("Varsta mea :" + age);
        System.out.println("Varsta a doua :" + age2);
        System.out.println("un numar : " + number);
        System.out.println("Cantaresc :"+ waight);
        System.out.println("cantaresc mai exact : "+ waightfloat);
        System.out.println("Sunt in viata :" + alive);
        System.out.println("Prima litera : " + litere);
        System.out.println("printez byte:" +something);

        String name = "Cristian";
        System.out.println("Ma numesc :" + name);

        int numar1 = 10 ;
        int numar2 = 5 ;
        int sum = 0 ;
        sum = numar1 + numar2 ;
        System.out.println("Suma este :" + sum);
        int dif= numar1 - numar2 ;
        System.out.println("Diferenta este :" + dif);
        int mul = numar1 * numar2;
        System.out.println("Inmultirea este:" + mul);
        int sub = numar1 / numar2;
        System.out.println("Impartirea este:" + sub);

// modificare
        int varA= 21;
        int varB= 6;
        int varC= 3;
        int varD= 1;

        int rez1 = varA - varB / varC;
        System.out.println("Rez1=" + rez1);

        int rez2 = (varA - varB) / varC;
        System.out.println("Rez2=" + rez2);

        int rez3 = varA / varC * varD + varB;
        System.out.println("Rez3=" + rez3);

        int rez4 = varA / (varC * (varD + varB));
        System.out.println("Rez4=" + rez4);

        int a = 2;
        int b = 3;
        int c = 4;

        System.out.println(a += b);
        System.out.println(a += 2);
        System.out.println(a += b + 13);
        System.out.println(a *= c * 2 + 2);

        a=1;
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++a);

        int x = 5;
        int y = x ++;
        System.out.println(x);
        System.out.println(y);

        int z=5;
        int w= ++ z;
        System.out.println(z);
        System.out.println(w);

        x = 5;
        y = x --;
        System.out.println(x);
        System.out.println(y);

        z = 5 ;
        w = --z ;
        System.out.println(z);
        System.out.println(w);


    }
}