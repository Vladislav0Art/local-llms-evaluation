package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedEquals_ObjectWithNullValue_ReturnsFalse {

    @Test
    public void equals_ObjectWithNullValue_ReturnsFalse() {
        AppVersion appVersion = new AppVersion();
        appVersion.setVersion(null);
        assertTrue(appVersion.equals(appVersion));
    }

}