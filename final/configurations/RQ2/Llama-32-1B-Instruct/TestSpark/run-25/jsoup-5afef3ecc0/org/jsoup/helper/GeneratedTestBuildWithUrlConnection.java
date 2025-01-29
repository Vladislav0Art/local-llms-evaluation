package org.jsoup.helper;

import org.junit.Test;

import static org.jsoup.helper.DataUtil.UTF_8;

public class GeneratedTestBuildWithUrlConnection {

    @Test
    public void testBuildWithUrlConnection() {
        String inputUrl = "https://example.com/path/to/resource";
        Connection.KeyVal kv1 = new org.jsoup.KeyVal("key1", "value1");
        Connection.KeyVal kv2 = new org.jsoup.KeyVal("key2", "value2");
        UrlBuilder builder = new UrlBuilder(new URL(inputUrl));
        builder.appendKeyVal(kv1);
        builder.appendKeyVal(kv2);
        try {
            URL url = builder.build();
            assertNotNull(url);
            assertEquals("https://example.com/path/to/resource?key1=value1&key2=value2", url.toString());
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

}