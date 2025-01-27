package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedEquals_DifferentObjects_ReturnsFalse {

    @Test
    public void equals_DifferentObjects_ReturnsFalse() {
        AppVersion appVersion1 = new AppVersion("1.0-1234567890");
        AppVersion appVersion2 = new AppVersion("1.0-1234567891");
        assertFalse(appVersion1.equals(appVersion2));
    }

}