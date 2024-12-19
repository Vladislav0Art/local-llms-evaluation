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

public class GeneratedUrlBuilderEmptyUrlStringScenario {

    @Mock
    private URL url;

    @Test
    public void UrlBuilderEmptyUrlStringScenario() throws UnsupportedEncodingException {
        final String urlString = "";
        when(url.toString()).thenReturn(urlString);
        UrlBuilder urlBuilder = new UrlBuilder(url);
        List<URL.KeyValue> keyValuePairs = List.of(
                new URL.KeyValue("key", "1"),
                new URL.KeyValue("value", "2")
        );
        urlBuilder.appendKeyVal(keyValuePairs);
        String resultUrl = (String) urlBuilder.build();
        assertEquals(urlString, resultUrl);
    }

}