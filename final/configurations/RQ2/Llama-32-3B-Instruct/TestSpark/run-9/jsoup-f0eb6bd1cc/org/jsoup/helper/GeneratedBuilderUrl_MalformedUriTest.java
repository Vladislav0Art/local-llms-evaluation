package org.jsoup.helper;

public class GeneratedBuilderUrl_MalformedUriTest {

    @Test
    public void builderUrl_MalformedUriTest() {
        // given
        URL inputUrl = null;
        UrlBuilder builder = new UrlBuilder(inputUrl);

        // when and then
        assertThrows(URISyntaxException.class, () -> builder.build());
    }

}