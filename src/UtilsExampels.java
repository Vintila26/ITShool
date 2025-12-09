import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class UtilsExampels {
    public static void main(String[] args) {
//        localDateExampels();
//        localDateTimeExampels();
//        rendomExampels();
//        mathExampels();
        durationExampels();
}
    public static void localDateExampels() {
        LocalDate today = LocalDate.now();
        System.out.println("Today is : " +today);

        LocalDate tenDays = today.plusDays(10);
        System.out.println("Then days from now: " + tenDays);

        System.out.println("2 monyhs befor: "+ today.minusMonths(2));

        System.out.println("2 years before: "+ today.minusYears(2));

//        String format = "2025-12-09";
//        DateTimeFormatter formater = DateTimeFormatter.ofPattern("DD-MM-YYYY");
//        LocalDate date = LocalDate.parse(format, formater);
//        System.out.println(date);


    }

    public static void localDateTimeExampels() {

        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);
        System.out.println(today.plusHours(21));


//        String dateTimeString = "2025-12-09 19:57";
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm");
//        LocalDateTime secDateTime = LocalDateTime.parse(dateTimeString,formatter);
//        System.out.println(secDateTime);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm");
        System.out.println(today.format(formatter));

        LocalDateTime future = LocalDateTime.of(2025,12,9,20,05);
        String result = future.isBefore(today)? "Before" : " Afther";
        System.out.println("before or afther ? : " +result);
        System.out.println(future);

        java.util.Date utilDate = new java.util.Date();
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

        System.out.println("util date : "+ utilDate);
        System.out.println("Sql date : " + sqlDate);

        Timestamp timeStemp = new Timestamp(sqlDate.getTime());
        System.out.println("TimeStemp : " + timeStemp);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        String formated = simpleDateFormat.format(utilDate);
        System.out.println(formated);

    }


    public  static void rendomExampels(){

        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println(number);

        double rendomDoble = random.nextDouble();
        System.out.println(rendomDoble);

        String[] name = {"Marcel", "marcela", "Ion"};
        System.out.println(name[random.nextInt(name.length)]);

    }


    public static void mathExampels(){

        int nr1= 11;
        int nr2= 13;
        System.out.println(Math.min(nr1,nr2));
        System.out.println(Math.max(nr1,nr2));
        System.out.println(Math.PI);

    }

    public  static void durationExampels(){

        LocalDateTime time1 = LocalDateTime.now();
        LocalDateTime time2 = time1.plusDays(1).plusHours(5).plusMinutes(7766);
        Duration duration = Duration.between(time1,time2);
        System.out.println(duration.toHours());
        System.out.println(duration.toMinutes());
    }


}
