package org.jsoup.helper;

import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.net.URI;

public class Generated[MethodUnderTest][Scenario]

Test_build {

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
    public void [MethodUnderTest][Scenario]Test_build() throws UnsupportedEncodingException, MalformedURLException {
        URL inputUrl = new URI("https://example.com");
        UrlBuilder urlBuilder = new MockUrl(inputUrl);
        assertEquals(inputUrl, urlBuilder.build());
    }

}