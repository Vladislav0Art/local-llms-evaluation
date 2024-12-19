package org.jsoup.helper;

public class GeneratedTestBuildUrl {

    private static final String NORMALIZED_URL = "https://example.com/path/to/resource?param1=value1&param2=value2#anchor";

    @Test
    public void testBuildUrl() {
        URLBuilder urlBuilder = new UrlBuilder(NORMALIZED_URL);
        assert urlBuilder.u.getProtocol().equals("https");
        assert urlBuilder.u.getUserInfo().equals(null); // null
        assert urlBuilder.u.getHost().equals("example.com");
        assert urlBuilder.u.getPort() == 443;
        assert urlBuilder.u.getPath().equals("/path/to/resource");
        assert urlBuilder.q.toString().isEmpty();
    }

}