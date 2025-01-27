package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.mockito.Mockito;

public class GeneratedEquals_SelfAndOtherSameObject_ReturnsTrue {

    @Test
    public void equals_SelfAndOtherSameObject_ReturnsTrue() {
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = new AppVersion();
        assertTrue(appVersion1.equals(appVersion2));
    }

}