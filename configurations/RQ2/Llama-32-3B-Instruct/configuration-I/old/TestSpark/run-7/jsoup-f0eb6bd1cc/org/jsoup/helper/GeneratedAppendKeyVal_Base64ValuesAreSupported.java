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
public class GeneratedAppendKeyVal_Base64ValuesAreSupported {

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
    public void appendKeyVal_Base64ValuesAreSupported() throws Exception {
        when(inputUrl.toURI()).thenReturn(new URI("http://localhost"));
        Map<String, String> kv = new HashMap<>();
        kv.put("test", Base64.getEncoder().encodeToString("value".getBytes()));
        InputUrl urlBuilder = new InputUrl(inputUrl);
        urlBuilder.getUrl().appendKeyVal(kv);
        assertEquals("http://localhost/test=SG9zdGF0aWM=", urlBuilder.getUrl().build().toExternalForm());
    }

}