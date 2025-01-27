package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;

public class GeneratedNewUrlBuilder_withInputUrl {

    @Test
    public void newUrlBuilder_withInputUrl() {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        assertNotNull(urlBuilder);
    }

}