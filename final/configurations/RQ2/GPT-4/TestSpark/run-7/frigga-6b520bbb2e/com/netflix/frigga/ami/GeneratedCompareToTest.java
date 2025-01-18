package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;

public class GeneratedCompareToTest {

    @Test
    public void compareToTest() {
        AppVersion appVersion1 = AppVersion.parseName("App1");
        AppVersion appVersion2 = AppVersion.parseName("App2");
        assertEquals(-1, appVersion1.compareTo(appVersion2));
    }

}