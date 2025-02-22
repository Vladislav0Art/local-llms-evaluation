package org.jsoup.helper;

public class GeneratedAppendKeyValWithInvalidKeyVal {

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() throws Exception {
        URL inputUrl = new URL("https://www.example.com/path/to/page?key=value#anchor");
        urlBuilder = new UrlBuilder(inputUrl);
    }

    @Test
    public void appendKeyValWithInvalidKeyVal() throws Exception {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        urlBuilder = new UrlBuilder(new URL("http://www.example.com/path/to/page?key=value#anchor"));
        urlBuilder.appendKeyVal(kv);
        String query = urlBuilder.q.toString();
        assertNotEquals("key=value", query);
    }

}