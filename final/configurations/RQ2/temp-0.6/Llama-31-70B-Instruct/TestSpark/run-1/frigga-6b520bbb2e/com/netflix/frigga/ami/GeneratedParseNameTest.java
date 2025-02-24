package com.netflix.frigga.ami;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedParseNameTest {

    private AppVersion appVersion;

    @Test
    public void parseNameTest() {
        String amiName = "ami-name";
        AppVersion expectedAppVersion = new AppVersion();

        AppVersion actualAppVersion = AppVersion.parseName(amiName);

        assertEquals(expectedAppVersion, actualAppVersion);
    }

}