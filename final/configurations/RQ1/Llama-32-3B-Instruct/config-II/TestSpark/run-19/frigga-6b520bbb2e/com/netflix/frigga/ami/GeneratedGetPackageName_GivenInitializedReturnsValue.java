package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashMap;
import java.util.Map;

public class GeneratedGetPackageName_GivenInitializedReturnsValue {

    @Test
    public void getPackageName_GivenInitializedReturnsValue() {
        AppVersion appVersion = new AppVersion();
        appVersion.setPackageName("test");
        assertEquals("test", appVersion.getPackageName());
    }

}