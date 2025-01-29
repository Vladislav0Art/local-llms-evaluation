package org.jsoup.helper;

import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.net.URI;

public class Generated[MethodUnderTest][Scenario]

TestAppendUrlKeyValMultiple {

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
    public void [MethodUnderTest][Scenario]TestAppendUrlKeyValMultiple() throws
    MalformedURLException, UnsupportedEncodingException {
        UrlBuilder urlBuilder = new MockUrl(new URI("https://example.com"));
        assertEquals(null, urlBuilder.appendKeyVal(java.util.Map.of(
                "key", "value",
                "anotherKey", "anotherValue"
        )));

        Map<String, String> kv1 = java.util.Map.of(
                "key", "value1",
                "key2", "value2"
        );
        Map<String, String> kv2 = java.util.Map.of(
                "key3", "value3",
                "key4", "value4"
        );
        urlBuilder.appendKeyVal(kv1);
        urlBuilder.appendKeyVal(kv2);

        assertEquals(kv1, DataUtil.getObjectValue(urlBuilder.build().toUri()));
    }

}