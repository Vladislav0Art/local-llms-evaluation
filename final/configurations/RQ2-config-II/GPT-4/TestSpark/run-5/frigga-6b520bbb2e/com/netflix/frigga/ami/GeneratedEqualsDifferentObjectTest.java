package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

public class GeneratedEqualsDifferentObjectTest {

    @Test
    public void equalsDifferentObjectTest() {
        AppVersion version1 = AppVersion.parseName("app-1.0.0-h0.78cf3b2");
        AppVersion version2 = AppVersion.parseName("app-2.0.0-h0.89df4c3");
        assertFalse(version1.equals(version2));
    }

}