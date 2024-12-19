package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection.KeyVal;
import org.jsoup.Connection;

public class GeneratedAppendKeyValWithEmptyQueryTest {

    @Test
    public void appendKeyValWithEmptyQueryTest() throws Exception {
        KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder(new URL("http://localhost:8080/test"));
        builder.appendKeyVal(kv);
        assertNotNull(builder.q);
        assertEquals("%2C%26key=value", builder.q.toString());
    }

}