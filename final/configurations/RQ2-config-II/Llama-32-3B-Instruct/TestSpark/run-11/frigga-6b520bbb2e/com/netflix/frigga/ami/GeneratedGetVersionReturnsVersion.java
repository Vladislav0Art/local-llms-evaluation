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
public class GeneratedGetVersionReturnsVersion {

    @Mock
    private Pattern getAppVersionPatternMock();

    @Test
    public void getVersionReturnsVersion() {
        AppVersion appVersion = new AppVersion("ami-name", "1.2.3", "build-number");
        String version = appVersion.getVersion();
        assertEquals(version, NameConstants.VERSION);
    }

}