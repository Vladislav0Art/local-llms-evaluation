package org.jsoup.helper;

public class GeneratedAppendKeyVal {

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() throws Exception {
        URL inputUrl = new URL("https://www.example.com/path/to/page?key=value#anchor");
        urlBuilder = new UrlBuilder(inputUrl);
    }

    @Test
    public void appendKeyVal() throws Exception {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        urlBuilder.appendKeyVal(kv);
        String query = urlBuilder.q.toString();
        assertEquals("key=value", query);
    }

}