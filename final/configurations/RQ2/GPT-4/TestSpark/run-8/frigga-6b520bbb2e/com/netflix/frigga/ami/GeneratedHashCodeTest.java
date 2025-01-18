package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.regex.Pattern;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        AppVersion appVersion = AppVersion.parseName("ami-12345");
        int result = appVersion.hashCode();
        assertTrue(result >= Integer.MIN_VALUE && result <= Integer.MAX_VALUE);
    }

}