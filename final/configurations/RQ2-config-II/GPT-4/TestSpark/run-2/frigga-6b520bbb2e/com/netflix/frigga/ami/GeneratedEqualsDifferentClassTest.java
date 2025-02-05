package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEqualsDifferentClassTest {

    @Test
    public void equalsDifferentClassTest() {
        AppVersion appVersion = AppVersion.parseName("amiName");
        assertFalse(appVersion.equals(new String("Sample string")));
    }

}