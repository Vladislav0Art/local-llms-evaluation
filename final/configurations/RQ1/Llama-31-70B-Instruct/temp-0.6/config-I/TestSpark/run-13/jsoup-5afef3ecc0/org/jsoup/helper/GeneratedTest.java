package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void testBuild() throws MalformedURLException {
        URL inputUrl = new URL("https://www.example.com/");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL outputUrl = urlBuilder.build();
        assertNotNull(outputUrl);
        assertEquals("https://www.example.com/", outputUrl.toString());
    }

    @Test
    public void testAppendKeyVal() throws UnsupportedEncodingException {
        URL inputUrl = new URL("https://www.example.com/");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(new Connection.KeyVal("key1", "value1"));
        urlBuilder.appendKeyVal(new Connection.KeyVal("key2", "value2"));
        assertNotNull(urlBuilder.q);
        assertEquals("key1=value1&key2=value2", urlBuilder.q.toString());
    }

    @Test
    public void testDecodePart() {
        String encoded = "key1%3Dvalue1%26key2%3Dvalue2";
        String decoded = UrlBuilder.decodePart(encoded);
        assertEquals("key1=value1&key2=value2", decoded);
    }

    @Test
    public void testNormalizeQuery() {
        String query = "key1=value1&key2=value2";
        String normalizedQuery = UrlBuilder.normalizeQuery(query);
        assertEquals("key1=value1&key2=value2", normalizedQuery);
    }

    @Test
    public void testNormalizeRef() {
        String ref = "key1=value1&key2=value2";
        String normalizedRef = UrlBuilder.normalizeRef(ref);
        assertEquals("key1=value1&key2=value2", normalizedRef);
    }

}