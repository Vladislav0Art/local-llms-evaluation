package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedEquals_DifferentAppVersion_ReturnsFalse {

    @Test
    public void equals_DifferentAppVersion_ReturnsFalse() {
        AppVersion first = new AppVersion("test-version-1", "build-job-name-1", 1234567890L, "abcdefg");
        AppVersion second = new AppVersion("test-version-2", "build-job-name-2", 1234567891L, "abcdefh");
        assertFalse(first.equals(second));
    }

}