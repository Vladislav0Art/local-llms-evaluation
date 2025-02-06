package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedToString_ReturnsToStringRepresentation {

    @Test
    public void toString_ReturnsToStringRepresentation() {
        AppVersion appVersion = new AppVersion("com.netflix.frigga", "1.0", "1234567890");
        assertEquals("com.netflix.frigga-1.0-1234567890", appVersion.toString());
    }

}