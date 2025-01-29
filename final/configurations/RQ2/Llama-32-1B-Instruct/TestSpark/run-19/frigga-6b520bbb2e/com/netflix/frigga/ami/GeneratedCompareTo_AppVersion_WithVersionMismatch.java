package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCompareTo_AppVersion_WithVersionMismatch {

    @Mock
    private PackageManager mockPackageManager;

    @InjectMocks
    private AppVersion appVersion;

    @Test
    public void compareTo_AppVersion_WithVersionMismatch() {
        String[] packageList = {"ami-name1"};
        Mockito.when(mockPackageManager.getPackageList()).thenReturn(packageList);

        int result = appVersion.compareTo(appVersion);
        assertEquals(-1, result);

        Mockito.reset(mockPackageManager);
    }

}