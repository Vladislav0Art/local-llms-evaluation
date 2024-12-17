package org.jsoup.helper;

public class GeneratedTestAppendKeyVal {

    @Test
    public void testAppendKeyVal() {
        UrlBuilder url = new UrlBuilder("https://example.com/path?query=value#anchor");
        url.appendKeyVal(new KeyVal.Builder().key("param").value("val").build());
        URL normalizedUrl = url.build();
        String expectedNormalizedUrl = "https%3A//example.com/path%3Fquery%2Dev%23anchor";
        assert normalizedUrl.equals(expectedNormalizedUrl);
    }

}