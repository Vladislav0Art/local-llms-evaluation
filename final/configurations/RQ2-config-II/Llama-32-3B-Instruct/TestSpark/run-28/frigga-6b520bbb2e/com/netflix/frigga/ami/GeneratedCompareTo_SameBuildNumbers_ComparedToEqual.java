package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;
import java.lang.reflect.Method;

public class GeneratedCompareTo_SameBuildNumbers_ComparedToEqual {

    @Test
    public void compareTo_SameBuildNumbers_ComparedToEqual() {
        AppVersion appVersion1 = AppVersion.parseName("2.0-ami-1234567890");
        AppVersion appVersion2 = AppVersion.parseName("2.0-ami-1234567890");
        assertEquals(0, appVersion1.compareTo(appVersion2));
    }

}