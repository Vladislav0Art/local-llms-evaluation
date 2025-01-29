package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Generated[UrlBuilder][Scenario]

Test_buildWithMalformedUrl {

    @Test
    public void [UrlBuilder][Scenario]Test_buildWithMalformedUrl() {
        URL url = new URL("https://example.com/path?invalid");
        StringBuilder expected = new StringBuilder();
        UrlBuilder builder = new UrlBuilder(url);
        try {
            builder.build(expected.toString());
            fail("Expected MalformedURLException: java.net.MalformedURLException: protocol 'invalid'");
        } catch (MalformedURLException e) {
            // Expected
        }
    }

}