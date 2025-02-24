package com.netflix.frigga.ami;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedParseNameNullTest {

    @Test
    public void parseNameNullTest() {
        AppVersion appVersion = new AppVersion();
        String name = null;
        AppVersion result = appVersion.parseName(name);
        assertNull(result);
    }

}