package org.jsoup.helper;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    private UrlBuilder builder;

    @Test
    public void buildWithValidUrlTest() throws URISyntaxException, MalformedURLException {
        URL url = new URL("http://www.example.com/");
        builder = new UrlBuilder(url);
        assertEquals(url, builder.build());
    }

    @Test
    public void buildWithNullUrlTest() {
        URL url = null;
        builder = new UrlBuilder(url);
        builder.build();
    }

    @Test
    public void buildWithInvalidUrlTest() {
        URL url = new URL("example.com");
        builder = new UrlBuilder(url);
        builder.build();
    }

    @Test
    public void appendKeyValWithValidKeyValTest() throws UnsupportedEncodingException {
        URL url = new URL("http://www.example.com/");
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        builder = new UrlBuilder(url);
        builder.appendKeyVal(kv);
    }

    @Test
    public void appendKeyValWithNullKeyValTest() throws UnsupportedEncodingException {
        URL url = new URL("http://www.example.com/");
        Connection.KeyVal kv = null;
        builder = new UrlBuilder(url);
        builder.appendKeyVal(kv);
    }

}