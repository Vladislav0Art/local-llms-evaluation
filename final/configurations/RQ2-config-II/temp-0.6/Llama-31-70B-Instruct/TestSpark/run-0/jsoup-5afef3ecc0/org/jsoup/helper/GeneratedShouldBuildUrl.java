package org.jsoup.helper;

public class GeneratedShouldBuildUrl {

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

}