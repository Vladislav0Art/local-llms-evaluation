package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedHashCode_ReturnsValidHashcode {

    @Test
    public void hashCode_ReturnsValidHashcode() {
        AppVersion appVersion = new AppVersion("test-version-1", "build-job-name-1", 1234567890L, "abcdefg");
        int hashCode = appVersion.hashCode();
        assertNotNull(hashCode);
    }

}