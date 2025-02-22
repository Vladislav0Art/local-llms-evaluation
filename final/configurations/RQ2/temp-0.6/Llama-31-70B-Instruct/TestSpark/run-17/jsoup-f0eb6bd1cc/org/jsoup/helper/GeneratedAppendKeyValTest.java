package org.jsoup.helper;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        URL inputUrl = new URL("http://www.example.com/path?q=s");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        urlBuilder.appendKeyVal(kv);

        assertEquals(urlBuilder.q.toString(), "q=s&key=value");
    }

}