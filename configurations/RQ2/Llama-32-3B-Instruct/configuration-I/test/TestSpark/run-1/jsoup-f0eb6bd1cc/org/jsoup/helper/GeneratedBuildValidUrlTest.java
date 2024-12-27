package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedBuildValidUrlTest {

    @org.junit.Before
    public void setUpMockito() {
        // No need to initialize Mockito here, it's done automatically in the JUnit runner.
    }

    public static class Connection {
        public static class KeyVal {
            private String key;
            private String value;

            public KeyVal(String key, String value) {
                this.key = key;
                this.value = value;
            }
        }
    }

    @Test
    public void buildValidUrlTest() {
        String expectedResult = "https://www.example.com";
        URL inputUrlMock = new URL(expectedResult);
        UrlBuilder urlBuilder = new UrlBuilder(inputUrlMock);
        URL result = urlBuilder.build();
        assertEquals(expectedResult, result.toString());
    }

}