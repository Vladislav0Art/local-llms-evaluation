package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParseName_ValidString_ReturnsAppVersion {

    @Test
    public void parseName_ValidString_ReturnsAppVersion() {
        String amiName = "ami-123456789012";
        AppVersion result = AppVersion.parseName(amiName);
        assertNotNull(result);
    }

}