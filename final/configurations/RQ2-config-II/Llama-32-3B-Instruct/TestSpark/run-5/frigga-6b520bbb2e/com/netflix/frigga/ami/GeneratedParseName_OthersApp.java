package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseName_OthersApp {

    @Test
    public void parseName_OthersApp() {
        String amiName = "other-app:2.0";
        AppVersion result = AppVersion.parseName(amiName);
        assertNull(result.getPackageName());
        assertNull(result.getVersion());
    }

}