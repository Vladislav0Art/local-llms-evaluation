package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.regex.Pattern;

public class GeneratedCompareToTest {

    @Test
    public void compareToTest() {
        AppVersion appVersion1 = AppVersion.parseName("ami-12345");
        AppVersion appVersion2 = AppVersion.parseName("ami-67890");
        int result = appVersion1.compareTo(appVersion2);
        assertTrue(result <= 1 || result >= -1);
    }

}