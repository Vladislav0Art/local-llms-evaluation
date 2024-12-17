package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_WithNullQuery {

    private static final UrlBuilder builder = new UrlBuilder(null);

    @Test
    public void testAppendKeyVal_WithNullQuery() {
        String key = "key";
        String value = "value";
        builder.appendKeyVal(null);
        URL url = builder.build();
        URI uri = (URI) url;
        Assert.assertEquals(uri.getHost(), "example.com");
        Assert.assertEquals(uri.getPort(), 80);
        Assert.assertEquals(URLEncoder.encode(builder.decodePart(url.getHost()).replace(' ', '+'), UTF_8.name()), URLEncoder.encode("value", UTF_8.name()));
    }

}