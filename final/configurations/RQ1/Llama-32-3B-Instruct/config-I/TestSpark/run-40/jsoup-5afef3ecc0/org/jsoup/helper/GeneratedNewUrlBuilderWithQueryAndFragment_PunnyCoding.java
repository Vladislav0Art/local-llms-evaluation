package org.jsoup.helper;

public class GeneratedNewUrlBuilderWithQueryAndFragment_PunnyCoding {

    @Test
    public void newUrlBuilderWithQueryAndFragment_PunnyCoding() throws MalformedURLException, URISyntaxException {
        URL url = new URL("http://example.com?query=string&fragment#ref");
        UrlBuilder builder = new UrlBuilder(url);
        assertEquals("http://example.com", builder.u.getProtocol());
        assertEquals("example.com", builder.u.getHost());
    }

}