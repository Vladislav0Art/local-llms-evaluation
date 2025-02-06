package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedParseName_InvalidAmiName_ReturnsNull {

    @Test
    public void parseName_InvalidAmiName_ReturnsNull() {
        String amiName = "";
        when(AppVersion.parseName(amiName)).thenReturn(null);
    }

}