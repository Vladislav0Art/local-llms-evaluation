package org.jsoup.helper;

public class GeneratedTest {

    private UrlBuilder urlBuilder;

    @Test
    public void buildUrlTest() throws Exception {
        URL inputUrl = new URL("https://www.example.com/");
        urlBuilder = new UrlBuilder(inputUrl);
        URL actualUrl = urlBuilder.build();
        assertEquals(inputUrl, actualUrl);
    }

    @Test
    public void appendKeyValTest() throws Exception {
        URL inputUrl = new URL("https://www.example.com/");
        urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = new Connection.KeyVal("key", "value", "UTF-8");
        urlBuilder.appendKeyVal(kv);
        URL actualUrl = urlBuilder.build();
        assertTrue(actualUrl.getPath().contains("key=value"));
    }

    @Test
    public void appendKeyValExceptionTest() throws Exception {
        URL inputUrl = new URL("https://www.example.com/");
        urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = new Connection.KeyVal("key", "value", "UTF-8");
        urlBuilder.appendKeyVal(kv);
        URL actualUrl = urlBuilder.build();
        assertTrue(actualUrl.getPath().contains("key=value"));
    }

}