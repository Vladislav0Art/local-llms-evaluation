package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedCompareVersions_Lower {

    @Test
    public void compareVersions_Lower() {
        AppVersion app1 = new AppVersion("my-our-app", "1.0");
        AppVersion app2 = new AppVersion("other-app", "0.9");
        assertEquals(-1, app1.compareTo(app2));
    }

}