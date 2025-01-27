package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedEquals_DifferentAppVersions_ReturnsFalse {

    @Test
    public void equals_DifferentAppVersions_ReturnsFalse() {
        AppVersion appVersion1 = new AppVersion("1.0-1");
        AppVersion appVersion2 = new AppVersion("1.1-2");
        boolean equalsResult = appVersion1.equals(appVersion2);
        assertFalse(equalsResult);
    }

}