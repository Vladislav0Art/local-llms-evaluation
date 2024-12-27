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

public class GeneratedAppendKeyValueWithMultipleValuesTest {

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
    public void appendKeyValueWithMultipleValuesTest() {
        String expectedResult = "https://www.example.com?key=value1&key=value2";
        URL inputUrlMock = new URL(expectedResult);
        UrlBuilder urlBuilder = new UrlBuilder(inputUrlMock);
        urlBuilder.appendKeyVal(new Connection.KeyVal("key1", "value1"));
        urlBuilder.appendKeyVal(new Connection.KeyVal("key2", "value2"));
        String result = urlBuilder.build().toString();
        assertEquals(expectedResult, result);
    }

}