package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetVersionTest {

    @Test
    public void getVersionTest() {
        AppVersion appVersion = AppVersion.parseName("amiName");
        assertEquals("version", appVersion.getVersion());
    }

}