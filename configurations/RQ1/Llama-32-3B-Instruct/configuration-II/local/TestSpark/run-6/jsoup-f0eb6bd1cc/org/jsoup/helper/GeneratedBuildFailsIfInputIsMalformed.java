package org.jsoup.helper;

public class GeneratedBuildFailsIfInputIsMalformed {

    @Test
    public void buildFailsIfInputIsMalformed() throws MalformedURLException, URISyntaxException, UnsupportedEncodingException {
        String malformedInput = " invalid input";
        URL url = new URL(malformedInput);
        UrlBuilder builder = new UrlBuilder(url);
        assertValidate.assertFail("URL cannot be parsed: " + malformedInput);
    }

}