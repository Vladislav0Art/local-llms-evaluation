package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCompareVersions_DifferentBuildNumbers_ReturnsNegativeInt {

    @Mock
    private Pattern getAppVersionPattern();

    @Mock
    private NameConstants NameConstants;

    @Test
    public void compareVersions_DifferentBuildNumbers_ReturnsNegativeInt() {
        AppVersion appVersion1 = new AppVersion("test", "123");
        AppVersion appVersion2 = new AppVersion("test", "456");
        int result = appVersion1.compareTo(appVersion2);
        assertTrue(result < 0);
    }

}