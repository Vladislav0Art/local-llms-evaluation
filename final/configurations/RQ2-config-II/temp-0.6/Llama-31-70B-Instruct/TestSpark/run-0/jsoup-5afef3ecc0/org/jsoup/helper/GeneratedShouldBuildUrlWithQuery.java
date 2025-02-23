package org.jsoup.helper;

public class GeneratedShouldBuildUrlWithQuery {

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

}