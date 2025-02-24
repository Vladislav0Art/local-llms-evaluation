package com.netflix.frigga.ami;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedGetVersionTest {

    private AppVersion appVersion;

    @Test
    public void getVersionTest() {
        String expectedVersion = "version";

        String actualVersion = appVersion.getVersion();

        assertEquals(expectedVersion, actualVersion);
    }

}