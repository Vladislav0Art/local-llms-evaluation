package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetChangelist_DeprecatedButImplemented {

    @Test
    public void getChangelist_DeprecatedButImplemented() {
        AppVersion app = new AppVersion("my-our-app", "1.0");
        String result = app.getChangelist();
        assertEquals("Changes since 1.0 in my-our-app.", result);
    }

}