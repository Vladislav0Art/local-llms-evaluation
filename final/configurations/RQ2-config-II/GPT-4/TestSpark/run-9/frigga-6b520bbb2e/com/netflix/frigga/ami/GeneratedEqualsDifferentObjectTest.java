package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEqualsDifferentObjectTest {

    @Test
    public void equalsDifferentObjectTest() {
        AppVersion appVersion1 = AppVersion.parseName("test-ami-0.0.1-build01-g123abc");
        AppVersion appVersion2 = AppVersion.parseName("test-ami-0.0.1-build02-g123abc");
        assertFalse(appVersion1.equals(appVersion2));
    }

}