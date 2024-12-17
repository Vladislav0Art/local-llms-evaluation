package org.jsoup.helper;

public class GeneratedTestUrlBuilderAppendKeyValSkipQuery {

    private UrlBuilder underTest;

    @Test
    public void testUrlBuilderAppendKeyValSkipQuery() throws UnsupportedEncodingException {
        String url = "https://example.com/path/to/resource";
        URLBuilder builder = new UrlBuilder(url);
        builder.appendKeyVal(new Connection.KeyVal("key", "value"));
        assert builder.q == null;
    }

}