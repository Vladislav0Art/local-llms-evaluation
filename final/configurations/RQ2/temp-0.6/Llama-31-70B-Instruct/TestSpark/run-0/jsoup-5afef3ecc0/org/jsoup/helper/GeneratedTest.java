package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void testBuild() {
        try {
            URL inputUrl = new URL("https://www.example.com");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
            URL outputUrl = urlBuilder.build();
            assertEquals("https://www.example.com", outputUrl.toString());
        } catch (MalformedURLException e) {
            fail("Failed to build URL");
        }
    }

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