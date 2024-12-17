package org.jsoup.helper;

public class GeneratedTestUrlBuilderAppendKeyVal {

    private UrlBuilder underTest;

    @Test
    public void testUrlBuilderAppendKeyVal() throws UnsupportedEncodingException {
        String url = "https://example.com/path/to/resource";
        URLBuilder builder = new UrlBuilder(url);
        builder.appendKeyVal(new Connection.KeyVal("key", "value"));
        assert builder.q.toString().equals("key=value");
    }

}