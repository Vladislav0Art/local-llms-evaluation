package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZonedDateTime;
import java.time.ZoneOffset;

public class Generated[calcT_InvalidDate]

Test {

    @Test
    public void [calcT_InvalidDate]Test() {
        ZonedDateTime date = null;

        assertThrows(NullPointerException.class, () -> Grena3.calcT(date));
    }

}