package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

public class GeneratedUrlBuilderConstructionWithQueryAndRef TestUrlBuilderConstructionWithQueryAndRef {

    @Test
    public void urlBuilderConstructionWithQueryAndRef

    TestUrlBuilderConstructionWithQueryAndRef() throws UnsupportedEncodingException {
        URL u = new URL("http://a%20b.com?c=d&e=f#h");
        UrlBuilder urlBuilder = new UrlBuilder(u);
        assertNotNull(urlBuilder.u);
        assertEquals(9, urlBuilder.q.toString().length());
    }

}