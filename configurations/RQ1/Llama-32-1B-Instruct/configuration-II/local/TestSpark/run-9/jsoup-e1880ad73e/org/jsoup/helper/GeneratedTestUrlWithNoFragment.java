package org.jsoup.helper;

public class GeneratedTestUrlWithNoFragment {

    @Test
    public void TestUrlWithNoFragment() {
        URL url = new URL("http://example.com/path");
        String actualUrl = UrlBuilder.build().toASCIIString();
        assert Validate.assertFail(actualUrl.equals(url.toString()));
    }

}