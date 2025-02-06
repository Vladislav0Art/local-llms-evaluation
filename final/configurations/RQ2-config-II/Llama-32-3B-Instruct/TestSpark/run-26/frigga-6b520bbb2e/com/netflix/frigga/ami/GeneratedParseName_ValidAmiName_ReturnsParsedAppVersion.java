package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedParseName_ValidAmiName_ReturnsParsedAppVersion {

    @Test
    public void parseName_ValidAmiName_ReturnsParsedAppVersion() {
        String amiName = "1.0-1234567890";
        when(AppVersion.parseName(amiName)).thenReturn(new AppVersion("com.netflix.frigga", "1.0", "1234567890"));
    }

}