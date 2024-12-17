package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_WithNullKeyAndValue {

    private static final UrlBuilder builder = new UrlBuilder(null);

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

}