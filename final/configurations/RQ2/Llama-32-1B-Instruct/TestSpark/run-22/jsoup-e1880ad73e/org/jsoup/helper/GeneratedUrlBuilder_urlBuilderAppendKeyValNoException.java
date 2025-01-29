package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedUrlBuilder_urlBuilderAppendKeyValNoException {

    @Test
    public void urlBuilder_urlBuilderAppendKeyValNoException() throws MalformedURLException, URISyntaxException {
        URLBuilder builder = new UrlBuilder(new URI("https://example.com"));
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        assertEquals("https://example.com?key=value", builder.build());
    }

}