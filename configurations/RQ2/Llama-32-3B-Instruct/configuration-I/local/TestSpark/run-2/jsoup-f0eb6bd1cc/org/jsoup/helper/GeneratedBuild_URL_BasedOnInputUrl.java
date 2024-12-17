package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.net.URL;
import java.util.Arrays;
import java.util.Map;

public class GeneratedBuild_URL_BasedOnInputUrl {

    @Mock
    private URL inputUrl;

    @org.mockito.InjectMocks
    private UrlBuilder urlBuilder;

    public UrlBuilderTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void build_URL_BasedOnInputUrl() {
        when(inputUrl.toExternalForm()).thenReturn("https://example.com");
        assertEquals("https://example.com", urlBuilder.build().toExternalForm());
    }

}