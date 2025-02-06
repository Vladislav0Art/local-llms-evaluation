package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetPackageName_InvalidVersionThrowException {

    @Test
    public void getPackageName_InvalidVersionThrowException() {
        AppVersion version = new AppVersion("invalid-ami", 12, 34);
        assertThrows(Exception.class, () -> version.getPackageName());
    }

}