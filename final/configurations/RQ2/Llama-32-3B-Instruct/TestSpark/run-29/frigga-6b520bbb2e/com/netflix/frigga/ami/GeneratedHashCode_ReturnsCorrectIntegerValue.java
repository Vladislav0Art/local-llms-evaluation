package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.mockito.Mockito;

public class GeneratedHashCode_ReturnsCorrectIntegerValue {

    @Test
    public void hashCode_ReturnsCorrectIntegerValue() {
        int expectedHashCode = 5;
        AppVersion appVersion = new AppVersion();
        assertEquals(expectedHashCode, appVersion.hashCode());
    }

}