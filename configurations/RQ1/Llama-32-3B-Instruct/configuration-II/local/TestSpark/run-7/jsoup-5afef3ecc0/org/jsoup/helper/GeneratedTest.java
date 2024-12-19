package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void buildNormalUrl_NoNormalizationNeeded() {
        // Given
        URL inputUrl = new URL("https://example.com/path");

        // When
        URL expectedUrl = new URL(inputUrl.toExternalForm());
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        // Then
        assertEquals(expectedUrl, urlBuilder.build());
    }

    @Test
    public void buildNormalUrl_PathContainsNonAscii() {
        // Given
        URL inputUrl = new URL("https://example.com/áthás");
        StringBuilder q = new StringBuilder();

        // When
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        String expectedPath = "áthás";
        urlBuilder.build();

        // Then
        assertEquals(expectedPath, decodePart(urlBuilder.u.getPath()));
    }

    @Test
    public void appendKeyVal_NoExistingQuery() {
        // Given
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder urlBuilder = new UrlBuilder(null);

        // When
        urlBuilder.appendKeyVal(kv);

        // Then
        assertTrue(urlBuilder.q != null && urlBuilder.q.toString().contains(kv.key()));
    }

    @Test
    public void appendKeyVal_ExistingQuery() {
        // Given
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder urlBuilder = new UrlBuilder(null);
        urlBuilder.appendKeyVal(new Connection.KeyVal("key1", "value1"));

        // When
        urlBuilder.appendKeyVal(kv);

        // Then
        assertTrue(urlBuilder.q != null && urlBuilder.q.toString().contains(kv.key() + "&" + kv.value()));
    }

    @Test
    public void normalizeQuery_WithSpaces() {
        // Given
        String q = "key value";
        StringBuilder expected = new StringBuilder("key+value");

        // When
        String normalQ = UrlBuilder.normalizeQuery(q);

        // Then
        assertEquals(expected, normalQ);
    }

    @Test
    public void normalizeRef_WithSpaces() {
        // Given
        String r = "ref with spaces";
        String expected = "%20ref%20with%20spaces";

        // When
        String normalR = UrlBuilder.normalizeRef(r);

        // Then
        assertEquals(expected, normalR);
    }

    @Test
    public void decodePart_WithNonAscii() {
        // Given
        String encoded = "áthás";
        String expected = "áthás";

        // When
        String decoded = UrlBuilder.decodePart(encoded);

        // Then
        assertEquals(expected, decoded);
    }

    @Test
    public void decodePart_WithUnsupportedEncoding() {
        // Given
        String encoded = "áthás";

        // When
        URLDecoder.decode(encoded, "Invalid Encoding");
    }

}