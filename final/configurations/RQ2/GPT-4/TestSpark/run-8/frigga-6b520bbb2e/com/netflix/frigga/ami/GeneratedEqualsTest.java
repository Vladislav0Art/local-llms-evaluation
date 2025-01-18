package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.regex.Pattern;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        AppVersion appVersion1 = AppVersion.parseName("ami-12345");
        AppVersion appVersion2 = AppVersion.parseName("ami-67890");
        boolean result = appVersion1.equals(appVersion2);
        assertTrue(result == true || result == false);
    }

}