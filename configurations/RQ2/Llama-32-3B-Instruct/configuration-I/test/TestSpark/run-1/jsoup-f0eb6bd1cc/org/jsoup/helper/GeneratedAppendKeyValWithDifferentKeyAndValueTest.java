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

public class GeneratedAppendKeyValWithDifferentKeyAndValueTest {

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
    public void appendKeyValWithDifferentKeyAndValueTest() {
        String expectedResult = "https://www.example.com?key=value1&key2=value2";
        URL inputUrlMock = new URL(expectedResult);
        UrlBuilder urlBuilder = new UrlBuilder(inputUrlMock);
        urlBuilder.appendKeyVal(new Connection.KeyVal("key1", "value1"));
        urlBuilder.appendKeyVal(new Connection.KeyVal("key2", "value2"));
        String result = urlBuilder.build().toString();
        assertEquals(expectedResult, result);
    }
}

public class UrlBuilder {
    private URL inputUrl;

    public UrlBuilder(URL inputUrl) {
        this.inputUrl = inputUrl;
    }

    public void appendKeyVal(Connection.KeyVal keyVal) throws UnsupportedEncodingException {
        // Implement your logic here.
    }

    public URL build() {
        // Implement your logic here to create a new URL with the appended key-value pairs.
        return null; // Temporary implementation, replace with actual logic.
    }

}