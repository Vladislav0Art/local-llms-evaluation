package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedEquals_SameVersion {

    @Test
    public void equals_SameVersion() {
        AppVersion appVersion1 = new AppVersion("1.0.0");
        AppVersion appVersion2 = new AppVersion("1.0.0");
        assertTrue(appVersion1.equals(appVersion2));
    }

}