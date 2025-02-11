package org.jsoup.helper;

public class GeneratedOfUrlWithQueryAndFragmentButNoRefBuildsCorrectlyTest {

    @Test
    public void ofUrlWithQueryAndFragmentButNoRefBuildsCorrectlyTest() {
        URL u = new URL("https://example.com?query=abc&ref=def");
        UrlBuilder builder = new UrlBuilder(u);
        assertEquals(new URL("https://example.com?query=abc%26def"), builder.build());
    }

}