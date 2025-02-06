package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetPackageName_SingleWord_ReturnsCorrectlyParsedPackage {

    @Test
    public void getPackageName_SingleWord_ReturnsCorrectlyParsedPackage() {
        String package_ = "aws-app";
        AppVersion appVersion = AppVersion.parseName(package_);
        assertEquals(package_, appVersion.getPackageName());
    }

}