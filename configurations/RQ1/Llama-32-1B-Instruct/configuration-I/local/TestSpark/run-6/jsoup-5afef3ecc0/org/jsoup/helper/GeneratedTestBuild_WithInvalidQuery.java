package org.jsoup.helper;

public class GeneratedTestBuild_WithInvalidQuery {

    private static final UrlBuilder builder = new UrlBuilder(null);

    @Test
    public void testBuild_WithInvalidQuery() {
        URL url = builder.build();
        URI uri = (URI) url;
        Assert.assertTrue(uri.getPath().contains("query"));
        Assert.assertEquals(URLEncoder.encode(builder.decodePart(url.getHost()).replace(' ', '+'), UTF_8.name()), URLEncoder.encode("value", UTF_8.name()));
    }

}