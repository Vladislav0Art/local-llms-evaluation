package com.netflix.frigga.ami;

import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class GeneratedCompareToSelfTest {

    @Test
    public void compareToSelfTest() {
        AppVersion appVersion = AppVersion.parseName("app-1.1.1-build2/WE-APP-app/2");
        assertEquals(0, appVersion.compareTo(appVersion));
    }

}