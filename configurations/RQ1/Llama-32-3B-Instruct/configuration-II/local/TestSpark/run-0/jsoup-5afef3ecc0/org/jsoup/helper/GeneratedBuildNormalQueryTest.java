package org.jsoup.helper;

public class GeneratedBuildNormalQueryTest {

    private UrlBuilder urlBuilder;

    @Before
    public void setup() {
        this.urlBuilder = new UrlBuilder(new URL("http://example.com/path?query=value#ref"));
    }

    @Test
    public void buildNormalQueryTest() throws Exception {
        String expected = "http://example.com/path?query%3Dvalue#ref";
        URL url = urlBuilder.build();
        URI uri = new URI(url.getProtocol(), url.getUserInfo(), uri.getHost(), url.getPort(), uri.getPath(), null, null);
        assertEquals(expected, uri.toASCIIString());
    }

}