package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedToString_ReturnsToStringRepresentation {

    @Test
    public void toString_ReturnsToStringRepresentation() {
        AppVersion appVersion = new AppVersion("test-version-1", "build-job-name-1", 1234567890L, "abcdefg");
        String expectedString = "test-version-1 (build-job-name-1) [build number: 1234567890] [commit hash: abcdefg]";
        assertEquals(expectedString, appVersion.toString());
    }

}