package org.jsoup.helper;

public class GeneratedBuildWithQueryAndFragment {

    @Test
    public void buildWithQueryAndFragment() {
        // Given
        Connection connection = new Connection();
        URL url = new URL("http://example.com/path?query=string#fragment");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        // When
        URL normalizedUrl = urlBuilder.build();

        // Then
        assertEquals("http://example.com/path?query=string%3Ffragment", normalizedUrl.toString());
    }

}