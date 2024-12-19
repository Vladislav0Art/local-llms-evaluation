package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.IDN;
import java.util.HashMap;

public class GeneratedAppendKeyValKeyAndValueAreEncodedCorrectly {

    @Test
    public void appendKeyValKeyAndValueAreEncodedCorrectly() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder(null);
        builder.appendKeyVal(kv);
        assertEquals("&key=value", builder.q.toString());
    }

}