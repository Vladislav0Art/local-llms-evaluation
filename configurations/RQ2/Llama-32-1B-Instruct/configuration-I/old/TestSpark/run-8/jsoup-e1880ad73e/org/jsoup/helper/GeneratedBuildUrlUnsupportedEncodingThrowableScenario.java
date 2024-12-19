package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.util.URLUtils;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedBuildUrlUnsupportedEncodingThrowableScenario {

    @Mock
    private URL url;

    @Test
    public void buildUrlUnsupportedEncodingThrowableScenario() throws UnsupportedEncodingException {
        final String urlString = "https://example.com/path?key=1&value=2";
        when(url.toString()).thenReturn(urlString);
        try {
            new UrlBuilder(new URI(urlString)).build();
            fail("Expected an IOException");
        } catch (IOException e) {
            // expected
        }
    }

}