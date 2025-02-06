package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetChangelist_DeprecatedButNotImplemented {

    @Test
    public void getChangelist_DeprecatedButNotImplemented() {
        AppVersion app = new AppVersion("", "");
        String result = app.getChangelist();
        assertNull(result);
    }

}