package org.jsoup.helper;

public class GeneratedBuildUrl {

    @Test
    public void buildUrl() throws MalformedURLException, URISyntaxException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        String expected = "http://example.com";
        assertEquals(expected, StringUtil.normalizeString(StringUtil.encodeToUTF8(urlBuilder.build().toString())));
    }

}