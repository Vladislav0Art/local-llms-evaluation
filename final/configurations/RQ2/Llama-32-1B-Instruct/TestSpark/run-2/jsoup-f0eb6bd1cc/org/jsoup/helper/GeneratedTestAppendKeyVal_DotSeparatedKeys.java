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
public class GeneratedTestAppendKeyVal_DotSeparatedKeys {

    @Mock
    private Connection.KeyVal mockKeyVal;

    @Test
    public void testAppendKeyVal_DotSeparatedKeys() {
        UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path?a=1.2&a3=4");
        Map<String, String> kv = new HashMap<>();
        kv.put("a", "1.2");
        kv.put("b", "4");
        urlBuilder.appendKeyVal(kv);
        assertEquals("https://example.com/path?a%3D1.2%26b%3D4", urlBuilder.build().toString());
    }

}