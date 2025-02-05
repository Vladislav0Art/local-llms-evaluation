package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEqualsSameObjectTest {

    @Test
    public void equalsSameObjectTest() {
        AppVersion appVersion = AppVersion.parseName("test-ami-0.0.1-build01-g123abc");
        assertTrue(appVersion.equals(appVersion));
    }

}