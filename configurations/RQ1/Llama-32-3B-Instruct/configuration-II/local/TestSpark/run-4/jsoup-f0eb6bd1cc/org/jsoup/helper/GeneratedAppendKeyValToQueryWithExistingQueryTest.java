package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAppendKeyValToQueryWithExistingQueryTest {

    @Test
    public void appendKeyValToQueryWithExistingQueryTest() {
        Connection.KeyVal kv1 = new Connection.KeyVal("key1", "value1");
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://test.com?query=value1"));
        String query = urlBuilder.u.getQuery();
        assertEquals("key1=value1&key2=value2", query);
    }

}