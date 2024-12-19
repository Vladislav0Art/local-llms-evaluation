package org.jsoup.helper;

public class GeneratedTestEmptyURL {

    @Test
    public void TestEmptyURL() {
        URL emptyUrl = new URL("");
        String expectedUrl = "";
        String actualUrl = UrlBuilder.build().toASCIIString();
        assert Validate.assertFail(actualUrl.equals(expectedUrl));
    }

}