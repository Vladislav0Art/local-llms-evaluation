package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetPackageName_ReturnsExpectedValue {

    @Test
    public void getPackageName_ReturnsExpectedValue() {
        String packageName = AppVersion.getPackageName();
        assertNotNull(packageName);
    }

}