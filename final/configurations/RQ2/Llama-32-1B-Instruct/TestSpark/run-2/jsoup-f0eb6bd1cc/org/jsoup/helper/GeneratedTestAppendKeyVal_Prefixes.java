package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestAppendKeyVal_Prefixes {

    @Mock
    private Connection.KeyVal mockKeyVal;

    @Test
    public void testAppendKeyVal_Prefixes() {
        UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path?prefix=abc&key=value");
        Map<String, String> kv = new HashMap<>();
        kv.put("key", "value");
        urlBuilder.appendKeyVal(kv);
        assertEquals("https://example.com/path/abc(prefix=abc)%3Dkey%26value", urlBuilder.build().toString());
    }

}