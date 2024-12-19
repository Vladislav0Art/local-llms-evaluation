package org.jsoup.helper;

public class GeneratedNewUrlBuilder_givenInputUrl_returnsUrlBuilder {

    @Test
    public void newUrlBuilder_givenInputUrl_returnsUrlBuilder() {
        // Given
        URL inputUrl = new URL("http://example.com/path?query=value#fragment");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        // Then
        assertEquals(inputUrl, urlBuilder.u);
    }

}