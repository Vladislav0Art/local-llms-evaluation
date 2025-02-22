package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import com.netflix.frigga.ami.AppVersion;

public class GeneratedTestGetVersion {

    @Test
    public void testGetVersion() {
        AppVersion appVersion = new AppVersion();
        String version = "1.0.0";
        appVersion.version = version;
        String resultVersion = appVersion.getVersion();
        assertEquals(version, resultVersion);
    }

}