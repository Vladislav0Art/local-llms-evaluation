package org.jsoup.helper;

public class GeneratedTestNormalizeRefQuery {

    @Test
    public void testNormalizeRefQuery() {
        UrlBuilder builder = new UrlBuilder(new URL(url));
        assertEquals("https%3Aexample.com%2Fpath#reference", builder.build().toString());
        String originalR = url.replace("#", "");
        assertEquals(originalR, builder.normalizeRef(builder.q).append("#").append(normalizeQuery(builder.q)).append("#");
    }

}