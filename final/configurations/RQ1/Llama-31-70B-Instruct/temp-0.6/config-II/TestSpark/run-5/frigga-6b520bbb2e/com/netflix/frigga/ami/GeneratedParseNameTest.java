package com.netflix.frigga.ami;

import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParseNameTest {

    @Test
    public void parseNameTest() {
        String amiName = "";
        AppVersion result = AppVersion.parseName(amiName);
        assertNull(result);
    }

}