package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;
import java.util.HashMap;
import java.util.Map;

public class GeneratedGetBuildNumber_ValidInput_ReturnsBuildNumber {

    @Test
    public void getBuildNumber_ValidInput_ReturnsBuildNumber() {
        String amiName = "build-number-12345";
        String buildNumber = "build-number-12345";
        assertEquals(buildNumber, new AppVersion(amiName).getBuildNumber());
    }

}