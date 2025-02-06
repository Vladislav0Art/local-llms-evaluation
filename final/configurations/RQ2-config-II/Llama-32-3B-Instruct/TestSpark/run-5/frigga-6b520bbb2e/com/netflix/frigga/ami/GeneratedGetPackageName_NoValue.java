package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetPackageName_NoValue {

    @Test
    public void getPackageName_NoValue() {
        AppVersion app = new AppVersion("", "");
        assertNull(app.getPackageName());
    }

}