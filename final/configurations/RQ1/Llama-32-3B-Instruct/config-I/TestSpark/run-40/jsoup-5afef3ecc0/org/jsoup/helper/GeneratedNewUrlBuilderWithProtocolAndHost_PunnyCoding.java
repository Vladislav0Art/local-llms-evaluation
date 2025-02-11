package org.jsoup.helper;

public class GeneratedNewUrlBuilderWithProtocolAndHost_PunnyCoding {

    @Test
    public void newUrlBuilderWithProtocolAndHost_PunnyCoding() throws MalformedURLException, URISyntaxException {
        URL url = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(url);
        assertEquals("http://example.com", builder.u.getProtocol());
        assertEquals("example.com", builder.u.getHost());
    }

}