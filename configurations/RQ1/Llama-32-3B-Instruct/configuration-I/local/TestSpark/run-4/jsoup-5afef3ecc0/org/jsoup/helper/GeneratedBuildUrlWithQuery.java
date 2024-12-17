package org.jsoup.helper;

public class GeneratedBuildUrlWithQuery {

    @Test
    public void buildUrlWithQuery() {
        String url = "http://localhost/test?query=abc&ref#123";
        UrlBuilder builder = new UrlBuilder(null);
        builder.appendKeyVal(new Connection.KeyVal("key", "value"));
        assertEquals(url, builder.build().toString());
    }

}