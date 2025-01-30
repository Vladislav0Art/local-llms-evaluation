package com.netflix.frigga.ami;

import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class GeneratedCompareToOtherTest {

    @Test
    public void compareToOtherTest() {
        AppVersion appVersion1 = AppVersion.parseName("app-1.1.1-build2/WE-APP-app/2");
        AppVersion appVersion2 = AppVersion.parseName("app-1.1.1-build2/WE-APP-app/3");
        assertTrue(appVersion1.compareTo(appVersion2) < 0);
    }

}