package org.jsoup.helper;

public class GeneratedBuildUrlWithQueryTest {

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() throws MalformedURLException {
        urlBuilder = new UrlBuilder(new URL("http://www.example.com"));
    }

    @Test
    public void buildUrlWithQueryTest() throws URISyntaxException, MalformedURLException, UnsupportedEncodingException {
        urlBuilder.appendKeyVal(new Connection.KeyVal("key", "value"));
        URL expected = new URL("http://www.example.com?key=value");
        URL actual = urlBuilder.build();
        assertEquals(expected, actual);
    }

}