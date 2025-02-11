package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedAppendKeyValWithValidConnectionAddsKeyValuePairToQuery {

    @Test
    public void appendKeyValWithValidConnectionAddsKeyValuePairToQuery() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        urlBuilder.appendKeyVal(kv);
        assertNotNull(urlBuilder.q);
        assertEquals("key=value", ((String) urlBuilder.q).toString());
    }

}