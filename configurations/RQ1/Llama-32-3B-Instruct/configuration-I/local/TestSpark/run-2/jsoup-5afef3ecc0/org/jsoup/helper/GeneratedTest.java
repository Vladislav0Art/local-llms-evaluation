package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void [
    UrlBuilder_init WithValidUrl]

    Test() {
        URL url = new URL("https://example.com/path?query=value#ref");
        UrlBuilder builder = new UrlBuilder(url);
        assertNotNull(builder.u);
        assertEquals("https://example.com/path", URLConstructor.toString(builder.u));
    }

    @Test
    public void [
    UrlBuilder_init WithInvalidProtocol]

    Test() {
        URL url = new URL("invalid:protocol://example.com/path?query=value#ref");
        UrlBuilder builder = new UrlBuilder(url);
        assertNull(builder.u);
    }

    @Test
    public void [
    UrlBuilder_init WithNoHost]

    Test() {
        URL url = new URL("/path?query=value#ref");
        UrlBuilder builder = new UrlBuilder(url);
        assertNotNull(builder.u);
    }

    @Test
    public void [
    UrlBuilder_build WithoutQueryAndFragment]

    Test() throws MalformedURLException, URISyntaxException {
        URL u = new URL("https://example.com/path");
        UrlBuilder builder = new UrlBuilder(u);
        URI uri = new URI(
                u.getProtocol(),
                u.getUserInfo(),
                IDN.toASCII(decodePart(u.getHost())),
                u.getPort(),
                decodePart(u.getPath())
        );
        assertEquals(new URL(uri.toASCIIString()), builder.u);
    }

    @Test
    public void [
    UrlBuilder_build WithQueryAndFragment]

    Test() throws MalformedURLException, URISyntaxException {
        URL url = new URL("https://example.com/path?query=value#ref");
        UrlBuilder builder = new UrlBuilder(url);
        URI uri = new URI(
                u.getProtocol(),
                u.getUserInfo(),
                IDN.toASCII(decodePart(u.getHost())),
                u.getPort(),
                decodePart(u.getPath())
        );
        assertEquals(new URL(uri.toASCIIString()), builder.u);
    }

    @Test
    public void [
    UrlBuilder_appendKeyVal WithValidKeyAndValue]

    Test() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder(null);
        builder.appendKeyVal(kv);
        assertNotNull(builder.q);
        assertTrue(builder.q.toString().contains("key=value"));
    }

    @Test
    public void [
    UrlBuilder_appendKeyVal WithEmptyQuery]

    Test() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder(null);
        builder.appendKeyVal(kv);
        assertNotNull(builder.q);
        assertTrue(builder.q.toString().contains("&"));
    }

    @Test
    public void [
    UrlBuilder_decodePart WithEncodedString]

    Test() throws UnsupportedEncodingException {
        String encoded = "%40example.com";
        assertEquals("40@example.com", decodePart(encoded));
    }

    @Test
    public void [
    UrlBuilder_normalizeQuery WithValidQuery]

    Test() {
        String query = "query=value";
        assertEquals("+query=value", normalizeQuery(query));
    }

    @Test
    public void [
    UrlBuilder_normalizeRef WithValidRef]

    Test() {
        String ref = "ref=example.com";
        assertEquals("%20ref%3Dexample.com", normalizeRef(ref));
    }

}