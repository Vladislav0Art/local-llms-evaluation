package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParseName_ValidString_ReturnsAppVersion {

    @Test
    public void parseName_ValidString_ReturnsAppVersion() {
        String amiName = "ami-name-1.2.3";
        AppVersion result = AppVersion.parseName(amiName);
        assertNotNull(result);
        assertEquals(amiName, result.toString());
    }

}