package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

public class GeneratedParseName_ValidAMIName_ReturnsCorrectAppVersion {

    @Test
    public void parseName_ValidAMIName_ReturnsCorrectAppVersion() {
        AppVersion appVersion = AppVersion.parseName("1.2.3-4");
        assertEquals(1, appVersion.getVersionPart());
        assertEquals(2, appVersion.getMinorVersion());
        assertEquals(3, appVersion.getPatchVersion());
        assertTrue(Collections.singletonMap("packageName", "com.example").equals(appVersion.getPackageName()));
    }

}