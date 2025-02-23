package org.jsoup.helper;

public class GeneratedShouldBuildUrlWithQueryAndRef {

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