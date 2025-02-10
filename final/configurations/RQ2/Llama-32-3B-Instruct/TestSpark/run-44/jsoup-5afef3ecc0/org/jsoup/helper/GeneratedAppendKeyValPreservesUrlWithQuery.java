package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedAppendKeyValPreservesUrlWithQuery {

    @Test
    public void appendKeyValPreservesUrlWithQuery() throws UnsupportedEncodingException, URISyntaxException {
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com/path/to/resource?query=string"));
        String url = builder.build().toString();
        assertEquals(url, builder.appendKeyVal(Connection.KeyVal.of(0, url)).build().toString());
    }

}