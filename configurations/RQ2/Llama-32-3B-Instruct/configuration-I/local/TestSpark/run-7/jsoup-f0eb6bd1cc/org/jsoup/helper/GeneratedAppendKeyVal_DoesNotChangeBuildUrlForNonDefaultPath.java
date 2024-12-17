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
public class GeneratedAppendKeyVal_DoesNotChangeBuildUrlForNonDefaultPath {

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
    public void appendKeyVal_DoesNotChangeBuildUrlForNonDefaultPath() throws Exception {
        when(inputUrl.toURI()).thenReturn(new URI("/"));
        InputUrl urlBuilder = new InputUrl(inputUrl);
        Map<String, String> kv = new HashMap<>();
        kv.put("test", "value");
        urlBuilder.getUrl().appendKeyVal(kv);
        assertEquals("/test=value", urlBuilder.getUrl().build().toExternalForm());
    }

}