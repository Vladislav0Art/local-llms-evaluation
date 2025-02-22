package org.jsoup.helper;

public class GeneratedTestAppendKeyVal {

    @Test
    public void testAppendKeyVal() {
        try {
            URL inputUrl = new URL("https://www.example.com");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
            Connection.KeyVal kv = new Connection.KeyVal("key", "value");
            urlBuilder.appendKeyVal(kv);
            assertEquals("https://www.example.com?key=value", urlBuilder.u.toString());
        } catch (UnsupportedEncodingException | MalformedURLException e) {
            fail("Failed to append key-value pair");
        }
    }

}