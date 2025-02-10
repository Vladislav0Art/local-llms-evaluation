package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedAppendKeyValModifiesUrl {

    @Test
    public void appendKeyValModifiesUrl() throws UnsupportedEncodingException, URISyntaxException {
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com/path/to/resource"));
        String url = builder.build().toString();
        assertEquals(url, builder.appendKeyVal(Connection.KeyVal.of(1, "new=query")).build().toString());
    }

}