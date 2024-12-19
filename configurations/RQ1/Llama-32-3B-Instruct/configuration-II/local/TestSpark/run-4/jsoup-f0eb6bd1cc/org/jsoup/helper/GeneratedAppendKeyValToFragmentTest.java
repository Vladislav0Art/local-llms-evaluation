package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAppendKeyValToFragmentTest {

    @Test
    public void appendKeyValToFragmentTest() {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://test.com#fragment"));
        String fragment = urlBuilder.u.getRef();
        assertEquals("#fragment", fragment);
        urlBuilder.appendKeyVal(kv);
        assertTrue(fragment.contains("%3D%3F"));
    }

}