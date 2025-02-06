package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedHashCode_ReturnsHashcode {

    @Test
    public void hashCode_ReturnsHashcode() {
        AppVersion appVersion = new AppVersion("com.netflix.frigga", "1.0", "1234567890");
        assertEquals(23, appVersion.hashCode());
    }

}