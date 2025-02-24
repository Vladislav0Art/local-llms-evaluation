package com.netflix.frigga.ami;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedParseNameTest {

    @Test
    public void parseNameTest() {
        AppVersion appVersion = new AppVersion();
        String amiName = "amiName";
        AppVersion expectedAppVersion = new AppVersion();
        when(appVersion.parseName(amiName)).thenReturn(expectedAppVersion);
        AppVersion actualAppVersion = appVersion.parseName(amiName);
        assertEquals(expectedAppVersion, actualAppVersion);
    }

}