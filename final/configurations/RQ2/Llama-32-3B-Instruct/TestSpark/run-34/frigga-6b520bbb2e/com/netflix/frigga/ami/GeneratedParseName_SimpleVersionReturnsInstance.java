package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseName_SimpleVersionReturnsInstance {

    @Test
    public void parseName_SimpleVersionReturnsInstance() {
        String amiName = "ami-123";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNotNull(appVersion);
    }

}