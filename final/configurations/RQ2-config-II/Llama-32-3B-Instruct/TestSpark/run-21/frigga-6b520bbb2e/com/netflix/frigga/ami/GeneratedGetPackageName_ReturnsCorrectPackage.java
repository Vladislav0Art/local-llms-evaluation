package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetPackageName_ReturnsCorrectPackage {

    @Test
    public void getPackageName_ReturnsCorrectPackage() {
        String packageName = AppVersion.getPackageName();
        assertNotNull(packageName);
        assertEquals(NameConstants.PACKAGE_NAME, packageName);
    }

}