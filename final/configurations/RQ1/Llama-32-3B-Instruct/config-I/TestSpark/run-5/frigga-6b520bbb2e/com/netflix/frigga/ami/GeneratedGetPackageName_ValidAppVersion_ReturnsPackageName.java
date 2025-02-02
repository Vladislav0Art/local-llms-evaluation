package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetPackageName_ValidAppVersion_ReturnsPackageName {

    @Test
    public void getPackageName_ValidAppVersion_ReturnsPackageName() {
        // given
        String packageName = "subscriberha";
        AppVersion appVersion = new AppVersion(packageName);

        // when
        String returnedPackageName = appVersion.getPackageName();

        // then
        assertEquals(packageName, returnedPackageName);
    }

}