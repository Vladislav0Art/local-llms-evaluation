package com.netflix.frigga.ami;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class GeneratedTestNullName {

    private static AppVersion appVersion;

    @BeforeAll
    public static void setup() {
        appVersion = new AppVersion();
    }

    @Test
    public void testNullName() {
        AppVersion parsedName = AppVersion.parseName(null);
        assertNull(parsedName);
    }

}