package org.jsoup.helper;

public class GeneratedOfUrlWithQueryAndFragmentBuildsCorrectlyTest {

    @Test
    public void ofUrlWithQueryAndFragmentBuildsCorrectlyTest() {
        URL u = new URL("https://example.com?query=abc&ref=def#frag");
        UrlBuilder builder = new UrlBuilder(u);
        assertEquals(new URL("https://example.com?query=abc%26def#frag"), builder.build());
    }

}