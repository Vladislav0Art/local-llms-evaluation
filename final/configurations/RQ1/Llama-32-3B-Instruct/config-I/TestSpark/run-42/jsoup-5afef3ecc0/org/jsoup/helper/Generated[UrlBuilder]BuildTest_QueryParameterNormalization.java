package org.jsoup.helper;

public class Generated[UrlBuilder]

BuildTest_QueryParameterNormalization {

    @Test
    public void [UrlBuilder]BuildTest_QueryParameterNormalization() {
        URL inputUrl = new URL("http://example.com/path?+query#fragment");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        String expectedQuery = "query%2B";
        assertEquals(expectedQuery, urlBuilder.u.getQuery());
    }

}