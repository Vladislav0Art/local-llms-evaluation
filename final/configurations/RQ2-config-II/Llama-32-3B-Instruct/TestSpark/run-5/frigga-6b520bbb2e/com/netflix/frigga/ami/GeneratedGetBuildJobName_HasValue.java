package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetBuildJobName_HasValue {

    @Test
    public void getBuildJobName_HasValue() {
        AppVersion app = new AppVersion("my-our-app", "1.0");
        String result = app.getBuildJobName();
        assertEquals("build-my-our-app-1.0", result);
    }

}