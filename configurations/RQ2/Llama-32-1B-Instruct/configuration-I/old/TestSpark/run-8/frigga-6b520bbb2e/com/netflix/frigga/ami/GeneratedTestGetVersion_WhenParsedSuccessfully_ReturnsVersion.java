package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestGetVersion_WhenParsedSuccessfully_ReturnsVersion {

    @Mock
    private Parser parser;

    @InjectMocks
    private AppVersion appVersion;

    public static String parseName(String amiName) {
        return "test-ami-name";
    }

    @Test
    public void testGetVersion_WhenParsedSuccessfully_ReturnsVersion() {
        when(parser.getAppVersionPattern()).thenReturn(getAppVersionPattern());
        assertEquals(getVersion("test-name"), appVersion.getVersion());
    }

    public static String getBuildJobName(String buildNumber) {
        return "test-build-job-" + buildNumber;
    }

}