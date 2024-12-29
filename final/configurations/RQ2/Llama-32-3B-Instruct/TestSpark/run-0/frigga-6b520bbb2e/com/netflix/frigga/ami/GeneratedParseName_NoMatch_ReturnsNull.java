package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedParseName_NoMatch_ReturnsNull {

    @Test
    public void parseName_NoMatch_ReturnsNull() {
        String amiName = "ami-defghijklmno";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNull(appVersion);
    }

}