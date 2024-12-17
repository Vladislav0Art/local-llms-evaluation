package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.helper.URLBuilder;
import org.jsoup.util.URLUtils;

public class GeneratedBuildUrlEmptyUrlThrowableScenario {

    @Mock
    private URL url;

    @Test
    public void buildUrlEmptyUrlThrowableScenario() throws UnsupportedEncodingException {
        final String urlString = "";
        when(url.toString()).thenReturn(urlString);
        try {
            new UrlBuilder(null).build();
            fail("Expected an IOException");
        } catch (IOException e) {
            // expected
        }
    }

}