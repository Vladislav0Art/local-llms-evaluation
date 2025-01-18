package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

import com.netflix.frigga.ami.AppVersion;

public class GeneratedEqualsFalseTest {

    @Test
    public void equalsFalseTest() {
        AppVersion appVersion1 = AppVersion.parseName("app-version1");
        AppVersion appVersion2 = AppVersion.parseName("app-version2");
        assertFalse(appVersion1.equals(appVersion2));
    }

}