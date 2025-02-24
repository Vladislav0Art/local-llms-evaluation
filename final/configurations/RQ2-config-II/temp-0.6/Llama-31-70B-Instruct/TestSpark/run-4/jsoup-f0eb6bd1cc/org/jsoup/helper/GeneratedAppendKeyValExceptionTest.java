package org.jsoup.helper;

public class GeneratedAppendKeyValExceptionTest {

    private UrlBuilder urlBuilder;

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