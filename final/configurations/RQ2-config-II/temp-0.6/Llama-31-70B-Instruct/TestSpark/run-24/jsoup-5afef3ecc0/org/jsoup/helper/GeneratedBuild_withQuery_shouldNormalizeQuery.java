package org.jsoup.helper;

public class GeneratedBuild_withQuery_shouldNormalizeQuery {

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

}