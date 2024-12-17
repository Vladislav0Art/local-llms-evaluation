package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void buildUrlWithNullQuery() throws MalformedURLException, URISyntaxException, UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com/path?query=abc&def=ghi#fragment");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertSame(inputUrl, urlBuilder.build());
    }

    @Test
    public void buildUrlWithNonAsciiPath() throws MalformedURLException, URISyntaxException, UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com/þäöü?query=abc&def=ghi#fragment");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        String expectedPath = "thaeo%FCue";
        assertEquals(expectedPath, urlBuilder.u.getPath());
    }

    @Test
    public void buildUrlWithQueryAndFragment() throws MalformedURLException, URISyntaxException, UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com/path?query=abc&def=ghi#fragment");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        String expectedQueryString = "abc%26def=ghi";
        assertEquals(expectedQueryString, urlBuilder.u.getQuery());
    }

    @Test
    public void buildUrlWithPunyCode() throws MalformedURLException, URISyntaxException, UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com/éäöü?query=abc&def=ghi#fragment");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertSame(inputUrl, urlBuilder.build());
    }

    @Test
    public void buildUrlWithMultipleQueries() throws MalformedURLException, URISyntaxException, UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com/path?query1=abc&def=ghi&q2=xyz#fragment");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        String expectedQueryString = "query1=abc&def=ghi&q2=xyz";
        assertEquals(expectedQueryString, urlBuilder.u.getQuery());
    }

    @Test
    public void buildUrlWithMultipleQueriesAndFragment() throws MalformedURLException, URISyntaxException, UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com/path?query1=abc&def=ghi&q2=xyz#fragment");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        String expectedQueryString = "query1=abc&def=ghi&q2=xyz";
        assertEquals(expectedQueryString, urlBuilder.u.getQuery());
    }

    @Test
    public void testBuildUrl() throws Exception {
        URL url = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(url);
        assertEquals("http://example.com", builder.build().toString());
    }

    @Test
    public void testBuildUrlWithQuery() throws Exception {
        URL url = new URL("http://example.com?query=abc&def=ghi");
        UrlBuilder builder = new UrlBuilder(url);
        assertEquals("http://example.com?query=abc&def=ghi", builder.build().toString());
    }

    @Test
    public void testBuildUrlWithQuery() throws Exception {
        URL url = new URL("http://example.com?query=abc&def=ghi");
        UrlBuilder builder = new UrlBuilder(url);
        String expectedQueryString = "query1=" + URLEncoder.encode("abc", "UTF-8") + "&def=" + URLEncoder.encode("ghi", "UTF-8");
        assertEquals(expectedQueryString, builder.build().getQuery());
    }

    @Test
    public void testBuildUrlWithQuery() throws Exception {
        URL url = new URL("http://example.com?query=abc&def=ghi");
        UrlBuilder builder = new UrlBuilder(url);
        String expectedQueryString = "query1=" + URLEncoder.encode("abc", "UTF-8") + "&def=" + URLEncoder.encode("ghi", "UTF-8");
        assertEquals(expectedQueryString, (String) builder.build().getQuery());
    }

}