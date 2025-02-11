package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedAppendKeyValWithNullConnectionDoesNotThrowAnyException {

    @Test
    public void appendKeyValWithNullConnectionDoesNotThrowAnyException() {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        Connection.KeyVal kv = null;
        urlBuilder.appendKeyVal(kv);
        assertNotNull(urlBuilder.q);
    }

}