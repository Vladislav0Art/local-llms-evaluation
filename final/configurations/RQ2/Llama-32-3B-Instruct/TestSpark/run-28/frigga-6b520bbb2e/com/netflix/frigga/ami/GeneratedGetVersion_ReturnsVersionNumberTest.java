package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetVersion_ReturnsVersionNumberTest {

    @Test
    public void getVersion_ReturnsVersionNumberTest() {
        String version = "0.9.2";
        AppVersion appVersion = new AppVersion("0.9.2-0");
        assertEquals(version, appVersion.getVersion());
    }

}