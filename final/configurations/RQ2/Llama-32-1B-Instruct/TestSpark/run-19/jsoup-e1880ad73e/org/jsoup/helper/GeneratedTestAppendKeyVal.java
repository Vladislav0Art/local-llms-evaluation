package org.jsoup.helper;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestAppendKeyVal {

    @Test
    public void testAppendKeyVal() {
        UrlValue kv = new UrlValue("key", "value");
        String inputUrl = "https://example.com/path?param1=value1";

        // setup and assert
        when(kv.getKey()).thenReturn("key");
        when(kv.getValue()).thenReturn("value");
        URLBuilder builder = new UrlBuilder(inputUrl);
        Collection<UrlValue> queryParams = builder.appendKeyVal(kv);

        assertEquals("https://example.com/path?param1=value1", urls()[0].toString());
    }

}