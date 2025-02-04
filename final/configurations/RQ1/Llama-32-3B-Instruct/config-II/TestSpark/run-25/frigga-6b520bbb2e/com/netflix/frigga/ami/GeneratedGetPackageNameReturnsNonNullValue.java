package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetPackageNameReturnsNonNullValue {

    @Test
    public void getPackageNameReturnsNonNullValue() {
        AppVersion parsed = AppVersion.parseName("subscriberha-1.0.0-586499");
        assertNotNull(parsed.packageName);
    }

}