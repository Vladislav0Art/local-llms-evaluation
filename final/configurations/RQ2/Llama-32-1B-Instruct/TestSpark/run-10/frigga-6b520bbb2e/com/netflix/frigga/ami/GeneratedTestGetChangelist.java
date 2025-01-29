package com.netflix.frigga.ami;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTestGetChangelist {

    @Test
    public void testGetChangelist() {
        String changelist = "test-changelist";
        assertTrue(AppVersion.getAppVersionPattern().matcher(changelist).matches());
        assertFalse(AppVersion.getAppVersionPattern().matcher(changelist + "-unknown").matches());
    }

}