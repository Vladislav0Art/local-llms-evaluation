package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetVersion_ValidBuildJobName_ReturnsExpectedVersion {

    @Test
    public void getVersion_ValidBuildJobName_ReturnsExpectedVersion() {
        AppVersion appVersion = new AppVersion("0.9.1-EC2-X86_64-GP2");
        String expectedVersion = "0.9.1";
        assertEquals(expectedVersion, appVersion.getVersion());
    }

}