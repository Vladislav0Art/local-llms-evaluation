package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        String expected = "App1";
        AppVersion appVersion1 = AppVersion.parseName(expected);
        AppVersion appVersion2 = AppVersion.parseName(expected);
        assertEquals(true, appVersion1.equals(appVersion2));
    }

}