package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedToString_HasEmptyValue {

    @Test
    public void toString_HasEmptyValue() {
        AppVersion app = new AppVersion("", "");
        assertNull(app.toString());
    }

}