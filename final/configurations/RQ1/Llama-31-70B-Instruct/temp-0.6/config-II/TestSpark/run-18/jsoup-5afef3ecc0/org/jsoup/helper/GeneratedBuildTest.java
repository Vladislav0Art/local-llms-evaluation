package org.jsoup.helper;

public class GeneratedBuildTest {

    @Test
    public void buildTest() {
        URL inputUrl = new URL("https://example.com/page");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL expected = new URL("https://example.com/page");
        URL actual = builder.build();
        assertEquals(expected, actual);
    }

}