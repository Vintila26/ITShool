package HomeWorks;

public class Home6 {
    public static void main(String[] args) {

//        //Reverse a String
//        //Description: Write a program to reverse an input string using StringBuilder.


//        String str1 ="Inversat" ;
//        StringBuilder str2 = new StringBuilder(str1);
//        System.out.println("Textul este : " +str1);
//        System.out.println("Textul inversat este : " +str2.reverse());

        // Palindrome Checker
        //Description: Check if a string is a palindrome using StringBuilder.

        //     String str1 = "capac";
        //        StringBuilder str2 = new StringBuilder(str1);
        //        str2.reverse();
        //        System.out.println("Cuvantul inversat : " + str2);
        //        if (str1.equals(str2.toString())){
        //            System.out.println("Cuvantul este palindrom");
        //        }else{
        //            System.out.println("Cuvantul nu este palindrom");
        //        }

        //Concatenate Multiple Strings
        //Description: Efficiently concatenate multiple strings into one using StringBuilder.


//        String [] nume = {"Ion ", "Ana" ,"Daniel","Razvan"};
//        StringBuilder num = new StringBuilder();
//        int i = 1 ;
//        for (String str1:nume){
//            num.append("Numele nr").append(i).append(" ").append(str1).append(" ");
//            i++;
//
//        }
//        System.out.println(num);

        //Removing Vowels
        //Description: Remove all vowels from a string using StringBuilder.

  //      String str1 = "Eliminare vocale ";
        //        StringBuilder str2 = new StringBuilder();
        //        for (int i=0 ; i<str1.length() ; i++){
        //            char lit = str1.charAt(i);
        //            if("aeiouAEIOU".indexOf(lit)== -1) {
        //                str2.append(lit);
        //            }
        //        }
        //        System.out.println("Sirul vare vocale este : " +str2);


        //Word Capitalizer
        //Description: Capitalize the first letter of every word in a sentence using StringBuilder.


//        String str1 = "avem o propozitie ";
//        StringBuilder str2= new StringBuilder();
//        String [] cuvinte = str1.split(" ");
//        for (String cuvant : cuvinte){
//            if (cuvant.length() > 0 ){
//                String primaLitere=cuvant.substring(0 , 1).toUpperCase();
//                String restulCuvantului = cuvant.substring(1);
//                str2.append(primaLitere).append(restulCuvantului).append(" ");
//            }
//
//        }
//        System.out.println("Sirul cu prima litera din cuvant marita este : " +str2);


        //String Replacement
        //Description: Replace all occurrences of a substring in a string using StringBuilder.


        String str1 = "doua persoane au doua masini diferite si merg pe doua rute diferite";
        StringBuilder str2 = new StringBuilder(str1);
        String deCautat = "doua";
        String deInlocuit= "trei";
        int index = str2.indexOf(deCautat);
        while (index != -1){
            str2.replace(index, index - deCautat.length(), deInlocuit);
            index = str2.indexOf(deCautat,index + deInlocuit.length() );
        }
        System.out.println("Sirul modificat este : " + str2);
    }
}
