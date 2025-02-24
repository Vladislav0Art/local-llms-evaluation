package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void buildTest() throws MalformedURLException, URISyntaxException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL actual = urlBuilder.build();
        assertEquals("http://example.com", actual.toString());
    }

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = new Connection.KeyVal("key", "val", true);
        urlBuilder.appendKeyVal(kv);
        assertEquals("http://example.com?key=val", urlBuilder.build().toString());
    }

}