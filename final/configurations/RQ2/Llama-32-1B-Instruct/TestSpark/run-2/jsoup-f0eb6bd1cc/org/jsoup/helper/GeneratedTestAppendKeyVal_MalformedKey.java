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
public class GeneratedTestAppendKeyVal_MalformedKey {

    @Mock
    private Connection.KeyVal mockKeyVal;

    @Test
    public void testAppendKeyVal_MalformedKey() {
        UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path?malformed=a&b=2");
        Map<String, String> kv = new HashMap<>();
        urlBuilder.appendKeyVal(kv);
        try {
            assertEquals("https://example.com/path%3Falformed%26b%3D2", urlBuilder.build().toString());
        } catch (UnsupportedEncodingException e) {
            fail("Expected UnsupportedEncodingException");
        }
    }

}