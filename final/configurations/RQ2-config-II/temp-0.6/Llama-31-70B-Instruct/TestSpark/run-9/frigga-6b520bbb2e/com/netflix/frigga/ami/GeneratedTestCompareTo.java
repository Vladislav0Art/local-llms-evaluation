package com.netflix.frigga.ami;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class GeneratedTestCompareTo {

    private AppVersion appVersion;

    @BeforeEach
    public void setUp() {
        appVersion = new AppVersion();
    }

    @Test
    public void testCompareTo() {
        AppVersion other = Mockito.mock(AppVersion.class);
        when(other.compareTo(appVersion)).thenReturn(0);
        Assertions.assertEquals(0, appVersion.compareTo(other));
    }

}