package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZonedDateTime;
import java.time.ZoneOffset;

public class Generated[calcT_Dates]

Test {

    @Test
    public void [calcT_Dates]Test() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 12, 0, 0, ZoneOffset.UTC);

        assertEquals(-23955, Grena3.calcT(date), 1e-10);
    }

}