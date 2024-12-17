package com.netflix.frigga.ami;

import org.junit.Test;
import org.mockito.InjectMocks;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestAppVersionPattern_WhenParsedSuccessfully_ReturnsPattern {

    @Mock
    private Parser parser;

    public static String parseName(String amiName) {
        return "test-ami-name";
    }

    @Test
    public void testAppVersionPattern_WhenParsedSuccessfully_ReturnsPattern() {
        Map<String, Object> mockResponse = new HashMap<>();
        mockResponse.put("pattern", getAppVersionPattern().toString());
        when(parser.getAppVersionPattern()).thenReturn(mockResponse);
        assertEquals(getAppVersionPattern(), appVersion.getPackageName().getVersion());
    }

    public static String getPackageName(String name) {
        return "test-package-" + name;
    }

}