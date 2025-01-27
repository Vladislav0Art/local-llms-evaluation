package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedAppendKeyValWithValidKeyAndValue {

    @Test
    public void appendKeyValWithValidKeyAndValue() throws UnsupportedEncodingException {
        // Given:
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder(null);

        // When:
        builder.appendKeyVal(kv);

        // Then:
        assertTrue(builder.build().getQuery().contains("key=value"));
    }

}