package org.jsoup.helper;

public class GeneratedTestBuildNoQuery {

    @Test
    public void TestBuildNoQuery() throws MalformedURLException, URISyntaxException {
        String[] inputs = {"http://example.com/path", "http://example.com/path#with#spaces"};
        for (String input : inputs) {
            UrlBuilder urlBuilder = new UrlBuilder(new URL(input));
            // assertions
        }
    }

}