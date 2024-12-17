package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestToString_WhenParsedSuccessfully_ReturnsString {

    @Mock
    private Parser parser;

    @InjectMocks
    private AppVersion appVersion;

    public static String parseName(String amiName) {
        return "test-ami-name";
    }

    @Test
    public void testToString_WhenParsedSuccessfully_ReturnsString() {
        Map<String, Object> mockResponse = new HashMap<>();
        mockResponse.put("pattern", getAppVersionPattern().toString());
        when(parser.getAppVersionPattern()).thenReturn(mockResponse);
        assertEquals(appVersion.toString(), "test-package-1.2");
    }

}