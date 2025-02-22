package org.jsoup.helper;

public class GeneratedBuildWithQueryAndRefTest {

    @Test
    public void buildWithQueryAndRefTest() {
        URL inputUrl = new URL("https://example.com/page?param1=value1&param2=value2#fragment");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL expected = new URL("https://example.com/page?param1=value1&param2=value2#fragment");
        URL actual = builder.build();
        assertEquals(expected, actual);
    }

}