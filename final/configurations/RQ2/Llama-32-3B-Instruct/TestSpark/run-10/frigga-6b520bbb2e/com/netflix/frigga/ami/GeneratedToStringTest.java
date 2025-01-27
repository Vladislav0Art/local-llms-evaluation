package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.netflix.frigga.NameConstants;
import com.netflix.frigga.ami.AppVersion;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        AppVersion appVersion = new AppVersion("1.9.2", "build-1.9.2", "commit-1");
        assertNotNull(appVersion.toString());
        assertTrue(appVersion.toString().contains("build-1.9.2"));
        assertTrue(appVersion.toString().contains("commit-1"));
    }

}