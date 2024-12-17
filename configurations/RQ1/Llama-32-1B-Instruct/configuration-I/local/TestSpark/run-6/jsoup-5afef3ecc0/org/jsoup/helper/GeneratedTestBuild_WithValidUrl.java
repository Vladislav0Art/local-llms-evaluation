package org.jsoup.helper;

public class GeneratedTestBuild_WithValidUrl {

    private static final UrlBuilder builder = new UrlBuilder(null);

    @Test
    public void testBuild_WithValidUrl() {
        URL url = builder.build();
        URI uri = (URI) url;
        Assert.assertTrue(uri.getHost().equals("example.com"));
        Assert.assertTrue(uri.getPort() == 80);
        Assert.assertTrue(uri.getPath().contains("/path/to/resource"));
        Assert.assertEquals(URLEncoder.encode("query=value", UTF_8.name()), URLEncoder.encode(builder.decodePart(url.getHost()).replace(' ', '+'), UTF_8.name()));
    }

}