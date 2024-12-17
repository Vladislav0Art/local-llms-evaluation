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

public class GeneratedUrlBuilderEmptyUrlThrowableScenario {

    @Mock
    private URL url;

    @Test
    public void UrlBuilderEmptyUrlThrowableScenario() throws UnsupportedEncodingException {
        final String urlString = "";
        when(url.toString()).thenReturn(urlString);
        try {
            new UrlBuilder(url).build();
            fail("Expected an IOException");
        } catch (IOException e) {
            // expected
        }
    }

}