package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetPackageName_NonEmptyString ReturnsNonEmptyString {

    @Test
    public void getPackageName_NonEmptyString

    ReturnsNonEmptyString() {
        String packageName = "my.package";
        AppVersion result = new AppVersion(packageName);
        assertEquals(packageName, result.getPackageName());
    }

}