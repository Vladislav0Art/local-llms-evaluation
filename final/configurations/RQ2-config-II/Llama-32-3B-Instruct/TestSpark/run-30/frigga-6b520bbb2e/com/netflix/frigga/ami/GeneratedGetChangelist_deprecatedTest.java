package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;

public class GeneratedGetChangelist_deprecatedTest {

    @Test
    public void getChangelist_deprecatedTest() {
        AppVersion appVersion = new AppVersion();
        assertEquals(NameConstants.CHangelistNotSupported, appVersion.getChangelist());
    }

}