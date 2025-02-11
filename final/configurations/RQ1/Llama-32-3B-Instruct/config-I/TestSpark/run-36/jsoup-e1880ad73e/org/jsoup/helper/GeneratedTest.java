package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void newUrlBuilder_emptyQuery() {
        Connection inputUrl = new Connection();
        inputUrl.setPath("/path/to/resource");
        urlBuilder(inputUrl, "", true);
    }

    @Test
    public void newUrlBuilder_withQuery() {
        Connection inputUrl = new Connection();
        inputUrl.setProtocol("http:");
        inputUrl.setPort(8080);
        inputUrl.setHost("example.co.uk");
        inputUrl.setPath("/path/to/resource?query=param");
        urlBuilder(inputUrl, "http://localhost:8080/path/to/resource", true);
    }

    @Test
    public void newUrlBuilder_withQueryAndFragment() {
        Connection inputUrl = new Connection();
        inputUrl.setProtocol("http:");
        inputUrl.setPort(8080);
        inputUrl.setHost("example.co.uk");
        inputUrl.setPath("/path/to/resource#fragment");
        urlBuilder(inputUrl, "http://localhost:8080/path/to/resource", true);
    }

    @Test
    public void newUrlBuilder_withoutProtocol() {
        Connection inputUrl = new Connection();
        inputUrl.setPort(8080);
        inputUrl.setHost("example.co.uk");
        inputUrl.setPath("/path/to/resource");
        urlBuilder(inputUrl, "", false);
    }

    private void urlBuilder(Connection inputUrl, String protocol, boolean withFragment) {
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL result = builder.build();
        assertEquals(protocol, result.getProtocol());
        assertEquals("", result.getUserInfo());
        assertContains(result.getHost(), "example.co.uk");
        assertEquals(8080, result.getPort());
        if (withFragment) {
            assertEquals("/path/to/resource#fragment", result.getPath());
        } else {
            assertEquals("/path/to/resource", result.getPath());
        }
    }

    @Test
    public void appendKeyVal_noExistingQuery() {
        Connection inputUrl = new Connection();
        inputUrl.setPort(8080);
        urlBuilder(inputUrl, "", true);
        assertNull(inputUrl.getQuery());
    }

    @Test
    public void appendKeyVal_existingQuery() {
        Connection inputUrl = new Connection();
        inputUrl.setProtocol("http:");
        inputUrl.setPort(8080);
        inputUrl.setHost("example.co.uk");
        inputUrl.setPath("/path/to/resource?existing=query");
        urlBuilder(inputUrl, "http://localhost:8080/path/to/resource", true);
        assertEquals("existing=query", inputUrl.getQuery());
    }

    @Test
    public void appendKeyVal_withFragment() {
        Connection inputUrl = new Connection();
        inputUrl.setProtocol("http:");
        inputUrl.setPort(8080);
        inputUrl.setHost("example.co.uk");
        inputUrl.setPath("/path/to/resource#existing=fragment");
        urlBuilder(inputUrl, "http://localhost:8080/path/to/resource", true);
        assertEquals("existing=fragment", inputUrl.getQuery());
    }

    @Test
    public void appendKeyVal_withSpaceInValue() {
        Connection inputUrl = new Connection();
        inputUrl.setProtocol("http:");
        inputUrl.setPort(8080);
        inputUrl.setHost("example.co.uk");
        urlBuilder(inputUrl, "http://localhost:8080/path/to/resource", true);
        assertEquals("existing=query+value", inputUrl.getQuery());
    }

    @Test
    public void decodePart_valid() {
        String encoded = "example.com";
        String decoded = UrlBuilder.decodePart(encoded);
        assertEquals("example.co.uk", decoded, true);
    }

    @Test
    public void decodePart_invalidEncoding() {
        assertThrows(UnsupportedEncodingException.class, () -> UrlBuilder.decodePart(""));
    }

    @Test
    public void appendToAscii_valid() {
        String s = "Hello World";
        StringBuilder result = new StringBuilder();
        UrlBuilder.appendToAscii(s, true, result);
        assertEquals("Hello+World", result.toString());
    }

    @Test
    public void appendToAscii_invalidInput() {
        assertThrows(UnsupportedEncodingException.class, () -> UrlBuilder.appendToAscii("", false, new StringBuilder()));
    }

}