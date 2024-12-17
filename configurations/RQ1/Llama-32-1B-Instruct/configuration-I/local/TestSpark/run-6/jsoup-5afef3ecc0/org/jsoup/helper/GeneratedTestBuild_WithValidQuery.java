package org.jsoup.helper;

public class GeneratedTestBuild_WithValidQuery {

    private static final UrlBuilder builder = new UrlBuilder(null);

    @Test
    public void testBuild_WithValidQuery() {
        URL url = builder.build();
        URI uri = (URI) url;
        Assert.assertTrue(uri.getPath().contains("query=value"));
        Assert.assertEquals(URLEncoder.encode(builder.decodePart(url.getHost()).replace(' ', '+'), UTF_8.name()), URLEncoder.encode("value", UTF_8.name()));
    }

}