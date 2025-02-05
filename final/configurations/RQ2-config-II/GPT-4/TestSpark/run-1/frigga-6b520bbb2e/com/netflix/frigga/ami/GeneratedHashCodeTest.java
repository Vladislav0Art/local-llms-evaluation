package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

import com.netflix.frigga.ami.AppVersion;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        AppVersion appVersion1 = AppVersion.parseName("com.netflix:2.1.3:h12.345:b1234:abcdef");
        AppVersion appVersion2 = AppVersion.parseName("com.netflix:2.1.3:h12.345:b1234:abcdef");
        assertEquals(appVersion1.hashCode(), appVersion2.hashCode());
    }

}