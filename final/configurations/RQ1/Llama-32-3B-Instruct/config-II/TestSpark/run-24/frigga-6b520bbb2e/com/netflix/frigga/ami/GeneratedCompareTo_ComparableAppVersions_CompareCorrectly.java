package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCompareTo_ComparableAppVersions_CompareCorrectly {

    @InjectMocks
    private AppVersion appVersion;

    @Mock
    private Pattern appVersionPattern;

    @Test
    public void compareTo_ComparableAppVersions_CompareCorrectly() {
        AppVersion appVersion1 = new AppVersion();
        appVersion1.packageName = "a";
        appVersion1.version = "b";

        AppVersion appVersion2 = new AppVersion();
        appVersion2.packageName = "c";
        appVersion2.version = "d";

        assertEquals(0, appVersion.compareTo(appVersion1));
        assertEquals(-1, appVersion.compareTo(appVersion2));
    }

}