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
public class GeneratedGetPackageName ReturnsExpectedPackage {

    @Mock
    private Pattern pattern;

    @Test
    public void getPackageName

    ReturnsExpectedPackage() {
        String packageName = "test-package";
        AppVersion appVersion = new AppVersion(packageName);
        assertEquals(packageName, appVersion.getPackageName());
    }

}