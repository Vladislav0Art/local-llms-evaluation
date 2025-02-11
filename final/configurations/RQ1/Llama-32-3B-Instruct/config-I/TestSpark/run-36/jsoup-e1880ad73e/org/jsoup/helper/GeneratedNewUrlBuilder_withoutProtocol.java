package org.jsoup.helper;

public class GeneratedNewUrlBuilder_withoutProtocol {

    @Test
    public void newUrlBuilder_withoutProtocol() {
        Connection inputUrl = new Connection();
        inputUrl.setPort(8080);
        inputUrl.setHost("example.co.uk");
        inputUrl.setPath("/path/to/resource");
        urlBuilder(inputUrl, "", false);
    }

    private void urlBuilder(Connection inputUrl, String protocol, boolean withFragment) {
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL result = builder.build();
        assertEquals(protocol, result.getProtocol());
        assertEquals("", result.getUserInfo());
        assertContains(result.getHost(), "example.co.uk");
        assertEquals(8080, result.getPort());
        if (withFragment) {
            assertEquals("/path/to/resource#fragment", result.getPath());
        } else {
            assertEquals("/path/to/resource", result.getPath());
        }
    }

}