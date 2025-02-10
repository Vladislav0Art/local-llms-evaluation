package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedAppendKeyValPreservesUrl {

    @Test
    public void appendKeyValPreservesUrl() throws UnsupportedEncodingException, URISyntaxException {
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com/path/to/resource"));
        String url = builder.build().toString();
        assertEquals(url, builder.appendKeyVal(Connection.KeyVal.of(0, url)).build().toString());
    }

}