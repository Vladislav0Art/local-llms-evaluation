package org.jsoup.helper;

public class GeneratedShouldBuildUrlWithRef {

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

}