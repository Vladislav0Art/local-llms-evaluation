package org.jsoup.helper;

public class GeneratedTestAppendUri {

    @Test
    public void TestAppendUri() throws MalformedURLException, URISyntaxException {
        String[] inputs = {"http://example.com/path?query=abc&fragment=def", "http://example.com/path#with#spaces"};
        for (String input : inputs) {
            UrlBuilder urlBuilder = new UrlBuilder(new URL(input));
            // assertions
        }
    }

}