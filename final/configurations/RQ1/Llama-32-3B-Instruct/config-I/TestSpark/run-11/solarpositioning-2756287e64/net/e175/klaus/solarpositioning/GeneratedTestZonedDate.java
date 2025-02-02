package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class GeneratedTestZonedDate {

    @Test
    public void testZonedDate() {
        ZonedDateTime date = ZonedDateTime.now(ZoneId.of("UTC"));
        System.out.println(date);
    }

}