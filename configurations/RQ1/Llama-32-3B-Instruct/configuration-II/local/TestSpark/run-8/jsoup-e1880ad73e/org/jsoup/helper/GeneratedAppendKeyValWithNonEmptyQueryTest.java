package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection.KeyVal;
import org.jsoup.Connection;

public class GeneratedAppendKeyValWithNonEmptyQueryTest {

    @Test
    public void appendKeyValWithNonEmptyQueryTest() throws Exception {
        KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder(new URL("http://localhost:8080/test?query=abc&foo=bar"));
        builder.appendKeyVal(kv);
        assertNotNull(builder.q);
        assertEquals("%3F%26%7C%2Bkey=value", builder.q.toString());
    }
}

}