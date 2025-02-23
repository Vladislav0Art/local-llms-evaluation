package com.netflix.frigga.ami;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class GeneratedTestGetPackageName {

    private AppVersion appVersion;

    @BeforeEach
    public void setUp() {
        appVersion = new AppVersion();
    }

    @Test
    public void testGetPackageName() {
        Assertions.assertNull(appVersion.getPackageName());
    }

}