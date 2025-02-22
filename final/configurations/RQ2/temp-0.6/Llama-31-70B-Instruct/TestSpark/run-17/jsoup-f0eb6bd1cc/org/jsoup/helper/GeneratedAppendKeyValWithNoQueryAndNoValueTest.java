package org.jsoup.helper;

public class GeneratedAppendKeyValWithNoQueryAndNoValueTest {

    @Test
    public void appendKeyValWithNoQueryAndNoValueTest() throws UnsupportedEncodingException {
        URL inputUrl = new URL("http://www.example.com/path");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        Connection.KeyVal kv = new Connection.KeyVal("key", "");
        urlBuilder.appendKeyVal(kv);

        assertEquals(urlBuilder.q.toString(), "key=");
    }

}