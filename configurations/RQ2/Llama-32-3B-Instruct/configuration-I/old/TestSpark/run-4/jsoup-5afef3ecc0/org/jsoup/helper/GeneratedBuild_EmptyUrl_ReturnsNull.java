package org.jsoup.helper;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.net.URL;
import java.util.Map;

public class GeneratedBuild_EmptyUrl_ReturnsNull {

    @Mock
    private URL inputUrl;

    public void setup() {
        MockitoAnnotations.initMocks(this);
        when(inputUrl.toString()).thenReturn("http://test.com");
    }

    @Test
    public void build_EmptyUrl_ReturnsNull() {
        org.jsoup.helper.UrlBuilder builder = new org.jsoup.helper.UrlBuilder((URL) null);
        assertEquals(null, builder.build());
    }

}