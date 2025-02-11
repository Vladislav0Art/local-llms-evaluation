package org.jsoup.helper;

public class GeneratedNewUrlBuilderWithQueryAndFragment_EmptyQueryAndFragment {

    @Test
    public void newUrlBuilderWithQueryAndFragment_EmptyQueryAndFragment() throws MalformedURLException, URISyntaxException {
        URL url = new URL("http://example.com?query=string&fragment#ref");
        UrlBuilder builder = new UrlBuilder(url);
        assertEquals("http://example.com", builder.u.getProtocol());
        assertEquals("example.com", builder.u.getHost());
    }

}