package org.jsoup.helper;

import org.jsoup.helper.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedAppendInvalidKeyThrows {

    @Test
    public void AppendInvalidKeyThrows() {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        try {
            org.jsoup.helper.Connection.KeyVal kv = org.jsoup.helper.Connection.KeyVal.create("invalid_key", "value");
            urlBuilder.appendKeyVal(kv);
            assert false;
        } catch (Exception e) {
            assertTrue(true);
        }
    }

}