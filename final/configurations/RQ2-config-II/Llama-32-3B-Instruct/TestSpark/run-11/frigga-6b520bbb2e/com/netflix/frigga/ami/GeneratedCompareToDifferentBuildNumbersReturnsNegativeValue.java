package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCompareToDifferentBuildNumbersReturnsNegativeValue {

    @Mock
    private Pattern getAppVersionPatternMock();

    @Test
    public void compareToDifferentBuildNumbersReturnsNegativeValue() {
        AppVersion appVersion1 = new AppVersion("1.2.3", "build-name", "commit-hash");
        AppVersion appVersion2 = new AppVersion("1.2.4", "build-name-2", "commit-hash-2");
        when(getAppVersionPatternMock()).thenReturn(Pattern.compile(".*-([a-zA-Z0-9]+).*"));
        assertEquals(-1, appVersion1.compareTo(appVersion2));
    }

}