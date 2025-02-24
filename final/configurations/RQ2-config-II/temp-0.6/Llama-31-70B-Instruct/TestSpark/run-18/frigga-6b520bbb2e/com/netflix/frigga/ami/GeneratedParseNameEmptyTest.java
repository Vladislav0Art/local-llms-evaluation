package com.netflix.frigga.ami;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedParseNameEmptyTest {

    @Test
    public void parseNameEmptyTest() {
        AppVersion appVersion = new AppVersion();
        String name = "";
        AppVersion result = appVersion.parseName(name);
        assertNotNull(result);
    }

}