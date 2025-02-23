package com.netflix.frigga.ami;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class GeneratedTestGetVersion {

    private AppVersion appVersion;

    @BeforeEach
    public void setUp() {
        appVersion = new AppVersion();
    }

    @Test
    public void testGetVersion() {
        Assertions.assertNull(appVersion.getVersion());
    }

}