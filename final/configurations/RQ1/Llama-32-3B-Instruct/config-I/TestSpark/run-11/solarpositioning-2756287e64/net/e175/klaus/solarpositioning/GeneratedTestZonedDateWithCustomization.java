package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class GeneratedTestZonedDateWithCustomization {

    @Test
    public void testZonedDateWithCustomization() {
        ZonedDateTime date = ZonedDateTime.now().withYear(2022).withMonth(12).withDayOfMonth(30).withHour(0).withMinute(0).withSecond(0);
        System.out.println(date);

        date = ZonedDateTime.now().withYear(2024).withMonth(12).withDayOfMonth(30).withHour(0).withMinute(0).withSecond(0);
        System.out.println(date);
    }
}

public class UtilityMethods {

    public static String getUTCString(ZonedDateTime zdt) {
        return zdt.toString();
    }

    public static ZonedDateTime generateZonedDateWithCustomization() {
        ZonedDateTime date = ZonedDateTime.now().withYear(2022).withMonth(12).withDayOfMonth(30).withHour(0).withMinute(0).withSecond(0);
        date = date.withZoneSameInstant(ZoneId.of("UTC"));
        return date;
    }
}

public class Main {

    public static void main(String[] args) {
        GeneratedTest test = new GeneratedTest();
        UtilityMethods utilityMethods = new UtilityMethods();

        System.out.println(test.testZonedDate());
        System.out.println(test.testZonedDateWithCustomization());

        ZonedDateTime zdt = utilityMethods.generateZonedDateWithCustomization();
        System.out.println(utilityMethods.getUTCString(zdt));
    }

}