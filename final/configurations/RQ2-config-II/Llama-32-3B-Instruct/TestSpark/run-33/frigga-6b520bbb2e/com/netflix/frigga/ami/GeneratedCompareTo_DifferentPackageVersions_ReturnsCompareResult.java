package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCompareTo_DifferentPackageVersions_ReturnsCompareResult {

    @Mock
    private Pattern pattern;

    @Test
    public void compareTo_DifferentPackageVersions_ReturnsCompareResult() {
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = new AppVersion("different-package");
        assertEquals(-1, appVersion1.compareTo(appVersion2));
    }

}