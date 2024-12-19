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
public class GeneratedTest {

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
    public void ofNullUrl_ThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new UrlBuilder(null));
    }

    @Test
    public void buildUrlIsNotModifiedByAppendKeyVal() throws Exception {
        when(inputUrl.toExternalForm()).thenReturn("http://example.com");
        InputUrl urlBuilder = new InputUrl(inputUrl);
        assertEquals("http://example.com", urlBuilder.getUrl().toExternalForm());
    }

    @Test
    public void appendKeyVal_DoesNotChangeBuildUrl() throws Exception {
        when(inputUrl.toExternalForm()).thenReturn("http://example.com");
        when(inputUrl.toURI()).thenReturn(new URI("http://localhost:8080"));
        InputUrl urlBuilder = new InputUrl(inputUrl);
        Map<String, String> kv = new HashMap<>();
        kv.put("test", "value");
        urlBuilder.getUrl().appendKeyVal(kv);
        assertEquals("http://example.com", urlBuilder.getUrl().build().toExternalForm());
    }

    @Test
    public void appendKeyVal_CanModifyBuildUrlForNonDefaultPort() throws Exception {
        when(inputUrl.toExternalForm()).thenReturn("http://localhost:8081");
        when(inputUrl.toURI()).thenReturn(new URI("http://localhost:8080"));
        InputUrl urlBuilder = new InputUrl(inputUrl);
        Map<String, String> kv = new HashMap<>();
        kv.put("test", "value");
        urlBuilder.getUrl().appendKeyVal(kv);
        assertEquals("http://localhost:8081/test=value", urlBuilder.getUrl().build().toExternalForm());
    }

    @Test
    public void appendKeyVal_DoesNotChangeBuildUrlForNonDefaultScheme() throws Exception {
        when(inputUrl.toURI()).thenReturn(new URI("https://localhost"));
        InputUrl urlBuilder = new InputUrl(inputUrl);
        Map<String, String> kv = new HashMap<>();
        kv.put("test", "value");
        urlBuilder.getUrl().appendKeyVal(kv);
        assertEquals("https://localhost", urlBuilder.getUrl().build().toExternalForm());
    }

    @Test
    public void appendKeyVal_Base64ValuesAreSupported() throws Exception {
        when(inputUrl.toURI()).thenReturn(new URI("http://localhost"));
        Map<String, String> kv = new HashMap<>();
        kv.put("test", Base64.getEncoder().encodeToString("value".getBytes()));
        InputUrl urlBuilder = new InputUrl(inputUrl);
        urlBuilder.getUrl().appendKeyVal(kv);
        assertEquals("http://localhost/test=SG9zdGF0aWM=", urlBuilder.getUrl().build().toExternalForm());
    }

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