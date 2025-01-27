package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedHashCode_ValidAppVersion_ReturnsHashcode {

    @Test
    public void hashCode_ValidAppVersion_ReturnsHashcode() {
        AppVersion appVersion = new AppVersion("1.0-1");
        int hashcode = appVersion.hashCode();
        assertTrue(hashcode > 0);
    }

}