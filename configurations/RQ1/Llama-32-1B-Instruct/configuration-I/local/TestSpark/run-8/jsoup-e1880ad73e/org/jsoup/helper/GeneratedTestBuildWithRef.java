package org.jsoup.helper;

public class GeneratedTestBuildWithRef {

    @Test
    public void TestBuildWithRef() throws MalformedURLException, URISyntaxException {
        String[] inputs = {"http://example.com/path?query=abc&ref=def", "http://example.com/path#with#spaces"};
        for (String input : inputs) {
            UrlBuilder urlBuilder = new UrlBuilder(new URL(input));
            // assertions
        }
    }

}