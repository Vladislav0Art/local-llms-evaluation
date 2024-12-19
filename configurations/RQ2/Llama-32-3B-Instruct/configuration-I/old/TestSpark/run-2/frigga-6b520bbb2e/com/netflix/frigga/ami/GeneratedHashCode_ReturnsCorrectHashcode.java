package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

public class GeneratedHashCode_ReturnsCorrectHashcode {

    @Test
    public void hashCode_ReturnsCorrectHashcode() {
        AppVersion appVersion = new AppVersion(1, 2, 3);
        assertTrue(appVersion.hashCode() == 12345);
    }

}