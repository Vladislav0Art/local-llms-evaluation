package org.jsoup.helper;

public class GeneratedTest {

    private UrlBuilder urlBuilder;

    @Test
    public void buildTest() throws MalformedURLException, URISyntaxException {
        URL inputUrl = new URL("https://www.example.com/");
        urlBuilder = new UrlBuilder(inputUrl);
        URL expectedUrl = new URL("https://www.example.com/");
        URL actualUrl = urlBuilder.build();
        assertEquals(expectedUrl, actualUrl);
    }

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        URL inputUrl = new URL("https://www.example.com/");
        urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        urlBuilder.appendKeyVal(kv);
        assertEquals("key=value", urlBuilder.query().toString());
    }

}