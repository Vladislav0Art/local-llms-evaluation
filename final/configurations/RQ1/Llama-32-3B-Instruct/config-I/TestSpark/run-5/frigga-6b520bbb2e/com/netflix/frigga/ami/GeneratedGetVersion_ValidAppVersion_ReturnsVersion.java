package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetVersion_ValidAppVersion_ReturnsVersion {

    @Test
    public void getVersion_ValidAppVersion_ReturnsVersion() {
        // given
        String version = "1.0.0";
        AppVersion appVersion = new AppVersion(version);

        // when
        String returnedVersion = appVersion.getVersion();

        // then
        assertEquals(version, returnedVersion);
    }

}