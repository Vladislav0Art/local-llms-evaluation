package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedParseName_InvalidFormat_ReturnsNull {

    @Test
    public void parseName_InvalidFormat_ReturnsNull() {
        String amiName = "InvalidFormat";
        when(AppVersion.parseName(amiName)).thenReturn(null);
    }

}