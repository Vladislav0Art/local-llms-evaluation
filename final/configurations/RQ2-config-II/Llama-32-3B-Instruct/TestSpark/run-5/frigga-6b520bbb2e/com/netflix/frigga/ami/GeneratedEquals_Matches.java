package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedEquals_Matches {

    @Test
    public void equals_Matches() {
        AppVersion app1 = new AppVersion("my-our-app", "1.0");
        AppVersion app2 = new AppVersion("other-app", "0.9");
        assertTrue(app1.equals(app2));
        assertFalse(app1.equals(new Object()));
    }

}