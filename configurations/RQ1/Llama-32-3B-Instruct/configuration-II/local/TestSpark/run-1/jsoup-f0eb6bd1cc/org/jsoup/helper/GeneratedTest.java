package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void build() {
        // Given
        Connection connection = new Connection();
        URL url = new URL("http://example.com/path?query=string#fragment");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        // When
        URL normalizedUrl = urlBuilder.build();

        // Then
        assertEquals("http://example.com/path?query=string%3Ffragment", normalizedUrl.toString());
    }

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

    @Test
    public void appendKeyVal() {
        // Given
        Connection connection = new Connection();
        KeyVal keyVal = new KeyVal("key", "value");
        UrlBuilder urlBuilder = new UrlBuilder(connection);

        // When
        urlBuilder.appendKeyVal(keyVal);

        // Then
        assertNotNull(urlBuilder.q);
        assertEquals("key=value", urlBuilder.q.toString());
    }

    @Test
    public void appendToAscii() {
        // Given
        StringBuilder sb = new StringBuilder();
        String s = "é";
        UrlBuilder urlBuilder = new UrlBuilder(connection);

        // When
        urlBuilder.appendToAscii(s, true, sb);

        // Then
        assertEquals("%E9", sb.toString());
    }

    @Test
    public void appendToAsciiWithSpace() {
        // Given
        StringBuilder sb = new StringBuilder();
        String s = "é";
        UrlBuilder urlBuilder = new UrlBuilder(connection);

        // When
        urlBuilder.appendToAscii(s, false, sb);

        // Then
        assertEquals("%20", sb.toString());
    }

}