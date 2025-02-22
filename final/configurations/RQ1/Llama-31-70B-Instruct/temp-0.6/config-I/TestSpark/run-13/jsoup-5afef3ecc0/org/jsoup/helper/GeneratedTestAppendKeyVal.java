package org.jsoup.helper;

public class GeneratedTestAppendKeyVal {

    @Test
    public void testAppendKeyVal() throws UnsupportedEncodingException {
        URL inputUrl = new URL("https://www.example.com/");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(new Connection.KeyVal("key1", "value1"));
        urlBuilder.appendKeyVal(new Connection.KeyVal("key2", "value2"));
        assertNotNull(urlBuilder.q);
        assertEquals("key1=value1&key2=value2", urlBuilder.q.toString());
    }

}