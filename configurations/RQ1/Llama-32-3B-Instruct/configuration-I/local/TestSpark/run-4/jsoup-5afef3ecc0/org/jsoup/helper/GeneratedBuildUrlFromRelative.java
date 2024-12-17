package org.jsoup.helper;

public class GeneratedBuildUrlFromRelative {

    @Test
    public void buildUrlFromRelative() {
        String url = "http://localhost/test";
        UrlBuilder builder = new UrlBuilder(null);
        builder.appendKeyVal(new Connection.KeyVal("", ""));
        assertEquals(url, builder.build().toString());
    }

}