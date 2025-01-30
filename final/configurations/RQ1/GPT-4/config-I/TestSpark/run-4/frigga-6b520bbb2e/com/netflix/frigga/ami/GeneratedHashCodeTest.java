package com.netflix.frigga.ami;

import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        AppVersion appVersion = AppVersion.parseName("app-1.1.1-build2/WE-APP-app/2");
        int expected = ("app".hashCode() * 31
                + "1.1.1".hashCode() * 31
                + "build2".hashCode() * 31
                + "WE-APP-app".hashCode() * 31);

        assertEquals(expected, appVersion.hashCode());
    }

}