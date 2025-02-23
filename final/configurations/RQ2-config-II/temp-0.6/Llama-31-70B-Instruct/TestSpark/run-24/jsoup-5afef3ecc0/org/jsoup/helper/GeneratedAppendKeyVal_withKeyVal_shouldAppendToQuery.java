package org.jsoup.helper;

public class GeneratedAppendKeyVal_withKeyVal_shouldAppendToQuery {

    private UrlBuilder urlBuilder;
    private URL inputUrl;

    @Before
    public void setUp() throws MalformedURLException {
        inputUrl = new URL("https://example.com");
        urlBuilder = new UrlBuilder(inputUrl);
    }

    @Test
    public void appendKeyVal_withKeyVal_shouldAppendToQuery() throws UnsupportedEncodingException {
        // Arrange
        Connection.KeyVal kv = new Connection.KeyVal("key1", "value 1");

        // Act
        urlBuilder.appendKeyVal(kv);

        // Assert
        assertEquals("key1=value+1", urlBuilder.q.toString());
    }

}