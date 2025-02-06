package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedCompareVersionsEqual {

    @Test
    public void compareVersionsEqual() {
        AppVersion app1 = new AppVersion("my-our-app", "1.0");
        AppVersion app2 = new AppVersion("other-app", "1.0");
        assertEquals(0, app1.compareTo(app2));
    }

}