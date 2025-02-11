package org.jsoup.helper;

public class GeneratedTestNewUrlBuilderWithValidUrl_BUILDSURL {

    @Test
    public void testNewUrlBuilderWithValidUrl_BUILDSURL() throws MalformedURLException, URISyntaxException {
        String url = "http://example.com/path?query#anchor";
        String protocol = "";
        String host = "example.com";
        String path = "/path";
        String query = "key=value&another+key=anothervalu";

        URL parsedUrl = new URL(url);
        UrlBuilder builder = new UrlBuilder(parsedUrl);

        assertEquals(protocol, builder.u.getProtocol());
        assertEquals(host, builder.u.getHost());
        assertEquals(path, builder.u.getPath());

        assertEquals(query, builder.u.getQuery());
    }

}