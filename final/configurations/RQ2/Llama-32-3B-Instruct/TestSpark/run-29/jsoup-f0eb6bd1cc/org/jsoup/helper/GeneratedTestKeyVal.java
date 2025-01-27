package org.jsoup.helper;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedTestKeyVal {

    private String baseUrl;

    public UrlBuilder(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String build() {
        return "https://www.example.com";
    }
}

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class UrlBuilderTest {

    @Mock
    private Connection connection;

    @Mock
    private String baseUrl;

    public static class KeyVal {
        private String key;
        private String value;

        public KeyVal(String key, String value) {
            this.key = key;
            this.value = value;
        }

        // Add your implementation here
    }

    public UrlBuilderTest() {
    }

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testKeyVal() {
        KeyVal keyVal = new KeyVal("key", "value");
        // Add your implementation here
    }

}