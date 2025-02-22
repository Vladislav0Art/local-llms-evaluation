package org.jsoup.helper;

public class GeneratedAppendKeyValWithNoQueryTest {

    @Test
    public void appendKeyValWithNoQueryTest() throws UnsupportedEncodingException {
        URL inputUrl = new URL("http://www.example.com/path");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        urlBuilder.appendKeyVal(kv);

        assertEquals(urlBuilder.q.toString(), "key=value");
    }

}