package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetBuildNumber_HasValue {

    @Test
    public void getBuildNumber_HasValue() {
        AppVersion app = new AppVersion("my-our-app", "1.0");
        String result = app.getBuildNumber();
        assertEquals("1.0", result);
    }

}