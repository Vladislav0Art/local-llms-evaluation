package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        AppVersion appVersion = AppVersion.parseName("test-ami-0.0.1-build01-g123abc");
        assertEquals(appVersion.hashCode(), appVersion.hashCode());
    }

}