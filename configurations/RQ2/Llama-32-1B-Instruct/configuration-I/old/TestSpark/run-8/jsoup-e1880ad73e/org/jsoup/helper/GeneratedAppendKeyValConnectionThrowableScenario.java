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

public class GeneratedAppendKeyValConnectionThrowableScenario {

    @Mock
    private URL url;

    @Test
    public void appendKeyValConnectionThrowableScenario() throws UnsupportedEncodingException {
        final String urlString = "https://example.com/path?key=1&value=2";
        when(url.toString()).thenReturn(urlString);
        UrlBuilder urlBuilder = new UrlBuilder(url);
        List<URL.KeyValue> keyValuePairs = List.of(
                new URL.KeyValue("key", "1"),
                new URL.KeyValue("value", "2")
        );
        urlBuilder.appendKeyVal(keyValuePairs);
        MockitoAnnotations.initMocks(this);
        try {
            urlBuilder.build();
            fail("Expected an IOException");
        } catch (IOException e) {
            // expected
        }
    }

}