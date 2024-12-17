package com.netflix.frigga.ami;

import org.junit.Test;
import org.mockito.InjectMocks;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestGetChangelist_WhenParsedSuccessfully_ReturnsChangelist {

    @Mock
    private Parser parser;

    public static String parseName(String amiName) {
        return "test-ami-name";
    }

    @Test
    public void testGetChangelist_WhenParsedSuccessfully_ReturnsChangelist() {
        Map<String, Object> mockResponse = new HashMap<>();
        mockResponse.put("pattern", getAppVersionPattern().toString());
        when(parser.getAppVersionPattern()).thenReturn(mockResponse);
        assertEquals(getChangelist(amiName), appVersion.getChangelist());
    }

}