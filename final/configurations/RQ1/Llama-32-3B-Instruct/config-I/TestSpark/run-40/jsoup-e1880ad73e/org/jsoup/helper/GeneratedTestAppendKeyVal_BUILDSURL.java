package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_BUILDSURL {

    @Test
    public void testAppendKeyVal_BUILDSURL() throws MalformedURLException, URISyntaxException {
        String url = "http://example.com/path";
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

        String newQuery = "key=value&another+key=anothervalu";
        builder.appendQuery(newQuery);
        assertEquals(newQuery, builder.u.getQuery());
    }

}