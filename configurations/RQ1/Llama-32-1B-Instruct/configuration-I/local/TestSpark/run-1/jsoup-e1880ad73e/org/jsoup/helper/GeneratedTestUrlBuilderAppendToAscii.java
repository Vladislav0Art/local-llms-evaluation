package org.jsoup.helper;

public class GeneratedTestUrlBuilderAppendToAscii {

    @Test
    public void testUrlBuilderAppendToAscii() {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://example.com/path/to/resource"));
        StringBuilder sb = urlBuilder.toBuilder().appendToAscii(StringUtil.borrowBuilder(), true);
        assert !sb.isEmpty();
    }

}