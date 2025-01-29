package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestAppendKeyVal_3 {

    @Test
    public void testAppendKeyVal_3() {
        URL url = null;
        Map<String, String> kv = new HashMap<>();
        kv.put("key", "value");
        UrlBuilder builder = new UrlBuilder(url);
        assertEquals(null, builder.build().toURI());
    }

}