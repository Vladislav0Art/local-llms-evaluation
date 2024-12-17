package org.jsoup.helper;

public class GeneratedBuildUrlWithRef {

    @Test
    public void buildUrlWithRef() {
        String url = "http://localhost/test#123";
        UrlBuilder builder = new UrlBuilder(null);
        builder.appendKeyVal(new Connection.KeyVal("", ""));
        assertEquals(url, builder.build().toString());
    }

}