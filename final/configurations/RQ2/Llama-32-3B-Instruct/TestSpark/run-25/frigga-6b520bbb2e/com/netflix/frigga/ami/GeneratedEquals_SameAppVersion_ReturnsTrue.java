package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedEquals_SameAppVersion_ReturnsTrue {

    @Test
    public void equals_SameAppVersion_ReturnsTrue() {
        AppVersion appVersion1 = new AppVersion("1.0-1");
        AppVersion appVersion2 = new AppVersion("1.0-1");
        boolean equalsResult = appVersion1.equals(appVersion2);
        assertTrue(equalsResult);
    }

}