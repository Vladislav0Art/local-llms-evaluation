package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

import com.netflix.frigga.ami.AppVersion;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        AppVersion appVersion1 = AppVersion.parseName("app-version");
        AppVersion appVersion2 = AppVersion.parseName("app-version");
        assertTrue(appVersion1.equals(appVersion2));
    }

}