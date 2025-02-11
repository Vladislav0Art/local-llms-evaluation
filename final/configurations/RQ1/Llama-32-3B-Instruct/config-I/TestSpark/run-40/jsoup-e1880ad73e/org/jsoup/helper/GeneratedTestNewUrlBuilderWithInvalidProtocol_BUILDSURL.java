package org.jsoup.helper;

public class GeneratedTestNewUrlBuilderWithInvalidProtocol_BUILDSURL {

    @Test
    public void testNewUrlBuilderWithInvalidProtocol_BUILDSURL() throws MalformedURLException, URISyntaxException {
        String url = "http+/example.com/path";
        String protocol = "";
        String host = "example.com";
        String path = "/path";
        String query = "";

        URL parsedUrl = new URL(url);
        UrlBuilder builder = new UrlBuilder(parsedUrl);

        assertEquals(protocol, builder.u.getProtocol());
        assertEquals(host, builder.u.getHost());
        assertEquals(path, builder.u.getPath());

        assertEquals(query, builder.u.getQuery());
    }

}