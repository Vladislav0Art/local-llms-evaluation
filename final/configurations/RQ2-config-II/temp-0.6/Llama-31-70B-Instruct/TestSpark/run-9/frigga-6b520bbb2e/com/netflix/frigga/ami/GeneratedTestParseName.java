package com.netflix.frigga.ami;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class GeneratedTestParseName {

    private AppVersion appVersion;

    @BeforeEach
    public void setUp() {
        appVersion = new AppVersion();
    }

    @Test
    public void testParseName() {
        String amiName = "amiName";
        AppVersion expected = Mockito.mock(AppVersion.class);
        when(expected.parseName(amiName)).thenReturn(expected);
        Assertions.assertEquals(expected, appVersion.parseName(amiName));
    }

}