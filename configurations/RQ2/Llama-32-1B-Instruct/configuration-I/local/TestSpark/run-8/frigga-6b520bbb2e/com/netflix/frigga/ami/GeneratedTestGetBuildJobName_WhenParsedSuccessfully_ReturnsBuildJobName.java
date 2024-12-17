package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestGetBuildJobName_WhenParsedSuccessfully_ReturnsBuildJobName {

    @Mock
    private Parser parser;

    @InjectMocks
    private AppVersion appVersion;

    public static String parseName(String amiName) {
        return "test-ami-name";
    }

    @Test
    public void testGetBuildJobName_WhenParsedSuccessfully_ReturnsBuildJobName() {
        when(parser.getAppVersionPattern()).thenReturn(getAppVersionPattern());
        assertEquals(getBuildJobName("12345"), appVersion.getBuildJobName());
    }

    public static String getCommit(String buildNumber) {
        return "test-commit-" + buildNumber;
    }

}