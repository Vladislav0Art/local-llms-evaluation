package org.jsoup.helper;

public class GeneratedTestBuildWithQuery {

    @Test
    public void TestBuildWithQuery() throws MalformedURLException, URISyntaxException {
        String[] inputs = {"http://example.com/path?query=abc", "http://example.com/path#with#spaces"};
        for (String input : inputs) {
            UrlBuilder urlBuilder = new UrlBuilder(new URL(input));
            // assertions
        }
    }

}