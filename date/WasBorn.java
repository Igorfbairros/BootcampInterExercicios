package aulas.trabalhandoComDatas.exercicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WasBorn {
    public static void main(String[] args) throws ParseException {
        long currentTimeMillis = System.currentTimeMillis();

        System.out.println(currentTimeMillis);

        Date date = new Date(currentTimeMillis);
        System.out.println(date);

        System.out.println("~~~~~~~~~~~~~~~~~");

        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        String wasBorn = "07-02-1991 00:00:00";
        String pointDate = "15-05-2015 00:00:00";
        Date dateWasBorn = sdf.parse(wasBorn);
        Date datePointDate = sdf.parse(pointDate);

        System.out.println(dateWasBorn);
        System.out.println(datePointDate);
        System.out.println("~~~~~~~~~~~~~~~~~");

        long dateWasBornMillis = dateWasBorn.getTime();
        long datePointDateMillis = datePointDate.getTime();

        System.out.println(dateWasBornMillis);
        System.out.println(datePointDateMillis);
        System.out.println("~~~~~~~~~~~~~~~~~");

        Date dateWasBornMillisDate = new Date(dateWasBornMillis);
        Date datePointDateMillisDate = new Date(datePointDateMillis);

        boolean isAfter = dateWasBornMillisDate.after(datePointDateMillisDate);
        boolean isBefore = dateWasBornMillisDate.before(datePointDateMillisDate);

        System.out.println(isAfter);
        System.out.println(isBefore);





    }
}
