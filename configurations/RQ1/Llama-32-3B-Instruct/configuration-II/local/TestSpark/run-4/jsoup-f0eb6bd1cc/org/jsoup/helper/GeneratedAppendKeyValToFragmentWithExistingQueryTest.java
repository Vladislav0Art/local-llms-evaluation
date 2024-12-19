package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAppendKeyValToFragmentWithExistingQueryTest {

    @Test
    public void appendKeyValToFragmentWithExistingQueryTest() {
        Connection.KeyVal kv1 = new Connection.KeyVal("key1", "value1");
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://test.com#fragment?query=value1"));
        String fragment = urlBuilder.u.getRef();
        assertEquals("#fragment", fragment);
        urlBuilder.appendKeyVal(kv1);
        assertTrue(fragment.contains("%3D%3F"));
    }

}