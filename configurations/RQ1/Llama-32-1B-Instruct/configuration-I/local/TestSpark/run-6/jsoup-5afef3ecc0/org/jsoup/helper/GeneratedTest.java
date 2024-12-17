package org.jsoup.helper;

public class GeneratedTest {

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

    @Test
    public void testBuild_WithValidQuery() {
        URL url = builder.build();
        URI uri = (URI) url;
        Assert.assertTrue(uri.getPath().contains("query=value"));
        Assert.assertEquals(URLEncoder.encode(builder.decodePart(url.getHost()).replace(' ', '+'), UTF_8.name()), URLEncoder.encode("value", UTF_8.name()));
    }

    @Test
    public void testBuild_WithInvalidQuery() {
        URL url = builder.build();
        URI uri = (URI) url;
        Assert.assertTrue(uri.getPath().contains("query"));
        Assert.assertEquals(URLEncoder.encode(builder.decodePart(url.getHost()).replace(' ', '+'), UTF_8.name()), URLEncoder.encode("value", UTF_8.name()));
    }

    @Test
    public void testAppendKeyVal_WithValidKeyAndValue() {
        String key = "key";
        String value = "value";
        builder.appendKeyVal(new KeyVal(key, value));
        URL url = builder.build();
        URI uri = (URI) url;
        Assert.assertEquals(uri.getHost(), "example.com");
        Assert.assertEquals(uri.getPort(), 80);
        Assert.assertTrue(uri.getPath().contains("key=value"));
    }

    @Test
    public void testAppendKeyVal_WithNullKeyAndValue() {
        String key = null;
        String value = "value";
        builder.appendKeyVal(new KeyVal(key, value));
        URL url = builder.build();
        URI uri = (URI) url;
        Assert.assertEquals(uri.getHost(), "example.com");
        Assert.assertEquals(uri.getPort(), 80);
        Assert.assertTrue(uri.getPath().contains("key=value"));
    }

    @Test
    public void testAppendKeyVal_WithEmptyKeyAndValue() {
        String key = "";
        String value = "";
        builder.appendKeyVal(new KeyVal(key, value));
        URL url = builder.build();
        URI uri = (URI) url;
        Assert.assertEquals(uri.getHost(), "example.com");
        Assert.assertEquals(uri.getPort(), 80);
        Assert.assertTrue(uri.getPath().contains(""));
    }

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

    @Test
    public void testAppendKeyVal_WithEmptyQuery() {
        String key = "key";
        String value = "value";
        builder.appendKeyVal(new KeyVal(key, value));
        URL url = builder.build();
        URI uri = (URI) url;
        Assert.assertEquals(uri.getHost(), "example.com");
        Assert.assertEquals(uri.getPort(), 80);
        Assert.assertEquals(URLEncoder.encode(builder.decodePart(url.getHost()).replace(' ', '+'), UTF_8.name()), URLEncoder.encode("value", UTF_8.name()));
    }

}