package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedUrlBuilder_urlBuilderAppendKeyValException {

    @Test
    public void urlBuilder_urlBuilderAppendKeyValException() throws MalformedURLException, URISyntaxException {
        URLBuilder builder = new UrlBuilder(new URI("https://example.com"));
        assertThrows(MalformedURLException.class, () -> builder.appendKeyVal(null));
        assertEquals("", builder.build());

        try {
            builder.appendKeyVal(new Connection.KeyVal());
            fail("Expected URISyntaxException");
        } catch (URISyntaxException e) {
        }
    }

}