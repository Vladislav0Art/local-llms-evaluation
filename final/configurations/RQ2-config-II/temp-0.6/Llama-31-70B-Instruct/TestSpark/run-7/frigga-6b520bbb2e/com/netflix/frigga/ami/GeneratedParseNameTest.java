package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedParseNameTest {

    @Test
    public void parseNameTest() {
        String validInput = "validInput";
        AppVersion appVersion = new AppVersion();
        AppVersion result = appVersion.parseName(validInput);
        assertNotNull(result);
    }

}