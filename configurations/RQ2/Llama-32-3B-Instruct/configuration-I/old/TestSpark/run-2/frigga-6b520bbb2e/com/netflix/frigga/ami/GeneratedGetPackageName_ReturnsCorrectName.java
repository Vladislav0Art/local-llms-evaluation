package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

public class GeneratedGetPackageName_ReturnsCorrectName {

    @Test
    public void getPackageName_ReturnsCorrectName() {
        AppVersion appVersion = new AppVersion(1, 2, 3);
        assertEquals("com.example", appVersion.getPackageName());
    }

}