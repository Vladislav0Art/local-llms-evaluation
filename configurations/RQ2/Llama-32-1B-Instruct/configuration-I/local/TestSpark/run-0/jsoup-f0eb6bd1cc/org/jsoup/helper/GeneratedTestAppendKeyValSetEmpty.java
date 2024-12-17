package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

@RunWith(MockitoJUnit4.class)
public class GeneratedTestAppendKeyValSetEmpty {

    @Mock
    private Connection.KeyVal kv;

    public void testBuildUrl() throws IOException {
        String inputUrl = "https://example.com/path?param1=value1&param2=value2";
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        when(kv.getKey()).thenReturn(map);
        UrlBuilder urlBuilder = new UrlBuilder(URL.parse(inputUrl));
        URL url = urlBuilder.build();
        assertEquals(inputUrl, url.toString());
    }

    public void testAppendKeyVal() throws UnsupportedEncodingException {
        String inputString = "param1=value1&param2=value2";
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        when(kv.getKey()).thenReturn(map);
        UrlBuilder urlBuilder = new UrlBuilder(URL.parse("https://example.com/path"));
        urlBuilder.appendKeyVal(kv);
        Map<String, String> expectedMap = new HashMap<>();
        expectedMap.put("key", "value");
        assertEquals(expectedMap, kv.getValue());
    }

    public void testAppendKeyValUnsupported() {
        String inputString = "param1=value1&param2=value2";
        Map<String, String> map = new HashMap<>();
        when(kv.getKey()).thenThrow(UnsupportedEncodingException.class);
        UrlBuilder urlBuilder = new UrlBuilder(URL.parse("https://example.com/path"));
        try {
            urlBuilder.appendKeyVal(kv);
            fail();
        } catch (IOException e) {
            // expected
        }
    }

    public void testAppendKeyValEmpty() {
        String inputString = "";
        Map<String, String> map = new HashMap<>();
        when(kv.getKey()).thenReturn(map);
        UrlBuilder urlBuilder = new UrlBuilder(URL.parse("https://example.com/path"));
        urlBuilder.appendKeyVal(kv);
        assertEquals("", kv.getValue());
    }

    public void testAppendKeyValNull() {
        String inputString = "param1=value1&param2=value2";
        Map<String, String> map = null;
        when(kv.getKey()).thenReturn(map);
        UrlBuilder urlBuilder = new UrlBuilder(URL.parse("https://example.com/path"));
        urlBuilder.appendKeyVal(kv);
        assertEquals("", kv.getValue());
    }

    @Test
    public void testAppendKeyValSetEmpty() {
        String inputString = "";
        Map<String, String> map = new HashMap<>();
        when(kv.getKey()).thenReturn(map);
        UrlBuilder urlBuilder = new UrlBuilder(URL.parse("https://example.com/path"));
        urlBuilder.appendKeyVal(map);
    }

}