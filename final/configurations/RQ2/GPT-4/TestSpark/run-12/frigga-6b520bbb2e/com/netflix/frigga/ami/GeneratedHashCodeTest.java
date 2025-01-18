package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        AppVersion appVersion = AppVersion.parseName("appName-version-buildJob-buildNumber-commit");
        assertNotNull(appVersion.hashCode());
    }

}