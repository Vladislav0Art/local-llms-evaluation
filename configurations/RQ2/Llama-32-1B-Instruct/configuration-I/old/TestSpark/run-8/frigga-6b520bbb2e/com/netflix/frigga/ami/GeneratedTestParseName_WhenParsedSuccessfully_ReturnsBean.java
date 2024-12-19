package com.netflix.frigga.ami;

import org.junit.Test;
import org.mockito.InjectMocks;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestParseName_WhenParsedSuccessfully_ReturnsBean {

    @Mock
    private Parser parser;

    public static String parseName(String amiName) {
        return "test-ami-name";
    }

    @Test
    public void testParseName_WhenParsedSuccessfully_ReturnsBean() {
        Map<String, Object> mockResponse = new HashMap<>();
        mockResponse.put("version", 1);
        mockResponse.put("name", parseName(amiName));
        when(parser.parseName(amiName)).thenReturn(mockResponse);
        assertEquals(parseName(amiName), appVersion);
    }

}