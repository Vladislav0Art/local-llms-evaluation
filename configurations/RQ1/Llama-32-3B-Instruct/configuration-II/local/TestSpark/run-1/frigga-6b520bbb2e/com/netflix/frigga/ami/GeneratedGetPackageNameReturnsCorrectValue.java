package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.*;

@RunWith(PowerMockRunner.class)
public class GeneratedGetPackageNameReturnsCorrectValue {

    @Mock
    private NameConstants.Name_HYPHEN_CHARS;

    @InjectMocks
    private AppVersion appVersion;

    @Test
    public void getPackageNameReturnsCorrectValue() {
        when(appVersion.getPackageName()).thenReturn("correct-value");
        assertEquals("correct-value", appVersion.getPackageName());
    }

}