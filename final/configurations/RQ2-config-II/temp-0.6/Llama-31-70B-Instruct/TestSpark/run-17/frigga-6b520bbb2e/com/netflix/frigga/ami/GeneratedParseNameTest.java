package com.netflix.frigga.ami;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

public class GeneratedParseNameTest {

    @Test
    public void parseNameTest() {
        String amiName = "ami-name-to-parse";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertEquals(amiName, appVersion.getName());
    }

}