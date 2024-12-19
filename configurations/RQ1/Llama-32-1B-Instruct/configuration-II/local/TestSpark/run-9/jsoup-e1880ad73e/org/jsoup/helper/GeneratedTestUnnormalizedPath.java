package org.jsoup.helper;

public class GeneratedTestUnnormalizedPath {

    @Test
    public void TestUnnormalizedPath() throws UnsupportedEncodingException, MalformedURLException {
        URL unnormalizedUrl = new URL("http://example.com/path with spaces?query=abc");
        String expectedUrl = "http://example.com/path%20with%20spaces%3Fquery%3Abc";
        String actualUrl = UrlBuilder.build().toASCIIString();
        assert Validate.assertFail(actualUrl.equals(expectedUrl));
    }

}