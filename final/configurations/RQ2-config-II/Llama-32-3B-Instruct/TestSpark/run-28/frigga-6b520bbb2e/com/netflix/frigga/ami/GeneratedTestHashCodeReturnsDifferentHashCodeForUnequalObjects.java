package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;
import java.lang.reflect.Method;

public class GeneratedTestHashCodeReturnsDifferentHashCodeForUnequalObjects {

    @Test
    public void testHashCodeReturnsDifferentHashCodeForUnequalObjects() {
        AppVersion appVersion1 = AppVersion.parseName("1.0-ami-1234567890");
        AppVersion appVersion2 = AppVersion.parseName("2.0-ami-1234567890");
        assertNotEquals(appVersion1.hashCode(), appVersion2.hashCode());
    }

}