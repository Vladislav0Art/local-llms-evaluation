package com.netflix.frigga.ami;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class GeneratedTestInvalidName {

    private static AppVersion appVersion;

    @BeforeAll
    public static void setup() {
        appVersion = new AppVersion();
    }

    @Test
    public void testInvalidName() {
        String name = "invalid-name";
        AppVersion parsedName = AppVersion.parseName(name);
        assertNull(parsedName);
    }

}