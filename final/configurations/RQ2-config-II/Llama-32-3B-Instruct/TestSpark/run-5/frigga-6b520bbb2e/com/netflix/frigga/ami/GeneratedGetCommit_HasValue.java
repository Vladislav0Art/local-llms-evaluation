package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetCommit_HasValue {

    @Test
    public void getCommit_HasValue() {
        AppVersion app = new AppVersion("", "");
        String result = app.getCommit();
        assertNull(result);
    }

}