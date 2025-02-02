package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetPackageName_NullAppVersion_ReturnsNull {

    @Test
    public void getPackageName_NullAppVersion_ReturnsNull() {
        // given
        AppVersion appVersion = null;

        // when
        String returnedPackageName = appVersion.getPackageName();

        // then
        assertNull(returnedPackageName);
    }

}