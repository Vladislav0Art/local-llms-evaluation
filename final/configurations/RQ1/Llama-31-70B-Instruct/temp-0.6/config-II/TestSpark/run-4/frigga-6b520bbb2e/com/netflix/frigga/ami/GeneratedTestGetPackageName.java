package com.netflix.frigga.ami;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.regex.Pattern;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedTestGetPackageName {

    @Mock
    private AppVersion appVersion;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetPackageName() {
        AppVersion appVersion1 = new AppVersion();
        String packageName = appVersion1.getPackageName();
        assertNotNull(packageName);
    }

}