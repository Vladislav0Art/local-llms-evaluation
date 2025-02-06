package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedEquals_DifferentVersion {

    @Test
    public void equals_DifferentVersion() {
        AppVersion appVersion1 = new AppVersion("1.0.0");
        AppVersion appVersion2 = new AppVersion("1.0.1");
        assertFalse(appVersion1.equals(appVersion2));
    }

}