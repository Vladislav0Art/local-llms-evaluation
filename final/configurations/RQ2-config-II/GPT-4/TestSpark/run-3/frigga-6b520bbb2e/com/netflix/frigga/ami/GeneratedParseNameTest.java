package com.netflix.frigga.ami;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedParseNameTest {

    @Test
    public void parseNameTest() {
        AppVersion result = AppVersion.parseName("testAmiName");
        assertNotNull(result);
    }

}