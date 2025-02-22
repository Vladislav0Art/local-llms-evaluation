package org.jsoup.helper;

public class GeneratedBuildWithQueryTest {

    @Test
    public void buildWithQueryTest() {
        URL inputUrl = new URL("https://example.com/page?param1=value1&param2=value2");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL expected = new URL("https://example.com/page?param1=value1&param2=value2");
        URL actual = builder.build();
        assertEquals(expected, actual);
    }

}