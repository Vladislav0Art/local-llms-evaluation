package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

public class GeneratedToString_ReturnsCorrectString {

    @Test
    public void toString_ReturnsCorrectString() {
        AppVersion appVersion = new AppVersion(1, 2, 3);
        assertEquals("ami-12345678901@1.2.3", appVersion.toString());
    }

}