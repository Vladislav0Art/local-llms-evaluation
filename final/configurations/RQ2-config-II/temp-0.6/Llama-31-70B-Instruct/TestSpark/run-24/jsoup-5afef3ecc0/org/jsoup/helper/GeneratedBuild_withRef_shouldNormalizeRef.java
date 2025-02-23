package org.jsoup.helper;

public class GeneratedBuild_withRef_shouldNormalizeRef {

    private UrlBuilder urlBuilder;
    private URL inputUrl;

    @Before
    public void setUp() throws MalformedURLException {
        inputUrl = new URL("https://example.com");
        urlBuilder = new UrlBuilder(inputUrl);
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

}