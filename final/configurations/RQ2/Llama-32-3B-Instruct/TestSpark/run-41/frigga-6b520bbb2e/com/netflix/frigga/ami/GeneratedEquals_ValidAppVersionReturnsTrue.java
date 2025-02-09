package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedEquals_ValidAppVersionReturnsTrue {

    @Test
    public void equals_ValidAppVersionReturnsTrue() {
        AppVersion appVersion1 = new AppVersion("my-app", "1.0");
        AppVersion appVersion2 = new AppVersion("my-app", "1.0");
        assertTrue(appVersion1.equals(appVersion2));
    }

}