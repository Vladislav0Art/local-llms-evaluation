package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.helper.URLBuilder;
import org.jsoup.util.URLUtils;

public class GeneratedBuildUrlThrowableScenario {

    @Mock
    private URL url;

    @Test
    public void buildUrlThrowableScenario() throws UnsupportedEncodingException {
        final String urlString = "https://example.com/path?key=1&value=2";
        when(url.toString()).thenReturn(urlString);
        try {
            new UrlBuilder(null).build();
            fail("Expected an IOException");
        } catch (IOException e) {
            // expected
        }
    }

}