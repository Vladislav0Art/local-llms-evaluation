package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

public class GeneratedGetVersion_ReturnsCorrectString {

    @Test
    public void getVersion_ReturnsCorrectString() {
        AppVersion appVersion = new AppVersion(1, 2, 3);
        assertEquals("1.2.3", appVersion.getVersion());
    }

}