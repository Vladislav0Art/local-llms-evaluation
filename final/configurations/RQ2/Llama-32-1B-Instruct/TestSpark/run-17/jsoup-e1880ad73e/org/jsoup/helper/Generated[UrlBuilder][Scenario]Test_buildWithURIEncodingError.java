package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Generated[UrlBuilder][Scenario]

Test_buildWithURIEncodingError {

    @Test
    public void [UrlBuilder][Scenario]Test_buildWithURIEncodingError() {
        URL url = new URL("https://example.com/path?utf-8= invalid");
        StringBuilder expected = new StringBuilder();
        UrlBuilder builder = new UrlBuilder(url);
        try {
            builder.build(expected.toString());
            fail("Expected URISyntaxException: java.net.URISyntaxException: invalid scheme or protocol to match: 'invalid'");
        } catch (URISyntaxException e) {
            // Expected
        }
    }

}