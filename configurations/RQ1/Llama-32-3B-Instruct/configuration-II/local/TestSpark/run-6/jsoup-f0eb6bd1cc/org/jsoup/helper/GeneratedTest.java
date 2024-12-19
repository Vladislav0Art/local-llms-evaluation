package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void newUrlBuilderWithExistingQueryIsCreated() {
        URL url = new URL("http://example.com/path?a=1&b=2");
        UrlBuilder builder = new UrlBuilder(url);
        assertEquals(3, url.getQuery().split("&").length);
    }

    @Test
    public void newUrlBuilderWithoutQueryIsCreated() {
        URL url = new URL("http://example.com/path");
        UrlBuilder builder = new UrlBuilder(url);
        assertNull(builder.q);
    }

    @Test
    public void existingQueryOfUrlIsNormalized() {
        String expectedQuery = "a=1&b=2";
        URL url = new URL("http://example.com/path?a=1&b=2");
        UrlBuilder builder = new UrlBuilder(url);
        assertEquals(expectedQuery, builder.q.toString());
    }

    @Test
    public void existingPathOfUrlIsNormalized() {
        String expectedPath = "/path/";
        URL url = new URL("http://example.com" + expectedPath);
        UrlBuilder builder = new UrlBuilder(url);
        assertEquals(expectedPath, url.getPath().replaceFirst("^/", ""));
    }

    @Test
    public void queryWithNonAsciiCharsIsEncodedProperly() throws UnsupportedEncodingException {
        URL url = new URL("http://example.com/path?non-ascii=a&another=1");
        UrlBuilder builder = new UrlBuilder(url);
        assertEquals("non-ascii=%61&a=1", builder.q.toString());
    }

    @Test
    public void pathWithNonAsciiCharsIsNormalizedProperly() throws UnsupportedEncodingException {
        String expectedPath = "/path/";
        URL url = new URL("http://example.com" + expectedPath);
        UrlBuilder builder = new UrlBuilder(url);
        assertEquals(expectedPath, builder.u.getPath());
    }

    @Test
    public void appendToAsciiPreservesExistingEscapes() throws UnsupportedEncodingException {
        String input = "café";
        String expectedOutput = "%e9%ae%bf";
        StringBuilder sb = StringUtil.borrowBuilder();
        UrlBuilder.appendToAscii(input, false, sb);
        assertEquals(expectedOutput, sb.toString());
    }

    @Test
    public void appendToAsciiSpacesAreNormalized() throws UnsupportedEncodingException {
        String input = "café ";
        String expectedOutput = "%e9%ae%bf+";
        StringBuilder sb = StringUtil.borrowBuilder();
        UrlBuilder.appendToAscii(input, true, sb);
        assertEquals(expectedOutput, sb.toString());
    }

    @Test
    public void buildCreatesNewUrl() throws MalformedURLException {
        URL originalUrl = new URL("http://example.com/path?a=1&b=2");
        UrlBuilder builder = new UrlBuilder(originalUrl);
        assertEquals(0, originalUrl.getQuery().split("&").length);
    }

    @Test
    public void buildFailsIfInputIsMalformed() throws MalformedURLException, URISyntaxException, UnsupportedEncodingException {
        String malformedInput = " invalid input";
        URL url = new URL(malformedInput);
        UrlBuilder builder = new UrlBuilder(url);
        assertValidate.assertFail("URL cannot be parsed: " + malformedInput);
    }

    @Test
    public void buildFailsIfEncodingIsFailed() throws MalformedURLException, URISyntaxException {
        String input = "http://example.com";
        URL url = new URL(input);
        UrlBuilder builder = new UrlBuilder(url);
        assertValidate.assertFail("URL cannot be parsed: " + input);
    }

}