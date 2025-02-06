package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetVersion_ReturnsExpectedVersion {

    @Test
    public void getVersion_ReturnsExpectedVersion() {
        String expectedVersion = "1.0";
        AppVersion appVersion = new AppVersion("1.0", "build");
        assertEquals(expectedVersion, appVersion.getVersion());
    }

}