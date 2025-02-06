package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseName_MultiPartTest {

    @Test
    public void parseName_MultiPartTest() {
        String amiName = "1.0.0-amazon-linux-2.5.0-x86_64-gp2.8.3.1";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNotNull(appVersion);
    }

}