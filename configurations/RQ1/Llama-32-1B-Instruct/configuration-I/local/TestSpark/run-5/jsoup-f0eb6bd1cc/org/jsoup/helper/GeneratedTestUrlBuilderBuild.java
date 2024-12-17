package org.jsoup.helper;

public class GeneratedTestUrlBuilderBuild {

    private UrlBuilder underTest;

    @Test
    public void testUrlBuilderBuild() throws MalformedURLException, URISyntaxException {
        String url = "https://example.com/path/to/resource?query=value#anchor";
        URLBuilder builder = new UrlBuilder(url);
        URL u = builder.build();
        URI uri = new URI(u.getProtocol(), u.getUserInfo(), IDN.toASCII(decodePart(u.getHost())), u.getPort(), null, null, null);
        assert uri.getScheme().equals("https");
        assert uri.getHost().startsWith("example.com");
        assert uri.getPath().equals("/path/to/resource");
    }

}