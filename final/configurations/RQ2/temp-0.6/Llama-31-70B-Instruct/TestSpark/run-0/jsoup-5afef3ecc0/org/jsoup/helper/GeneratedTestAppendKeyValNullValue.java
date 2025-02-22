package org.jsoup.helper;

public class GeneratedTestAppendKeyValNullValue {

    @Test
    public void testAppendKeyValNullValue() {
        try {
            URL inputUrl = new URL("https://www.example.com");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
            Connection.KeyVal kv = new Connection.KeyVal("key", null);
            urlBuilder.appendKeyVal(kv);
            assertEquals("https://www.example.com?key=", urlBuilder.u.toString());
        } catch (UnsupportedEncodingException | MalformedURLException e) {
            fail("Failed to append key-value pair");
        }
    }

}