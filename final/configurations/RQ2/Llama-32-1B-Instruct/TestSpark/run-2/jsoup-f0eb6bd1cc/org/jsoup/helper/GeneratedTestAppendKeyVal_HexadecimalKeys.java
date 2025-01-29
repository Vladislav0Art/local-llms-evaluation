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
public class GeneratedTestAppendKeyVal_HexadecimalKeys {

    @Mock
    private Connection.KeyVal mockKeyVal;

    @Test
    public void testAppendKeyVal_HexadecimalKeys() {
        UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path?A=12&B=34");
        Map<String, String> kv = new HashMap<>();
        kv.put("A", "12");
        kv.put("B", "34");
        urlBuilder.appendKeyVal(kv);
        assertEquals("https://example.com/path%3DA12%26B34", urlBuilder.build().toString());
    }

}