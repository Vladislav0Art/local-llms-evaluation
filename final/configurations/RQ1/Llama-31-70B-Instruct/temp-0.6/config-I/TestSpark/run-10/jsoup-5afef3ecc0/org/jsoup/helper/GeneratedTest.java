package org.jsoup.helper;

public class GeneratedTest {

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() throws Exception {
        URL inputUrl = new URL("https://www.example.com/path/to/page?key=value#anchor");
        urlBuilder = new UrlBuilder(inputUrl);
    }

    @Test
    public void buildWithValidUrl() throws Exception {
        URL builtUrl = urlBuilder.build();
        assertEquals("https://www.example.com/path/to/page?key=value#anchor", builtUrl.toString());
    }

    @Test
    public void buildWithInvalidUrl() throws Exception {
        URL inputUrl = new URL("http://www.example.com/path/to/page?key=value#anchor");
        urlBuilder = new UrlBuilder(inputUrl);
        URL builtUrl = urlBuilder.build();
        assertNotEquals("https://www.example.com/path/to/page?key=value#anchor", builtUrl.toString());
    }

    @Test
    public void appendKeyVal() throws Exception {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        urlBuilder.appendKeyVal(kv);
        String query = urlBuilder.q.toString();
        assertEquals("key=value", query);
    }

    @Test
    public void appendKeyValWithInvalidKeyVal() throws Exception {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        urlBuilder = new UrlBuilder(new URL("http://www.example.com/path/to/page?key=value#anchor"));
        urlBuilder.appendKeyVal(kv);
        String query = urlBuilder.q.toString();
        assertNotEquals("key=value", query);
    }

    @Test
    public void normalizeQuery() {
        String normalizedQuery = UrlBuilder.normalizeQuery("key=value");
        assertEquals("key=value", normalizedQuery);
    }

}