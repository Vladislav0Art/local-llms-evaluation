package org.jsoup.helper;

public class GeneratedTest {

    private UrlBuilder urlBuilder;
    private URL inputUrl;

    @Before
    public void setUp() throws MalformedURLException {
        inputUrl = new URL("https://example.com");
        urlBuilder = new UrlBuilder(inputUrl);
    }

    @Test
    public void build_withQuery_shouldNormalizeQuery() {
        // Arrange
        urlBuilder.q = new StringBuilder("key1=value 1&key2=value+2");

        // Act
        URL actual = urlBuilder.build();

        // Assert
        assertNotNull(actual);
        assertEquals("https://example.com?key1=value+1&key2=value+2", actual.toString());
    }

    @Test
    public void build_withRef_shouldNormalizeRef() {
        // Arrange
        urlBuilder.u.setRef("space in ref");

        // Act
        URL actual = urlBuilder.build();

        // Assert
        assertNotNull(actual);
        assertEquals("https://example.com#space%20in%20ref", actual.toString());
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