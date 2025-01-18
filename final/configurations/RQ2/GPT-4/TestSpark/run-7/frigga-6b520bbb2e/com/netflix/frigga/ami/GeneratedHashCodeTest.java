package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        String expected = "App1";
        AppVersion appVersion = AppVersion.parseName(expected);
        assertEquals(expected.hashCode(), appVersion.hashCode());
    }

}