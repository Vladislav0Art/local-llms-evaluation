package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedEquals_SameAppVersion_ReturnsTrue {

    @Test
    public void equals_SameAppVersion_ReturnsTrue() {
        AppVersion first = new AppVersion("test-version-1", "build-job-name-1", 1234567890L, "abcdefg");
        AppVersion second = new AppVersion("test-version-1", "build-job-name-1", 1234567890L, "abcdefg");
        assertTrue(first.equals(second));
    }

}