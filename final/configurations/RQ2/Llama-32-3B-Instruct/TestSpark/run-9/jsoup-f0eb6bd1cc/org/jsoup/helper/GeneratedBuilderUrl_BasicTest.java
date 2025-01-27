package org.jsoup.helper;

public class GeneratedBuilderUrl_BasicTest {

    @Test
    public void builderUrl_BasicTest() {
        // given
        URL inputUrl = new URL("http://localhost/test");
        UrlBuilder builder = new UrlBuilder(inputUrl);

        // when
        URL url = builder.build();

        // then
        assertNotNull(url);
        assertEquals(inputUrl, url);
    }

}