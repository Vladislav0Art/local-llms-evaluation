package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedNewUrlBuilder_fromValidUrl_returnsNewUrl {

    @Mock
    private URL inputUrl;

    @org.junit.Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void newUrlBuilder_fromValidUrl_returnsNewUrl() {
        when(inputUrl.toString()).thenReturn("https://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertNotNull(urlBuilder.build());
    }

}