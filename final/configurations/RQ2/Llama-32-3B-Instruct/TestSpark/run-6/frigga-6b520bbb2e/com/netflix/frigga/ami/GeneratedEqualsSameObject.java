package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedEqualsSameObject {

    @Test
    public void equalsSameObject() {
        AppVersion appVersion1 = AppVersion.parseName("amarth-1234567890");
        assertEquals(appVersion1, appVersion1);
    }

}