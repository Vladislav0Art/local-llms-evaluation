package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URI;
import java.net.URISyntaxException;

public class GeneratedTestAppendKeyVal {

    private UrlBuilder urlBuilder = new UrlBuilder(new URI("https://example.com/path?query=value#anchor"));

    @Test
    public void testAppendKeyVal() throws UnsupportedEncodingException {
        String key = "key";
        String value = "value";
        UrlBuilder.UrlBuilderBuilder builder = UrlBuilder.newUrlBuilderBuilder();
        builder.appendKeyVal(new UrlBuilder.KeyVal(key, value));
        assertEquals("key=value", builder.toString());
        builder = UrlBuilder.newUrlBuilderBuilder().appendKeyVal(null);
        assertEquals("value", builder.toString());
    }

}