package com.netflix.frigga.ami;

import org.junit.Test;
import org.mockito.InjectMocks;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestGetCommit_WhenParsedSuccessfully_ReturnsCommit {

    @Mock
    private Parser parser;

    public static String parseName(String amiName) {
        return "test-ami-name";
    }

    @Test
    public void testGetCommit_WhenParsedSuccessfully_ReturnsCommit() {
        Map<String, Object> mockResponse = new HashMap<>();
        mockResponse.put("pattern", getAppVersionPattern().toString());
        when(parser.getAppVersionPattern()).thenReturn(mockResponse);
        assertEquals(getCommit(amiName), appVersion.getCommit());
    }

    public static String getChangelist(String buildNumber) {
        return "test-changelist-" + buildNumber;
    }

}