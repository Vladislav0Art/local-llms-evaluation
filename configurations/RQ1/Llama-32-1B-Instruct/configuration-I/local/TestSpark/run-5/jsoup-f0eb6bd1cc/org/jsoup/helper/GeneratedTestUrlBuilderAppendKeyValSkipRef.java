package org.jsoup.helper;

public class GeneratedTestUrlBuilderAppendKeyValSkipRef {

    private UrlBuilder underTest;

    @Test
    public void testUrlBuilderAppendKeyValSkipRef() throws UnsupportedEncodingException {
        String url = "https://example.com/path/to/resource";
        URLBuilder builder = new UrlBuilder(url);
        builder.appendKeyVal(new Connection.KeyVal("key", "value"));
        assert builder.u == null;
    }

}