package org.jsoup.helper;

public class GeneratedTestUrlBuilderEncodeNonAscii {

    private UrlBuilder underTest;

    @Test
    public void testUrlBuilderEncodeNonAscii() throws UnsupportedEncodingException {
        String url = "https://example.com/path/étoile";
        URLBuilder builder = new UrlBuilder(url);
        StringBuilder normUrl = StringUtil.borrowBuilder();
        builder.appendKeyVal(new Connection.KeyVal("key", "value"));
        assert normUrl.toString().equals("https%3A//example.com/path%20étoile");
    }

}