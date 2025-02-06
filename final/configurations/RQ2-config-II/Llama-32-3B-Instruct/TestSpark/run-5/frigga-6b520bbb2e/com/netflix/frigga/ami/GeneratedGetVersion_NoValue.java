package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetVersion_NoValue {

    @Test
    public void getVersion_NoValue() {
        AppVersion app = new AppVersion("", "");
        assertNull(app.getVersion());
    }

}