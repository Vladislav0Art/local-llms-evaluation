package com.netflix.frigga.ami;

import org.junit.Test;
import org.mockito.InjectMocks;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestGetPackageName_WhenParsedSuccessfully_ReturnsPackageName {

    @Mock
    private Parser parser;

    public static String parseName(String amiName) {
        return "test-ami-name";
    }

    @Test
    public void testGetPackageName_WhenParsedSuccessfully_ReturnsPackageName() {
        Map<String, Object> mockResponse = new HashMap<>();
        mockResponse.put("pattern", getAppVersionPattern().toString());
        when(parser.getAppVersionPattern()).thenReturn(mockResponse);
        assertEquals(getPackageName(amiName), appVersion.getPackageName());
    }

    public static String getCommit(String buildNumber) {
        return "test-commit-" + buildNumber;
    }

}