package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetVersion_ReturnsExpectedVersion Test {

    @Test
    public void getVersion_ReturnsExpectedVersion

    Test() {
        AppVersion appVersion = new AppVersion("1.0-123456789");
        assertEquals("1.0", appVersion.getVersion());
    }

}