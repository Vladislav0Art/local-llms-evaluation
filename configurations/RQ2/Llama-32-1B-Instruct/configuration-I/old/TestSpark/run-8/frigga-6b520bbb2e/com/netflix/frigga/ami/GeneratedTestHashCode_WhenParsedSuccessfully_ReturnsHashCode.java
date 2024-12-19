package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestHashCode_WhenParsedSuccessfully_ReturnsHashCode {

    @Mock
    private Parser parser;

    @InjectMocks
    private AppVersion appVersion;

    public static String parseName(String amiName) {
        return "test-ami-name";
    }

    @Test
    public void testHashCode_WhenParsedSuccessfully_ReturnsHashCode() {
        Map<String, Object> mockResponse = new HashMap<>();
        mockResponse.put("pattern", getAppVersionPattern().toString());
        when(parser.getAppVersionPattern()).thenReturn(mockResponse);
        assertEquals(appVersion.hashCode(), AppVersion.class.hashCode());
    }

}