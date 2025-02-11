package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

public class GeneratedUrlBuilderConstructionWithQueryAndNoRef TestUrlBuilderConstructionWithQueryAndNoRef {

    @Test
    public void urlBuilderConstructionWithQueryAndNoRef

    TestUrlBuilderConstructionWithQueryAndNoRef() throws UnsupportedEncodingException {
        URL u = new URL("http://a%20b.com?c=d&e=f");
        UrlBuilder urlBuilder = new UrlBuilder(u);
        assertNotNull(urlBuilder.u);
        assertNull(urlBuilder.q);
    }

}