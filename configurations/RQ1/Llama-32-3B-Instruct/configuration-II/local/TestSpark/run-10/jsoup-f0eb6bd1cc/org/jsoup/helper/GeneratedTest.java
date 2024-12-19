package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void newUrlBuilder_givenInputUrl_returnsUrlBuilder() {
        // Given
        URL inputUrl = new URL("http://example.com/path?query=value#fragment");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        // Then
        assertEquals(inputUrl, urlBuilder.u);
    }

    @Test
    public void build_givenInputUrl_returnsNormalizedUrl() {
        // Given
        URL inputUrl = new URL("http://example.com/path?query=value#fragment");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        // When
        URL normalizedUrl = urlBuilder.build();

        // Then
        assertEquals("http://example.com/path%3Fquery%3Dvalue#fragment", normalizedUrl.toString());
    }

    @Test
    public void build_givenInputUrlWithNonAsciiPath_returnsNormalizedUrl() {
        // Given
        URL inputUrl = new URL("http://example.com/äthling?query=value#fragment");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        // When
        URL normalizedUrl = urlBuilder.build();

        // Then
        assertEquals("http://example.com/%C3%A4thling%3Fquery%3Dvalue#fragment", normalizedUrl.toString());
    }

    @Test
    public void appendKeyVal_givenConnectionKeyVal_returnsNormalizedQuery() {
        // Given
        Connection.KeyVal connectionKeyVal = new Connection.KeyVal("key", "value");
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com/path?query="));

        // When
        urlBuilder.appendKeyVal(connectionKeyVal);

        // Then
        assertEquals("key=value", urlBuilder.q.toString());
    }

    @Test
    public void appendKeyVal_givenNonEmptyExistingQuery_returnsNormalizedUrl() {
        // Given
        Connection.KeyVal connectionKeyVal = new Connection.KeyVal("key", "value");
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com/path?query=value&new=query"));

        // When
        urlBuilder.appendKeyVal(connectionKeyVal);

        // Then
        assertEquals("http://example.com/path?value=new.query", urlBuilder.u.toString());
    }

    @Test
    public void decodePart_givenNonAsciiString_returnsDecodedString() {
        // Given
        String encoded = "äthling";
        UrlBuilder.urlBuilder = new UrlBuilder();

        // When
        String decoded = UrlBuilder.decodePart(encoded);

        // Then
        assertEquals("äthling", decoded);
    }

    @Test
    public void appendToAscii_givenStringWithSpace_returnsNormalizedString() {
        // Given
        UrlBuilder.urlBuilder = new UrlBuilder();
        StringBuilder sb = new StringBuilder();

        // When
        appendToAscii(" ä ", true, sb);

        // Then
        assertEquals("%20", sb.toString());
    }

    @Test
    public void appendToAscii_givenNonAsciiStringReturnsNormalizedString() {
        // Given
        UrlBuilder.urlBuilder = new UrlBuilder();
        StringBuilder sb = new StringBuilder();

        // When
        appendToAscii("äthling", false, sb);

        // Then
        assertEquals("%C3%A4thling", sb.toString());
    }

}