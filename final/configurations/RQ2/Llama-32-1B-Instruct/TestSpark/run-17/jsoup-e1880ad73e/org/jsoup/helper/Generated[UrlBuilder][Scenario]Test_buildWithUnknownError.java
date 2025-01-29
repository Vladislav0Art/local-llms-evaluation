package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Generated[UrlBuilder][Scenario]

Test_buildWithUnknownError {

    @Test
    public void [UrlBuilder][Scenario]Test_buildWithUnknownError() {
        URL url = new URL("https://example.com/path?unknown= error");
        StringBuilder expected = new StringBuilder();
        UrlBuilder builder = new UrlBuilder(url);
        try {
            builder.build(expected.toString());
            fail("Expected UnknownIOException: unknown error");
        } catch (UnknownIOException e) {
            // Expected
        }
    }

}