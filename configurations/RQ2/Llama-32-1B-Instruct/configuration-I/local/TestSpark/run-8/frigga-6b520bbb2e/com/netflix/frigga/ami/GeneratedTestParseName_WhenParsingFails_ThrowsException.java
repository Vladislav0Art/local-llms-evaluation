package com.netflix.frigga.ami;

import org.junit.Test;
import org.mockito.InjectMocks;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestParseName_WhenParsingFails_ThrowsException {

    @Mock
    private Parser parser;

    public static String parseName(String amiName) {
        return "test-ami-name";
    }

    @Test
    public void testParseName_WhenParsingFails_ThrowsException() {
        Map<String, Object> mockResponse = new HashMap<>();
        mockResponse.put("version", 1);
        mockResponse.put("name", "invalid-ami-name");
        when(parser.parseName(amiName)).thenThrow(new IllegalArgumentException(mockResponse));
        try {
            appVersion = (AppVersion) parser.parseName(amiName);
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "Invalid AMI name: invalid-ami-name", e.getMessage());
        }
    }

    public static Pattern getAppVersionPattern() {
        return Pattern.compile("version=(\\d+)\\.(\\d+)");
    }

}