package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(org.junit.runners.JUnit4.class)
public class GeneratedBuildUrlIsNotModifiedByAppendKeyVal {

    public static class InputUrl {
        private URL url;

        public InputUrl(URL url) {
            this.url = url;
        }

        public URL getUrl() {
            return url;
        }
    }

    @Mock
    private URL inputUrl;

    @Test
    public void buildUrlIsNotModifiedByAppendKeyVal() throws Exception {
        when(inputUrl.toExternalForm()).thenReturn("http://example.com");
        InputUrl urlBuilder = new InputUrl(inputUrl);
        assertEquals("http://example.com", urlBuilder.getUrl().toExternalForm());
    }

}