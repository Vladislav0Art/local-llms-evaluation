package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestParseName_invalidName_returnNull {

    @Mock
    private Pattern appVersionPattern;

    public static final String AMI_NAME = "subscriberha-1.0.0-586499";
    public static final String PACKAGENAME = "subscriberha";
    public static final String VERSION = "1.0.0";
    public static final String BUILD_NUMBER = "h150";
    public static final String COMMIT_ID = "abc123";

    @Test
    public void testParseName_invalidName_returnNull() {
        AppVersion appVersion = AppVersion.parseName(null);
        assertNull(appVersion);
    }

}