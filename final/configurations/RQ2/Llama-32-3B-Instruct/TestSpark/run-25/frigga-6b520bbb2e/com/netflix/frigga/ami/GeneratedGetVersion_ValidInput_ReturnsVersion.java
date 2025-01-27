package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetVersion_ValidInput_ReturnsVersion {

    @Test
    public void getVersion_ValidInput_ReturnsVersion() {
        AppVersion appVersion = new AppVersion("1.0-1");
        String version = appVersion.getVersion();
        assertEquals("1.0", version);
    }

}