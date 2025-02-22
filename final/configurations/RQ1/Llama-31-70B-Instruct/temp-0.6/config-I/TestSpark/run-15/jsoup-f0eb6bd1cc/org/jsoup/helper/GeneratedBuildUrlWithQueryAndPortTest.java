package org.jsoup.helper;

public class GeneratedBuildUrlWithQueryAndPortTest {

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() throws MalformedURLException {
        urlBuilder = new UrlBuilder(new URL("http://www.example.com"));
    }

    @Test
    public void buildUrlWithQueryAndPortTest() throws URISyntaxException, MalformedURLException, UnsupportedEncodingException {
        urlBuilder.appendKeyVal(new Connection.KeyVal("key", "value"));
        urlBuilder.u = new URL("http://www.example.com:8080");
        URL expected = new URL("http://www.example.com:8080?key=value");
        URL actual = urlBuilder.build();
        assertEquals(expected, actual);
    }

}