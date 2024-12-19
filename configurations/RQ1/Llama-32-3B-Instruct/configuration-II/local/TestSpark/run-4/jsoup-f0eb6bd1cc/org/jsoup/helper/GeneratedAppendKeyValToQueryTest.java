package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAppendKeyValToQueryTest {

    @Test
    public void appendKeyValToQueryTest() {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://test.com"));
        String query = urlBuilder.u.getQuery();
        assertEquals("key=value", query);
    }

}