package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void shouldBuildUrl() throws MalformedURLException {
        // given
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        // when
        URL result = urlBuilder.build();

        // then
        assertNotNull(result);
        assertEquals("http://example.com", result.toString());
    }

    @Test
    public void shouldBuildUrlWithQuery() throws MalformedURLException {
        // given
        URL inputUrl = new URL("http://example.com?query=value");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        // when
        URL result = urlBuilder.build();

        // then
        assertNotNull(result);
        assertEquals("http://example.com?query=value", result.toString());
    }

    @Test
    public void shouldBuildUrlWithRef() throws MalformedURLException {
        // given
        URL inputUrl = new URL("http://example.com#ref");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        // when
        URL result = urlBuilder.build();

        // then
        assertNotNull(result);
        assertEquals("http://example.com#ref", result.toString());
    }

    @Test
    public void shouldBuildUrlWithQueryAndRef() throws MalformedURLException {
        // given
        URL inputUrl = new URL("http://example.com?query=value#ref");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        // when
        URL result = urlBuilder.build();

        // then
        assertNotNull(result);
        assertEquals("http://example.com?query=value#ref", result.toString());
    }

}