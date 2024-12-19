package org.jsoup.helper;

public class GeneratedBuildWithNonAsciiPath {

    @Test
    public void buildWithNonAsciiPath() {
        // Given
        Connection connection = new Connection();
        URL url = new URL("http://example.com/épath?query=string#fragment");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        // When
        URL normalizedUrl = urlBuilder.build();

        // Then
        assertEquals("http://example.com/%C3%A9path?query=string%3Ffragment", normalizedUrl.toString());
    }

}