package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetPackageName_HasValue {

    @Test
    public void getPackageName_HasValue() {
        AppVersion app = new AppVersion("my-our-app", "1.0");
        String result = app.getPackageName();
        assertEquals("my-our-app", result);
    }

}