package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedParseNameTest {

    @Test
    public void parseNameTest() {
        AppVersion appVersion = new AppVersion();
        String amiName = "test";
        AppVersion result = appVersion.parseName(amiName);
        assertNotNull(result);
    }

}