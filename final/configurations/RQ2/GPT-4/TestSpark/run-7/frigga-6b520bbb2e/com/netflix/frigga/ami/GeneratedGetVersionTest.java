package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;

public class GeneratedGetVersionTest {

    @Test
    public void getVersionTest() {
        String version = "testVersion";
        AppVersion appVersion = AppVersion.parseName(version);
        assertEquals(version, appVersion.getVersion());
    }

}