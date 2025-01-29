package org.jsoup.helper;

import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.net.URI;

public class Generated[MethodUnderTest][Scenario]

Test_appendUrlKeyVal {

    public static class MockUrl {
        private final URI uri;

        public MockUrl(URI uri) {
            this.uri = uri;
        }

        @Override
        public String toString() {
            return uri.toString();
        }
    }

    @Test
    public void [MethodUnderTest][Scenario]Test_appendUrlKeyVal() throws
    MalformedURLException, UnsupportedEncodingException {
        UrlBuilder urlBuilder = new MockUrl(new URI("https://example.com"));
        assertEquals(null, urlBuilder.appendKeyVal(new java.util.Map<java.net.URL.Key, java.lang.Object>() {{
            put("key", "value");
        }}));
    }

}